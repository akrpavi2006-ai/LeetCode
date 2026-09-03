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
import java.util.*;
class Solution {
    public int maxLevelSum(TreeNode root) {
        if (root == null) return 0;
        int maxSum = Integer.MIN_VALUE;
        int maxLevel = 1;
        int currentLevel = 1;        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int currentSum = 0;
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                currentSum += node.val;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
                maxLevel = currentLevel;
            }
            currentLevel++;
        }
        return maxLevel;
    }
}