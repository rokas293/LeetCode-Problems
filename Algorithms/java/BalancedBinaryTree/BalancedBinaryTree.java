// Source : https://leetcode.com/problems/balanced-binary-tree/
// Author : Rokas Mitka
// Date   : 2024-06-29

/*************************************************************************************************
* Given a binary tree, determine if it is height-balanced.
* 
* 
* Example 1:
* 
* Input: root = [3,9,20,null,null,15,7]
* Output: true
* 
* Example 2:
* 
* Input: root = [1,2,2,3,3,null,null,4,4]
* Output: false
* 
* Example 3:
* 
* Input: root = []
* Output: true
*  
* 
* Constraints:
* 
* The number of nodes in the tree is in the range [0, 5000].
* -104 <= Node.val <= 104
*************************************************************************************************/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        height(root);
        return flag;
    }
    
    public int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = height(node.left);
        int right = height(node.right);
        int diff = Math.abs(left - right);
        if (diff > 1) {
            flag = false;
        }
        return 1 + Math.max(left, right);
    }
}
