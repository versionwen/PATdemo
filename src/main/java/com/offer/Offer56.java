package com.offer;

import java.util.ArrayList;

/*
输入一颗二叉树的根节点和一个整数，
打印出二叉树中结点值的和为输入整数的所有路径。
路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */
public class Offer56 {
    private ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    private ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root == null)
            return result;
        list.add(root.val);
        target -= root.val;
        if(target == 0 && root.left == null && root.right == null)
            result.add(new ArrayList<Integer>(list));
//因为在每一次的递归中，我们使用的是相同的result引用，所以其实左右子树递归得到的结果我们不需要关心，
//可以简写为FindPath(root.left, target)；FindPath(root.right, target)；
//但是为了大家能够看清楚递归的真相，此处我还是把递归的形式给大家展现了出来。
        ArrayList<ArrayList<Integer>> result1 = FindPath(root.left, target);
        ArrayList<ArrayList<Integer>> result2 = FindPath(root.right, target);
      list.remove(list.size()-1);
        return result;
    }

    public static void main(String[] args) {
        TreeNode wx=new TreeNode(1);
        TreeNode wx1=new TreeNode(2);
        TreeNode wx3=new TreeNode(3);
        TreeNode wx4=new TreeNode(4);
        TreeNode wx5=new TreeNode(5);
        TreeNode wx6=new TreeNode(3);
        wx.left=wx1;
        wx.right=wx3;
        wx1.left=wx4;
        wx1.right=wx5;
        wx3.left=wx6;
        Offer56 test=new Offer56();
        System.out.println(test.FindPath(wx,7));
    }
}
