// Source : https://leetcode.com/problems/binary-tree-postorder-traversal/
// Author : Rokas Mitka
// Date   : 2024-07-10

/******************************************************************************************
* Given the root of a binary tree, return the postorder traversal of its nodes' values.
* 
* 
* Example 1:
* 
* Input: root = [1,null,2,3]
* Output: [3,2,1]
* 
* Example 2:
* 
* Input: root = []
* Output: []
* 
* Example 3:
* 
* Input: root = [1]
* Output: [1]
*  
* 
* Constraints:
* 
* The number of the nodes in the tree is in the range [0, 100].
* -100 <= Node.val <= 100
******************************************************************************************/

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
    List<Integer> result = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postOrder(root);
        return result;
    }

    private void postOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        result.add(node.val);
    }
}
