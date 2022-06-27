package com.sounghun.purple_io_test.RequiredTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeTest {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int month = Integer.parseInt(br.readLine());

        int answer = 0;
        // 1 ~ 12월이 아닌 경우
        if (month < 1 || month > 12) { // 신고 누적시 처리 진행
            throw new IllegalArgumentException("올바른 값이 아닙니다");
        }

        if (month % 3 == 0) {
            answer = (month / 3);
        } else {
            answer = (month / 3) + 1;
        }

        System.out.println(answer);
    }

    // 2번째 문제
//    public static void main(String[] args) {
//        int[] nums = {6, 1, 2, 2, 4, 5, 0};
//
//        int left = 0, right = nums.length - 1;
//        System.out.println("The smallest missing element is "
//                + findSmallestMissing(nums, left, right));
//    }
//
//    public static int findSmallestMissing(int[] nums, int left, int right) {
//        // 기본 조건
//        if (left > right) {
//            return left;
//        }
//
//        int mid = left + (right - left) / 2;
//
//        // 중간 인덱스가 값과 일치하면 불일치
//        // 오른쪽 절반에 위치
//        if (nums[mid] == mid) {
//            return findSmallestMissing(nums, mid + 1, right);
//        } else {
//            // 불일치는 왼쪽 절반에 있습니다.
//            return findSmallestMissing(nums, left, mid - 1);
//        }
//    }

// 3번째 문제
//    public static void main(String[] args) {
//        int answer = 0;
//
//        // left의 관점에서의 승점
//        for (String result : rendomScore()){
//            int left = Integer.parseInt(result.split(":")[0]);
//            int right = Integer.parseInt(result.split(":")[1]);
//
//            // 올바른 값인지 체크
//            checkScore(left);
//            checkScore(right);
//
//            if (left < right){
//                answer += 0;
//            } else if (left == right) {
//                answer += 1;
//            } else {
//                answer += 3;
//            }
//        }
//        System.out.println(answer);
//        System.out.println(games[0]);
//    }
//
//    public static void checkScore(int scoreNum) {
//        if (scoreNum < 0 || scoreNum > 4){
//            throw new IllegalArgumentException ("올바른 값이 아닙니다.");
//        }
//    }
//
//    // 파싱합니다.
//    public static ArrayList<String> rendomScore() {
//        Random random = new Random();
//        random.setSeed(System.currentTimeMillis());
//
//        // 0에서 부터 4까지 램덤스코어를 만들어서 10개의 경에대한 값을 파싱합니다.
//        ArrayList<String> scoreList =new ArrayList<>();
//        for (int i =0; i < 10; i++){
//            String scoreResult =  random.nextInt(5) + ":" + random.nextInt(5);
//            scoreList.add(scoreResult);
//        }
//        System.out.println(scoreList);
//        return scoreList;
//    }
//
//
//    static final String [] games = { "4:0", "3:1", "2:0", "3:1", "2:3", "1:3", "0:0", "1:4", "2:4", "3:2"};
//
//}


// 4번쨰 문제
//    public static void main(String[] args) {
//        int n = 5;
//
//        /**
//         * 4.분기_숫자_구하기
//         * 조건 1. 10~10000 사이의 숫자를 입력합니다.
//         * 조건 2. XYZ - (X+Y+Z) = answer;
//         */
//
//        // 1 ~ 12월이 아닌 경우
//        if (n < 10 || n > 10000) {
//            throw new IllegalArgumentException("올바른 값이 아닙니다");
//        }
//
//        int answer = n;
//        String number = String.valueOf(n);
//        char[] numberList = number.toCharArray();
//
//        for (int i = 0; i < numberList.length; i++) {
//            answer -= Character.getNumericValue(numberList[i]);
//            System.out.println(numberList[i]);
//        }
//        System.out.println(answer);
//    }
//}
}