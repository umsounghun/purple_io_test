package com.sounghun.purple_io_test.SelectTest;

import java.util.ArrayList;
import java.util.List;

public class Third_searchFriends {

    static final String [] users = {"Ryan", "Kieran", "Mark"};

     //3.친구_찾기
    public static List<String> searchFriends(String [] users){
    List<String> answer = new ArrayList<>();

        for (String eachUser : users){
        if (eachUser.length() == 4){
            answer.add(eachUser);
        }
    }
   return answer;
}


}
