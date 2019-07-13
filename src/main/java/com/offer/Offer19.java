package com.offer;

/**
 * 题目描述
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 *
 * 输入描述:
 * 二叉树的镜像定义：
 *
 *      源二叉树
 *         8
 *        /  \
 *       6   10
 *      / \  / \
 *     5  7 9 11
 *     镜像二叉树
 *         8
 *        /  \
 *       10   6
 *      / \  / \
 *     11 9 7  5
 * 解题思路
 * 采用先序遍历进行遍历，遇到非叶子节点就交换左右节点，遍历完所有非叶节点就完成了树的镜像
 */
public class Offer19 {
        public static void Mirror(TreeNode root) {
                if(root==null){
                    return ;
                }
                else if(root.left==null&&root.right==null){
                    return;
                }
                else {//交换节点
                    TreeNode temp=root.left;
                    root.left=root.right;
                    root.right=temp;
                }
                Mirror(root.left);
                Mirror(root.right);

        }
        public static void print(TreeNode root){
                if (root==null){
                    return;
                }
            System.out.println(root.val);
                print(root.left);
                print(root.right);
        }
        public static void main(String[] args) {
        TreeNode wx=new TreeNode(1);
        TreeNode wx1=new TreeNode(2);
        TreeNode wx2=new TreeNode(3);
        wx.left=wx1;
        wx.right=wx2;
        print(wx);
        Mirror(wx);
        print(wx);
    }
}
