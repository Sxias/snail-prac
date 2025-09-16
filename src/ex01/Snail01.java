package ex01;

public class Snail01 {
    public static void main(String[] args) {
        // 1. n = 3일 때 돌아가면서 넣기
        int n1 = 3;

        // 2차원 배열 (3x3)
        int[][] arr1 = new int[n1][n1];

        // hard coding (3x3)
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;

        arr1[1][2] = 4;
        arr1[2][2] = 5;

        arr1[2][1] = 6;
        arr1[2][0] = 7;

        arr1[1][0] = 8;

        arr1[1][1] = 9;

        // 2. n = 4일 때 돌아가면서 넣기
        int n2 = 4;
        int[][] arr2 = new int[n2][n2];

        arr2[0][0] = 1;
        arr2[0][1] = 2;
        arr2[0][2] = 3;
        arr2[0][3] = 4;

        arr2[1][3] = 5;
        arr2[2][3] = 6;
        arr2[3][3] = 7;

        arr2[3][2] = 8;
        arr2[3][1] = 9;
        arr2[3][0] = 10;

        arr2[2][0] = 11;
        arr2[1][0] = 12;

        arr2[1][1] = 13;
        arr2[1][2] = 14;

        arr2[2][2] = 15;

        arr2[2][1] = 16;

        // 3. n = 5일 때 돌아가면서 넣기
        int n3 = 5;
        int[][] arr3 = new int[n3][n3];

        arr3[0][0] = 1;
        arr3[0][1] = 2;
        arr3[0][2] = 3;
        arr3[0][3] = 4;
        arr3[0][4] = 5;

        arr3[1][4] = 6;
        arr3[2][4] = 7;
        arr3[3][4] = 8;
        arr3[4][4] = 9;

        arr3[4][3] = 10;
        arr3[4][2] = 11;
        arr3[4][1] = 12;
        arr3[4][0] = 13;

        arr3[3][0] = 14;
        arr3[2][0] = 15;
        arr3[1][0] = 16;

        arr3[1][1] = 17;
        arr3[1][2] = 18;
        arr3[1][3] = 19;

        arr3[2][3] = 20;
        arr3[3][3] = 21;

        arr3[3][2] = 22;
        arr3[3][1] = 23;

        arr3[2][1] = 24;

        arr3[2][2] = 25;

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.printf("%4d", arr3[i][j]);
            }
            System.out.println();
        }
    }
}
