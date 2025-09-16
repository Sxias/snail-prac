package ex02;

public class Snail02 {
    public static void main(String[] args) {
        int n = 0;
        /*
         * 공통 작업 분리
         *
         *
         * */

        int[][] arr;

        // 1. n = 3일 때 돌아가면서 넣기
        n = 3;
        int num = 0;

        // 2차원 배열 (3x3)
        arr = new int[n][n];

        // hard coding (3x3)

        arr[0][0] = ++num;
        arr[0][1] = ++num;
        arr[0][2] = ++num;
        arr[1][2] = ++num;
        arr[2][2] = ++num;
        arr[2][1] = ++num;
        arr[2][0] = ++num;
        arr[1][0] = ++num;
        arr[1][1] = ++num;

        // 2. n = 4일 때 돌아가면서 넣기
        n = 4;
        arr = new int[n][n];
        num = 0;

        arr[0][0] = ++num;
        arr[0][1] = ++num;
        arr[0][2] = ++num;
        arr[0][3] = ++num;
        arr[1][3] = ++num;
        arr[2][3] = ++num;
        arr[3][3] = ++num;
        arr[3][2] = ++num;
        arr[3][1] = ++num;
        arr[3][0] = ++num;
        arr[2][0] = ++num;
        arr[1][0] = ++num;
        arr[1][1] = ++num;
        arr[1][2] = ++num;
        arr[2][2] = ++num;
        arr[2][1] = ++num;

        // 3. n = 5일 때 돌아가면서 넣기
        n = 5;
        arr = new int[n][n];
        num = 0;

        arr[0][0] = ++num;
        arr[0][1] = ++num;
        arr[0][2] = ++num;
        arr[0][3] = ++num;
        arr[0][4] = ++num;

        arr[1][4] = ++num;
        arr[2][4] = ++num;
        arr[3][4] = ++num;
        arr[4][4] = ++num;

        arr[4][3] = ++num;
        arr[4][2] = ++num;
        arr[4][1] = ++num;
        arr[4][0] = ++num;

        arr[3][0] = ++num;
        arr[2][0] = ++num;
        arr[1][0] = ++num;

        arr[1][1] = ++num;
        arr[1][2] = ++num;
        arr[1][3] = ++num;

        arr[2][3] = ++num;
        arr[3][3] = ++num;

        arr[3][2] = ++num;
        arr[3][1] = ++num;

        arr[2][1] = ++num;

        arr[2][2] = ++num;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("num : " + num);
    }
}
