package ex08;

import java.util.ArrayList;
import java.util.List;

public class Snail08 {

    record Dir(int a, int b) {


    }


    public static void main(String[] args) {

        /*
         * 공통 작업 분리
         * 1줄 만들기
         * 패턴 찾기
         * 모듈화
         * */

        // 1. 초기화
        int n = 0;
        int[][] arr;
        int x = 0, y = 0;
        int num = 0;
        List<Dir> dirs = new ArrayList<>();
        dirs.add(new Dir(0, 1)); // 오른쪽
        dirs.add(new Dir(1, 0)); // 아래쪽
        dirs.add(new Dir(0, -1)); // 왼쪽
        dirs.add(new Dir(-1, 0)); // 위쪽
        Dir dir;
        int index = 0;

        // 2, 2, 2, 1, 1 or 3, 2, 2, 1, 1
        int[] steps = {2, 2, 2, 1, 1};

        // 총 반복 횟수 : 2n - 1 ( n이 3일 때 5, 4일 때 7, 5일 때 9 )
        // 방향은 항상 0부터 3까지 순서대로 반복, 3 다음은 0 ( 0, 1, 2, 3, 0, 1, ... )
        //

        // 2-1. 시작
        n = 3;
        arr = new int[n][n];
        arr[x][y] = ++num;

        // 2-2. 공통 모듈
        for (int k = 0; k < steps.length; k++) {
            dir = dirs.get(index % 4);
            for (int i = 0; i < steps[k]; i++) {
                x = x + dir.a;
                y = y + dir.b;
                arr[x][y] = ++num;
            }
            index++;
        }


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
