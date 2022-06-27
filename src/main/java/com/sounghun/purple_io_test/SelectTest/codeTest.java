package com.sounghun.purple_io_test.SelectTest;

import java.util.ArrayList;
import java.util.List;

public class codeTest {

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        int answer = 0;
//
//        char [] charList = str.toCharArray();
//        for (char eachchar : charList){
//            if (eachchar == 'a'){
//                answer++;
//            } else if (eachchar == 'e') {
//                answer++;
//            } else if (eachchar == 'i'){
//                answer++;
//            } else if (eachchar == 'o'){
//                answer++;
//            } else if (eachchar == 'u'){
//                answer++;
//            }
//        }
//
//        System.out.println(answer);
//    }


    //     2번째 문제
    public static void main(String[] args) {
        int[] in = {0, 1, 2};
        int answer = 0;

        answer = in[in.length/2];

        System.out.println(answer);
    }
}

// 3번째 문제
//    public static void main(String[] args) {
//        String [] users = {"Ryan", "Kieran", "Mark"};
//        List<String> answer = new ArrayList<>();
//
//        for (String eachUser : users){
//            if (eachUser.length() == 4){
//                answer.add(eachUser);
//            }
//        }
//        System.out.println(answer);
//    }


//    // 4번쨰 문제
//    public static void main(String[] args) {
//
////        String numbers = "1 1 1 1 2 1 1";
//        String numbers = "2 2 2 2 2 2 2 1 2 2";
//        String answer = null;
//
//        List<Integer> pairList = new ArrayList<>();
//        List<Integer> notPairList = new ArrayList<>();
//
//        // 최초 짝수 값
//        int pairCheck = 0;
//        int pairCheckIndex = 0;
//        // 최초 홀수 값
//        int notPairCheck = 0;
//        int notPairCheckIndex = 0;
//
//        String[] numbersList = numbers.split(" ");
//        for (int i = 0; i < numbersList.length; i++) {
//            int eachNumbers = Integer.parseInt(numbersList[i]);
//
//            System.out.println(eachNumbers + "하고 인덱스" + i);
//
//            // 짝수이면
//            if (eachNumbers % 2 == 0) {
//                pairList.add(eachNumbers);
//
//                // 짝수가 1개 이상
//                if (pairList.size() == 1) {
//                    pairCheckIndex = i + 1;
//                    pairCheck = eachNumbers;
//                    // 홀수의 갯수가 같을 경우
//                }
//            } else {
//                notPairList.add(eachNumbers);
//
//                 if (notPairList.size() == 1) {
//                    notPairCheckIndex = i + 1;
//                    notPairCheck = eachNumbers;
//                }
//            }
//
//            //짝수가 2개 이면
//            if (pairList.size() > 1 && notPairList.size() == 1) {
//                System.out.println(notPairCheckIndex + " # " + notPairCheck + "만 홀수");
//                System.out.println(pairList);
//                System.out.println(notPairList);
//                break;
//            } else if (notPairList.size() > 1 && pairList.size() == 1) {
//                System.out.println(pairCheckIndex + " # " + pairCheck + "만 짝수");
//                System.out.println(pairList);
//                System.out.println(notPairList);
//                break;
//            }
//
//
//        }
//
//
//        System.out.println(answer);
//    }
//}

