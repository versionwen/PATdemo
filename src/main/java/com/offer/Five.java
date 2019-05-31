package com.offer;

/**
 * 题目描述
 * 输入某二叉树的前序遍历和中序遍历的结果，
 * 请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
 * 则重建二叉树并返回。
 *
 * 解题思路
 * 我们知道，前序遍历的第一个节点就是树的根节点，
 * 所以我们先根据前序遍历序列的第一个数字创建根结点，
 * 接下来在中序遍历序列中找到根结点的位置，根节点的左边就是左子树，
 * 右边就是右子树，这样就能确定左、右子树结点的数量。
 * 在前序遍历和中序遍历的序列中划分了左、右子树结点的值之后，
 * 就可以递归地去分别构建它的左右子树。
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Five {
    public TreeNode reConstructBinaryTree(int [] preOrder,int [] inOrder)
    {
        int pLen = preOrder.length;
        int iLen = inOrder.length;
        if(pLen==0 && iLen==0)
        {
            return null;
        }
        return  btConstruct( preOrder, inOrder, 0, pLen-1,0, iLen-1);
    }
    //构建方法，pStart和pEnd分别是前序遍历序列数组的第一个元素和最后一个元素；
    //iStart和iEnd分别是中序遍历序列数组的第一个元素和最后一个元素。
    public TreeNode btConstruct(int[] preOrder, int[] inOrder, int pStart, int pEnd,int iStart,int iEnd)
    {
        //建立根节点
        TreeNode tree = new TreeNode(preOrder[pStart]);
        tree.left = null;
        tree.right = null;
        if(pStart == pEnd && iStart == iEnd)
        {
            return tree;
        }
        int root = 0;
        //找中序遍历中的根节点
        for(root=iStart; root<iEnd; root++)
        {
            if(preOrder[pStart] == inOrder[root])
            {
                break;
            }
        }
        //划分左右子树
        int leftLength = root - iStart;//左子树
        int rightLength = iEnd - root;//右子树
        //遍历左子树
        if(leftLength>0)
        {
            tree.left = btConstruct(preOrder, inOrder,  pStart+1,  pStart+leftLength, iStart, root-1);
        }
        //遍历右子树
        if(rightLength>0)
        {
            tree.right = btConstruct(preOrder, inOrder,  pStart+leftLength+1,  pEnd, root+1, iEnd);
        }
        return tree;
    }

    /**
     * 后序遍历二叉树
     * @param root
     */
    public static void printPostOrder(TreeNode root) {
        if (root != null) {
            printPostOrder(root.right);
            printPostOrder(root.left);
            System.out.println(root.val);
        }
    }
    public static void main(String[] args) {
        int[] preOrder={1,2,4,7,3,5,6,8};
        int[] inOrder={4,7,2,1,5,3,8,6};
        Five newTree=new Five();
        TreeNode treeNode = newTree.reConstructBinaryTree(preOrder, inOrder);
        printPostOrder(treeNode);
    }
}

