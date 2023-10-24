// Source : https://leetcode.com/problems/group-anagrams/
// Author : Rokas Mitka
// Date   : 2023-10-24

/****************************************************************************************************************************************************************
* Given an array of strings strs, group the anagrams together. You can return the answer in any order.
*
* An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
*
* 
*
* Example 1:
*
* Input: strs = ["eat","tea","tan","ate","nat","bat"]
* Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
* Example 2:
*
* Input: strs = [""]
* Output: [[""]]
* Example 3:
*
* Input: strs = ["a"]
* Output: [["a"]]
* 
*
* Constraints:
* 
* 1 <= strs.length <= 104
* 0 <= strs[i].length <= 100
* strs[i] consists of lowercase English letters.
****************************************************************************************************************************************************************/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> groupedAnagrams = new HashMap<>();
        for(String str:strs) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = String.valueOf(charArr);
            if(!groupedAnagrams.containsKey(sortedStr)) {
                groupedAnagrams.put(sortedStr, new ArrayList<>());
            }
            groupedAnagrams.get(sortedStr).add(str);
        }
        return new ArrayList<>(groupedAnagrams.values());
    }
}
