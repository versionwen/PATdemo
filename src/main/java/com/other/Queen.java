package com.other;

public class Queen{

    private static final int SIZE = 8;
    private static int count = 0;

    private static int[][] queen = new int[SIZE][SIZE];

    public static void main(String[] args) {
        for (int i = 0; i < SIZE; i++) {
            place(i, 0);
        }
    }

    /**
     * 第i行的放置
     */
    private static void place(int i, int start) {
        if (i==0 && start== SIZE) {
            System.out.println("结果集已经遍历完毕，共找到结果数为：" + count);
            System.exit(0);
        }
        // 第i行是否放置成功
        boolean rowPlaced = false;
        // 遍历第i行每个位置是否可以放置皇后
        for(int j = start; j < SIZE; j++) {
            if (check(i, j)) {
                queen[i][j] = 1;
                rowPlaced = true;
                // 最后一行放置成功，则得到一个结果，打印结果后从下一位置继续回溯遍历结果集
                if (i== SIZE -1) {
                    count++;
                    printQueen("第" + count + "个结果，从(" + (SIZE-1) + "," + (j+1) + ")继续回溯寻找...");
                    // 去掉已经放置的皇后
                    queen[i][j] = 0;
                    place(i, j+1);
                }
                break;
            }
        }
        // 如果第i行没有放置成功，则回溯到第i-1行（重新放置第i-1行）
        if (!rowPlaced) {
            int index = seek(i - 1);
            reset(i-1, index);
            // 回溯放置第i-1行
            place(i-1, index+1);
            // 直到第i-1行放置成功，再开始放置第i行（最终将所有结果集遍历完毕后，只能使用exit(0)退出程序）
            place(i, 0);
        }
    }

    /// 以下为工具方法，内容单一，浅显易懂
    /**
     * 输出棋盘
     */
    private static void printQueen(String string) {
        System.out.println("---> " + string);
        for (int[] cells : queen) {
            for (int cell : cells) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }

    /**
     * 去掉(i,j)位置已经放置的皇后
     */
    private static void reset(int i, int j) {
        queen[i][j] = 0;
    }

    /**
     * 寻找第i行放置皇后的位置
     */
    private static int seek(int i) {
        for (int j = 0; j < SIZE; j++) {
            if (queen[i][j] == 1) {
                return j;
            }
        }
        return -1;
    }

    /**
     * 检查queen[i][j] 是否可以放置皇后
     */
    private static boolean check(int i, int j) {
        for(int m = 0; m < SIZE; m++) {
            for(int n = 0; n < SIZE; n++) {
                if (queen[m][n]==1) {
                    if (i == m || j == n || Math.abs(i - m) == Math.abs(j - n)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}