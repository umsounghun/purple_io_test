package com.sounghun.purple_io_test.RequiredTest;

public class Fourth_plusMinus {

    final int n = 15;

    /**
     * 4.분기_숫자_구하기
     * 조건 1. 10~10000 사이의 숫자를 입력합니다.
     * 조건 2. XYZ - (X+Y+Z) = answer;
     */
    public static int fruitCode(int n) {
        // 10 ~ 10000만 허용
        if (n < 10 || n > 10000) {
            throw new IllegalArgumentException("올바른 값이 아닙니다");
        }

        int answer = n;
        String number = String.valueOf(n);
        char[] numberList = number.toCharArray();

        for (int i = 0; i < numberList.length; i++) {
            answer -= numberList[i];
        }

        return answer;
    }
}



