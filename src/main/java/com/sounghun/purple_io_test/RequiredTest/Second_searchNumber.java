package com.sounghun.purple_io_test.RequiredTest;

import java.util.ArrayList;
import java.util.Random;

public class Second_searchNumber {

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

    /**
     * 2.사용하지 않는 가장 작은 숫자 찾기
     * 조건 1. 정렬되지 않는 배열을 넣어도 동작해야 함
     * 조건 2. 중복된 숫자가 있는 경우도 동작해야 함
     */




}
