// Problem Name: 94, Binary Tree InOrder Traversal  
// Link: https://leetcode.com/problems/binary-tree-inorder-traversal/
// Time Complexity : O(n)
// Space Complexity : O(h)
// Technique Used: DFS
// Did this code successfully run on Leetcode for the First time:  Yes
// Did you get the logic without checking the solution: Yes
// Revisit Count: 0
// This problem got referred from: 98
// This problem has reference of : 144, 145, 173, 230, 272, 783	285, 426 

import java.util.*;

public class BiinaryTreeInOrderTraversal94Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode arrayToTree(Integer[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        return arrayToTree(array, 0);
    }

    private TreeNode arrayToTree(Integer[] array, int root) {
        if (root >= array.length) {
            return null;
        }
        return new TreeNode(array[root], arrayToTree(array, (root * 2) + 1), arrayToTree(array, (root * 2) + 2));
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        while (root != null || !s.isEmpty()) {
            while (root != null) {
                s.push(root);
                root = root.left;
            }
            root = s.pop();
            resultList.add(root.val);
            root = root.right;
        }
        return resultList;
    }

    public static void main(String[] args) {
        BiinaryTreeInOrderTraversal94Solution btiot = new BiinaryTreeInOrderTraversal94Solution();

        Integer[] inputArray = { 5, 1, 4, 3, 6 };
        TreeNode inputBinaryTree = btiot.arrayToTree(inputArray);
        System.out.println("For Input1: " + btiot.inorderTraversal(inputBinaryTree).toString());

        Integer[] inputArray2 = { 2, 1, 3 };
        TreeNode inputBinaryTree2 = btiot.arrayToTree(inputArray2);
        System.out.println("For Input2: " + btiot.inorderTraversal(inputBinaryTree2).toString());

    }

}