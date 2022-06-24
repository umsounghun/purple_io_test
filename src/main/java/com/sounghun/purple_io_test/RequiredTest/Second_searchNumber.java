package com.sounghun.purple_io_test.RequiredTest;

public class Second_searchNumber {

    static final int [] ids = {0,1,2,3,4,5,6};

    /**
     * 2.사용하지_않는_가장_작은_숫자_찾기
     * 정렬되지 않는 배열을 넣어도 동작해야함
     * 중복된 숫자가 있는 경우도 동작해야함
      */
    public static void searchMissNum (int[] ids) {
        int left = 0, right = ids.length - 1;
        System.out.println("The smallest missing element is "
                + findSmallestMissing(ids, left, right));
    }

    public static int findSmallestMissing(int[] ids, int left, int right) {
        // 기본 조건
        if (left > right) {
            return left;
        }

        int mid = left + (right - left) / 2;

        // 중간 인덱스가 값과 일치하면 불일치
        // 오른쪽 절반에 위치
        if (ids[mid] == mid) {
            return findSmallestMissing(ids, mid + 1, right);
        }
        else {
            // 불일치는 왼쪽 절반에 있습니다.
            return findSmallestMissing(ids, left, mid - 1);
        }
    }


}
