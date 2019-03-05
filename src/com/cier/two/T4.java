package com.cier.two;

/**
 * https://www.nowcoder.com/practice/8a19cbe657394eeaac2f6ea9b0f6fcf6?tpId=13&tqId=11157&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * 输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回
 *       1
 *      2  3
 *     4  5 6
 *      7  8
 * @author liuenci
 */
public class T4 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root = reConstructBinaryTree(pre,0,pre.length - 1,in,0,in.length - 1);
        return root;
    }

    private TreeNode reConstructBinaryTree(int[] pre,int startPre, int endPre, int[] in, int startIn, int endIn){
        if (startPre > endPre || startIn > endIn) {
            return null;
        }
        TreeNode root = new TreeNode(pre[startPre]);
        for (int i = startIn; i <= endIn; i++) {
            if (in[i] == pre[startPre]) {
                root.left = reConstructBinaryTree(pre,startPre + 1,startPre + i - startIn, in, startIn, i - 1);
                root.right = reConstructBinaryTree(pre, startPre + 1 + i - startIn, endPre, in, i + 1, endIn);
                break;
            }
        }
        return root;
    }
}
