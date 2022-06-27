package com.sounghun.purple_io_test.SelectTest;

import java.util.ArrayList;
import java.util.List;

public class Fourth_iqTest {

    static final String numbers = "2 4 7 8 10";

    /**
     * 4번쨰 문제
     * 순번의 시작은 0이 아니라 1입니다.
     */
    public static String iqTest (String numbers){
            String answer = null;

            List<Integer> pairList = new ArrayList<>();
            List<Integer> notPairList = new ArrayList<>();

            // 최초 짝수 값
            int pairCheck = 0;
            int pairCheckIndex = 0;
            // 최초 홀수 값
            int notPairCheck = 0;
            int notPairCheckIndex = 0;

            String[] numbersList = numbers.split(" ");
            for (int i = 0; i < numbersList.length; i++) {
                int eachNumbers = Integer.parseInt(numbersList[i]);

                // 짝수이면
                if (eachNumbers % 2 == 0) {
                    pairList.add(eachNumbers);

                    // 짝수가 1개 이상
                    if (pairList.size() == 1) {
                        pairCheckIndex = i + 1;
                        pairCheck = eachNumbers;
                        // 홀수의 갯수가 같을 경우
                    }
                } else {
                    notPairList.add(eachNumbers);

                    if (notPairList.size() == 1) {
                        notPairCheckIndex = i + 1;
                        notPairCheck = eachNumbers;
                    }
                }

                //짝수가 2개 이면
                if (pairList.size() > 1 && notPairList.size() == 1) {
                    answer = notPairCheckIndex + " # " + notPairCheck + "만 홀수";
                    System.out.println(pairList);
                    System.out.println(notPairList);
                    break;
                } else if (notPairList.size() > 1 && pairList.size() == 1) {
                    answer = pairCheckIndex + " # " + pairCheck + "만 짝수";
                    break;
                }


            }


            return answer;
        }
    }
