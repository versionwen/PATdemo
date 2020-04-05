package com.offer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author version
 * @version 1.0
 * @date 2020/4/5 20:53
 */
/*
操作给定的二叉树，将其变换为源二叉树的镜像。
二叉树的镜像定义：源二叉树
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	镜像二叉树
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
 */
public class Offer51 {
    public void Mirror(TreeNode root) {
           if(root==null){
               return;
           }
           TreeNode cur=root.left;
           root.left=root.right;
           root.right=cur;
           Mirror(root.left);
           Mirror(root.right);
    }
    public void print(TreeNode Tree){
        if (Tree!=null){
            System.out.println(Tree.val);
            print(Tree.left);
            print(Tree.right);
        }
    }
    public void result(TreeNode tree){
        Queue<TreeNode>ans=new LinkedList<>();
        TreeNode cur,temp;
        if(tree==null){
            return;
        }
        ans.offer(tree);
        while (!ans.isEmpty()){
            int len=ans.size();
            for(int i=0;i<len;i++){
                cur=ans.poll();
                temp=cur.left;
                cur.left=cur.right;
                cur.right=temp;
                if(cur.left!=null){
                    ans.offer(cur.left);
                }
                if(cur.right!=null){
                    ans.offer(cur.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        TreeNode One=new TreeNode(1);
        TreeNode Two=new TreeNode(2);
        TreeNode Three=new TreeNode(3);
        TreeNode Four=new TreeNode(4);
        One.left=Two;
        One.right=Three;
        Two.left=Four;
        Offer51 wx=new Offer51();
        wx.print(One);
        wx.Mirror(One);
        wx.result(One);
        wx.print(One);
    }
}
