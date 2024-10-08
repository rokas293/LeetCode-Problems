// Source : https://leetcode.com/problems/pascals-triangle-ii/
// Author : Rokas Mitka
// Date   : 2024-07-03

/******************************************************************************************************
* Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
* 
* In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
* 
* 
* Example 1:
* 
* Input: rowIndex = 3
* Output: [1,3,3,1]
* 
* Example 2:
* 
* Input: rowIndex = 0
* Output: [1]
* 
* Example 3:
* 
* Input: rowIndex = 1
* Output: [1,1]
*  
* 
* Constraints:
* 
* 0 <= rowIndex <= 33
******************************************************************************************************/

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        long prev = 1;
        for (int k = 1; k <= rowIndex; k++) {
            long next_val = prev * (rowIndex - k + 1) / k;
            res.add((int) next_val);
            prev = next_val;
        }
        return res;
    }
}
