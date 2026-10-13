# Source : https://leetcode.com/problems/largest-rectangle-in-histogram/
# Author : Rokas Mitka
# Date   : 2026-10-13

# *******************************************************************************************************************************************************************************************
# Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.
#
#
# Example 1:
#
#
# Input: heights = [2,1,5,6,2,3]
# Output: 10
# Explanation: The above is a histogram where width of each bar is 1.
# The largest rectangle is shown in the red area, which has an area = 10 units.
# Example 2:
#
#
# Input: heights = [2,4]
# Output: 4
# 
#
# Constraints:
#
# 1 <= heights.length <= 105
# 0 <= heights[i] <= 104
# *******************************************************************************************************************************************************************************************

class Solution:
    def largestRectangleArea(self, heights: list[int]) -> int:
        best = 0
        stack = []
        for i, h in enumerate(heights + [0]):
            while stack and heights[stack[-1]] > h:
                j = stack.pop()
                height = heights[j]
                if not stack:
                    width = i
                else:
                    width = i - stack[-1] - 1
                best = max (best, height * width)
            stack.append(i)
    
        return best
