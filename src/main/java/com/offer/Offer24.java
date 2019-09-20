package com.offer;

public class Offer24 {
    public static boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence.length == 0) {
            return false;
        }
        if (sequence.length == 1) {
            return true;
        }
        return judge( sequence,0,sequence.length-1);
    }
        public static boolean judge(int[] sequence,int start,int root){
            if(start>=root){
                return true;
            }
            int i=start;
            while(i<root&&sequence[i]<sequence[root]){
                i++;

            }
            for(int j=i;j<root;j++){
                if(sequence[j]<sequence[root]){
                    return false;
                }
            }
            return (judge(sequence,start,i-1))&&(judge(sequence,i,root-1));
        }

    public static void main(String[] args) {
        TreeNode oneNode=new TreeNode(12);
        TreeNode twoNode=new TreeNode(5);
        TreeNode threeNode=new TreeNode(18);
        TreeNode fourNode=new TreeNode(2);
        TreeNode fiveNode=new TreeNode(9);
        TreeNode sixNode=new TreeNode(15);
        TreeNode sevenNode=new TreeNode(19);
        oneNode.left=twoNode;
        oneNode.right=threeNode;
        twoNode.left=fourNode;
        twoNode.right=fiveNode;
        threeNode.left=sixNode;
        threeNode.right=sevenNode;
        int[]test={2,9,5,15,19,18,12};
        boolean res = VerifySquenceOfBST(test);
        System.out.println(res);
    }
    }

