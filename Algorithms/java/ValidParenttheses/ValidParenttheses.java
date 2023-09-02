// Source : https://leetcode.com/problems/valid-parentheses/
// Author : Rokas Mitka
// Date   : 7/11/20203

/*************************************************************************************
* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
*
* An input string is valid if:
*
* Open brackets must be closed by the same type of brackets.
* Open brackets must be closed in the correct order.
* Every close bracket has a corresponding open bracket of the same type.
* 
*
* Example 1:
*
* Input: s = "()"
* Output: true
* Example 2:
* 
* Input: s = "()[]{}"
* Output: true
* Example 3:
*
* Input: s = "(]"
* Output: false
* 
*
* Constraints:
*
* 1 <= s.length <= 104
* s consists of parentheses only '()[]{}'.
*************************************************************************************/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
}
