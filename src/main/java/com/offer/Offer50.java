package com.offer;

/**
 * @author version
 * @version 1.0
 * @date 2020/3/31 22:18
 */
/*
输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class Offer50 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
            if(root1==null||root2==null){
                return false;
            }
            return judgeSubTree(root1,root2)||judgeSubTree(root1.right,root2)||judgeSubTree(root1.left,root2);
    }
    private boolean judgeSubTree(TreeNode root1,TreeNode root2){
        if(root2==null){
            return true;
        }
        if(root1==null){
            return false;
        }
        if (root1.val!=root2.val){
            return false;
        }
        return judgeSubTree(root1.left,root2.left)&&judgeSubTree(root1.right,root2.right);
    }

    public static void main(String[] args) {
        TreeNode one=new TreeNode(1);
        TreeNode two=new TreeNode(2);
        TreeNode three=new TreeNode(3);
        TreeNode four=new TreeNode(4);
        one.left=two;
        one.right=three;
        two.left=four;
        TreeNode one1=new TreeNode(1);
        TreeNode two1=new TreeNode(2);
        TreeNode three1=new TreeNode(3);
        TreeNode four1=new TreeNode(4);
        two1.left=four;
        Offer50 wx=new Offer50();
        System.out.println(wx.HasSubtree(one,one1));
    }
}
