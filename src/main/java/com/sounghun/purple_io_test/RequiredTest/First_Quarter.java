package com.sounghun.purple_io_test.RequiredTest;

public class First_Quarter {

    final int month = 3;

    // 1.분기_숫자_구하기
    public static int month(int month) {
        int answer = 0;
        // 1 ~ 12월이 아닌 경우
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("올바른 값이 아닙니다");
        }

        if (month % 3 == 0) {
            answer = (month / 3);
        } else {
            answer = (month / 3) + 1;
        }
        return answer;
    }

}
