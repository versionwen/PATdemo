package com.offer;

public class Offer26 {
    TreeNode head=null;
    TreeNode end=null;
    public  TreeNode Convert(TreeNode pRootOfTree){
        ConvertSub(pRootOfTree);
        return head;
    }
    public  void ConvertSub(TreeNode pRootOfTree){
        if(pRootOfTree==null)
            return;
        Convert(pRootOfTree.left);
        if(end==null){
            head=pRootOfTree;
            end=pRootOfTree;
        }
        else{
            end.right=pRootOfTree;
            pRootOfTree.left=end;
            end=pRootOfTree;
        }
        Convert(pRootOfTree.right);
    }
public static void print(TreeNode node){
        if(node==null){
            return;
        }
    System.out.println(node.val);
        print(node.left);
        print(node.right);
}

}
