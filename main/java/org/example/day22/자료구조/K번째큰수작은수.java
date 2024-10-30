package org.example.day22.자료구조;

import java.util.TreeSet;

public class K번째큰수작은수 {
    public static void main(String[] args) {
        int[] n = {1, 12, 33, 6, 18, 9, 10, 10};
        TreeSet<Integer> tree = new TreeSet<>();
        for (int x: n){
            tree.add(x);
        }
        System.out.println(tree);
        System.out.println(tree.first());
        System.out.println(tree.last());

        Object[] arr = tree.toArray();
        System.out.println(arr[arr.length - 1]);
        System.out.println(arr[arr.length - 2]);
        System.out.println(arr[arr.length - 3]);
        //k번째 큰수라고 나오면 정렬된 상태에서
        //arr[arr.length - k]
        int k2 = 3;
        System.out.println(arr[0]); //첫번째 작은수
        System.out.println(arr[1]); //두번째 작은수
        System.out.println(arr[k2 - 1]); //세번째 작은수
    }
}