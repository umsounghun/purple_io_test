package com.sounghun.purple_io_test.SelectTest;

public class First_findCollection {

    static final String str = "abracadabra";

    //1.모음 찾기
    public static int findCollection(String str) {
        int answer = 0;

        char[] charList = str.toCharArray();
        for (char eachchar : charList) {
            if (eachchar == 'a') {
                answer++;
            } else if (eachchar == 'e') {
                answer++;
            } else if (eachchar == 'i') {
                answer++;
            } else if (eachchar == 'o') {
                answer++;
            } else if (eachchar == 'u') {
                answer++;
            }
        }
        return answer;
    }


}
