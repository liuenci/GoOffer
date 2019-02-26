package com.cier.one;

/**
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。
 * 例如， （5，3，7，2，4，6，8）中，
 * 按结点数值大小顺序第三小结点的值为4。
 */
public class T62 {
    int index = 0;
    TreeNode KthNode(TreeNode pRoot, int k) {
        if (null != pRoot){
            TreeNode node = KthNode(pRoot.left,k);
            if (null != node){
                return node;
            }
            index++;
            if (index == k){
                return pRoot;
            }
            node = KthNode(pRoot.right,k);
            if (null != node){
                return node;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        TreeNode node1 = new TreeNode(6);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(7);
        root.left = node1;
        node1.left = node2;
        node1.right = node3;
        new T62().KthNode(root,2);
        System.out.println("end");
    }
}
