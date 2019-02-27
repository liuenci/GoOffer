package com.cier.two;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * https://www.nowcoder.com/practice/7fe2212963db4790b57431d9ed259701?tpId=13&tqId=11175&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * @author liuenci
 */
public class T22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        list.add(root.val);
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.push(root);
        while (!linkedList.isEmpty()){
            TreeNode node = linkedList.pop();

            if (node.left != null) {
                linkedList.add(node.left);
                list.add(node.left.val);
            }
            if (node.right != null) {
                linkedList.add(node.right);
                list.add(node.right.val);
            }
        }
        return list;
    }
}
