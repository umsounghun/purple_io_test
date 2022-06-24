package com.sounghun.purple_io_test.RequiredTest;

import java.util.ArrayList;
import java.util.Random;

public class Third_Score {
    static final String [] games = { "4:0", "3:1", "2:0", "3:1", "2:3", "1:3", "0:0", "1:4", "2:4", "3:2"};

    /**
     * 3.승점구하기
     * 조건 1. 10개의 경기 점수를 입력합니다.
     * 조건 2. 0점에서 최대 4점까지 입력합니다.
     */
    public static int score(String [] games) {
        int answer = 0;

        // left의 관점에서의 승점
        for (String result : games) {
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

    /**
     * 랜덤으로 10개 경기를 파싱합니다.
     * 한번 만들어 보았습니다.
      */
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
}
