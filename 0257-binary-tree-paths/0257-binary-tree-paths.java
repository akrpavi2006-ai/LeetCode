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
 /*
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        findPaths(root,"",result);
        return result;
    }
    public void findPaths(TreeNode root,String path,List<String> result){
        path+=root.val;
        if (root.left == null && root.right == null) {
            result.add(path);
            return;
        }
        if (root.left != null) {
            findPaths(root.left, path + "->", result);
        }
        if (root.right != null) {
            findPaths(root.right, path + "->", result);
        }
    }
}
*/
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        dfs(root, "", list);
        return list;
    }
    void dfs(TreeNode root, String s, List<String> list) {
        if (root == null) {
            return;
        }
        s += root.val;
        if (root.left == null && root.right == null) {
            list.add(s);
            return;
        }
        s = s + "->";
        dfs(root.left, s, list);
        dfs(root.right, s, list);
    }
}
