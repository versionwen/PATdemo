package com.offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author version
 * @version 1.0
 * @date 2020/4/29 22:16
 */
/*从上往下打印出二叉树的每个节点，同层节点从左至右打印。*/
public class Offer55 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer>result=new ArrayList<Integer>();
        if(root==null){
            return result;
        }
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
           TreeNode temp=queue.poll();
           result.add(temp.val);
           if (temp.left!=null){
               queue.offer(temp.left);
           }
           if(temp.right!=null){
               queue.offer(temp.right);
           }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode wx=new TreeNode(1);
        TreeNode wx1=new TreeNode(2);
        TreeNode wx3=new TreeNode(3);
        TreeNode wx4=new TreeNode(4);
        TreeNode wx5=new TreeNode(5);
        wx.left=wx1;
        wx.right=wx3;
        wx1.left=wx4;
        wx1.right=wx5;
        Offer55 t=new Offer55();
        System.out.println(t.PrintFromTopToBottom(wx));
    }
}
