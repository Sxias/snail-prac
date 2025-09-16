package ex06;

import java.util.ArrayList;
import java.util.List;

public class Snail06 {

    record Dir(int a, int b) {


    }


    public static void main(String[] args) {
        int n = 0;
        /*
         * 공통 작업 분리
         * 1줄 만들기
         * 패턴 찾기
         * 모듈화
         * */

        int[][] arr;
        int x = 0, y = 0;

        // 1. n = 3일 때 돌아가면서 넣기
        n = 3;
        int num = 0;

        // 2차원 배열 (3x3)
        arr = new int[n][n];

        // hard coding (3x3)
        // [y++ 2,x++ 2,y-- 2,x-- 1,y++ 1]

        List<Dir> dirs = new ArrayList<>();
        dirs.add(new Dir(0, 1)); // 오른쪽
        dirs.add(new Dir(1, 0)); // 아래쪽
        dirs.add(new Dir(0, -1)); // 왼쪽
        dirs.add(new Dir(-1, 0)); // 위쪽


        // exception : 시작은 항상 1
        // 0, 0

        arr[x][y] = ++num;

        Dir dir;
        int index = 0;
        int[] steps = {2, 2, 2, 1, 1};
        // 총 반복 횟수 : 2n - 1 ( n이 3일 때 5, 4일 때 7, 5일 때 9 )
        // 방향은 항상 0부터 3까지 순서대로 반복, 3 다음은 0 ( 0, 1, 2, 3, 0, 1, ... )
        //

        // y 2 증가----------------------
        dir = dirs.get(index % 4);
        for (int i = 0; i < steps[0]; i++) {
            x = x + dir.a;
            y = y + dir.b;
            arr[x][y] = ++num;
        }
        index++;
        // y 2 증가----------------------

        // x 2 증가----------------------
        // 1, 2
        dir = dirs.get(index % 4);
        for (int i = 0; i < steps[index]; i++) {
            x = x + dir.a;
            y = y + dir.b;
            arr[x][y] = ++num;
        }
        index++;
        // x 2 증가----------------------

        // y 2 감소----------------------
        // 2, 1
        dir = dirs.get(index % 4);
        for (int i = 0; i < steps[index]; i++) {
            x = x + dir.a;
            y = y + dir.b;
            arr[x][y] = ++num;
        }
        index++;
        // y 2 감소----------------------

        // x 1 감소----------------------
        // 1, 0
        dir = dirs.get(index % 4);
        for (int i = 0; i < steps[index]; i++) {
            x = x + dir.a;
            y = y + dir.b;
            arr[x][y] = ++num;
        }
        index++;
        // x 1 감소----------------------

        // y 1 증가----------------------
        // 1, 1
        dir = dirs.get(index % 4);
        for (int i = 0; i < steps[index]; i++) {
            x = x + dir.a;
            y = y + dir.b;
            arr[x][y] = ++num;
        }
        index++;
        // y 1 증가----------------------

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
