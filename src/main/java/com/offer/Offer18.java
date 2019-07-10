package com.offer;

/**
 * 题目描述
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * 解题思路
 * 1.先设置一个标志来判断是否是子树结构，如果是子结构停止遍历，如果不是继续遍历
 * 2.调用trave（），如果根节点不同，判断左子树，相同判断右子树
 * 当两棵树都不为空的时候才进行判断
 * 当tree2为空，说明遍历tree2完成，tree2是tree1的子树
 * 当tree1为空有如下情况
 * （1）tree1和tree2都为空那么tree2是tree1的子树
 * （2）tree1为空tree2不为空，那么tree2不是tree1的子树
 */
public class Offer18 {
    public static boolean HasSubtree(TreeNode root1,TreeNode root2){
            boolean flag=false;
            //判断根节点情况
            if(root1.val==root2.val){
                flag=Trave(root1,root2);
            }
            //根节点不相同去tree1左子树找
            else if (!flag){
                flag=HasSubtree(root1.left,root2);
            }
            //去右边找
            else if (!flag){
                flag=HasSubtree(root1.right,root2);
            }
            return flag;
    }
    public static boolean Trave(TreeNode root1,TreeNode root2){
        if (root2==null){
            return true;
        }
        else if(root1==null){
            return false;
        }
        else if(root1.val!=root2.val){
            return false;
        }
        else {
           return Trave(root1.left,root2.left)&&Trave(root1.right,root2.right);
        }
    }

    public static void main(String[] args) {
        TreeNode wx=new TreeNode(1);
        TreeNode wx1=new TreeNode(2);
        TreeNode wx2=new TreeNode(3);
        wx.left=wx1;
        wx.right=wx2;
        TreeNode w=new TreeNode(1);
        TreeNode w1=new TreeNode(2);
        TreeNode w2=new TreeNode(3);
        w.left=w1;
        w.right=w2;
        boolean b = HasSubtree(wx, w);
        System.out.println(b);
    }
}
