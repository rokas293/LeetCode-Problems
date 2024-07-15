// Source : https://leetcode.com/problems/majority-element/
// Author : Rokas Mitka
// Date   : 2024-07-15

/************************************************************************************************************************************************************
* Given an array nums of size n, return the majority element.
* 
* The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
* 
* 
* Example 1:
* 
* Input: nums = [3,2,3]
* Output: 3
* 
* Example 2:
* 
* Input: nums = [2,2,1,1,1,2,2]
* Output: 2
*  
* 
* Constraints:
* 
* n == nums.length
* 1 <= n <= 5 * 104
* -109 <= nums[i] <= 109
************************************************************************************************************************************************************/

class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
        int majority = 0;

        for (int n : nums) {
            if (majority == 0) {
                res = n;
            }

            majority += n == res ? 1 : -1;
        }

        return res;
    }
}
