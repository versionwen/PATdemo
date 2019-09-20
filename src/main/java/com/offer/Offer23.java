package com.offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Offer23 {
    public static ArrayList<Integer>PrintFromTopToBottom(TreeNode root){
        ArrayList<Integer>res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode>queue=new LinkedList<TreeNode>();
        queue.add(root);
        while (queue.size()!=0){
            root=queue.remove();
            res.add(root.val);
            if(root.left!=null){
                queue.add(root.left);
            }
            if(root.right!=null){
                queue.add(root.right);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode oneNode=new TreeNode(1);
        TreeNode twoNode=new TreeNode(2);
        TreeNode threeNode=new TreeNode(3);
        TreeNode fourNode=new TreeNode(4);
        TreeNode fiveNode=new TreeNode(5);
        oneNode.left=twoNode;
        oneNode.right=threeNode;
        twoNode.left=fourNode;
        twoNode.right=fiveNode;
        ArrayList<Integer> result = PrintFromTopToBottom(oneNode);
        System.out.println(result);
    }
}
