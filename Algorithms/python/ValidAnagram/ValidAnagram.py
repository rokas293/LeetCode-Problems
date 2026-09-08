# Source : https://leetcode.com/problems/valid-anagrams/
# Author : Rokas Mitka
# Date   : 2026-09-08

# ***************************************************************************************************
# Given two strings s and t, return true if t is an anagram of s, and false otherwise.
#  
#
# Example 1:
#
# Input: s = "anagram", t = "nagaram"
#
# Output: true
#
# Example 2:
#
# Input: s = "rat", t = "car"
#
# Output: false
#
# 
#
# Constraints:
#
# 1 <= s.length, t.length <= 5 * 104
# s and t consist of lowercase English letters.
# ***************************************************************************************************

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        count_s = {}
        count_t = {}

        if len(s) != len(t):
            return False
        
        for letter in s:
            if letter in count_s:
                count_s[letter] += 1
            else:
                count_s[letter] = 1
        
        for letter in t:
            if letter in count_t:
                count_t[letter] += 1
            else:
                count_t[letter] = 1
        
        return count_s == count_t
