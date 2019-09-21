package com.offer;

import java.util.ArrayList;

public class Offer25 {
    ArrayList<ArrayList<Integer>>res=new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer>temp=new ArrayList<>();
    public ArrayList<ArrayList<Integer>>FindPath(TreeNode root,int target){
        if(root==null){
            return res;
        }
        target-=root.val;
        temp.add(root.val);
        if(target==0&&root.left==null&&root.right==null){//如果结果是叶子节点并且节点的值等于输入的数据的值
            res.add(new ArrayList<Integer>(temp));
        }
        else{
            FindPath(root.left,target);
            FindPath(root.right,target);
        }
        temp.remove(temp.size()-1);
        return res;
    }

    public static void main(String[] args) {
        TreeNode oneNode=new TreeNode(1);
        TreeNode twoNode=new TreeNode(2);
    }
}
