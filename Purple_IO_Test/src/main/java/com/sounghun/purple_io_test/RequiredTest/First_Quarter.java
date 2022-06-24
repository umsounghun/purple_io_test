package com.sounghun.purple_io_test.RequiredTest;

import java.util.ArrayList;
import java.util.Random;

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

    /**
     * 2.사용하지 않는 가장 작은 숫자 찾기
     * 조건 1. 정렬되지 않는 배열을 넣어도 동작해야 함
     * 조건 2. 중복된 숫자가 있는 경우도 동작해야 함
     */

    final String [] scoreList = { "3:1", "2:2", "1:3" };


    // 랜덤으로 10개 경기를 파싱합니다.
    public static ArrayList<String> rendomScore() {
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        // 0에서 부터 4까지 램덤스코어를 만들어서 10개의 경에대한 값을 파싱합니다.
        ArrayList<String> scoreList =new ArrayList<>();
        for (int i =0; i < 10; i++){
            String scoreResult =  random.nextInt(5) + ":" + random.nextInt(5);
            scoreList.add(scoreResult);
        }

        System.out.println("랜덤 스코어 : " + scoreList);
        return scoreList;
    }

    /**
     * 3.승점구하기
     * 조건 1. 10개의 경기 점수를 입력합니다.
     * 조건 2. 0점에서 최대 4점까지 입력합니다.
     */
    public static int score(String [] scoreList) {
        int answer = 0;

        // left의 관점에서의 승점
        for (String result : scoreList) {
            int left = Integer.parseInt(result.split(":")[0]);
            int right = Integer.parseInt(result.split(":")[1]);

            if (left < right) {
                answer += 0;
            } else if (left == right) {
                answer += 1;
            } else {
                answer += 3;
            }
        }
       return answer;
    }




}
