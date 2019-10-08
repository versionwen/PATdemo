package com.offer;

public class Offer37 {
    public static int TreeDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=TreeDepth(root.left);
        int right=TreeDepth(root.right);
        return Math.max(left,right)+1;
    }

    public static void main(String[] args) {
        TreeNode one=new TreeNode(1);
        TreeNode two=new TreeNode(2);
        TreeNode three=new TreeNode(3);
        TreeNode four=new TreeNode(4);
        one.left=two;
        one.right=three;
        two.left=four;
        System.out.println(TreeDepth(one));
    }
}
