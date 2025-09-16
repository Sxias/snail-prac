package ex07;

import java.util.ArrayList;
import java.util.List;

public class Snail07 {

    record Dir(int a, int b) {


    }

    public static int[] makeSteps(int n) {

        int size = 2 * n - 1;
        int[] steps = new int[size];

        steps[0] = n - 1;
        for (int i = 1; i < steps.length; i = i + 2) {
            steps[i] = n - 1;
            if (i + 1 == steps.length) break;
            steps[i + 1] = steps[i];
            n--;
        }

        for (int i = 0; i < steps.length; i++) {
            System.out.println(steps[i]);
        }

        return steps;
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

        // 총 반복 횟수 : 2n - 1 ( n이 3일 때 5, 4일 때 7, 5일 때 9 )
        // 방향은 항상 0부터 3까지 순서대로 반복, 3 다음은 0 ( 0, 1, 2, 3, 0, 1, ... )
        //

        // 2-1. 시작
        n = 6;
        int[] steps = makeSteps(n);

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

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("num : " + num);
    }
}
