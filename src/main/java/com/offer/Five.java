package com.offer;

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

