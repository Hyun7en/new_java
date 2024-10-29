package org.example.day21.알고리즘.선형;

public class 업캐스팅테스트 {
    int x = 2;
    Object x2 = x;
    //Object(부모, 큰) <-업캐스팅- Integer(자식, 작) <-오토박싱- int

    int[] n1 = {1, 2, 3};
    //Object[] n2 = n1; -->X, 오토박싱X
    Integer[] n3 = {1, 2, 3};
    Object[] n4 = n3; //--> O

    String[] n5 = {"나는 스트링", "나도 스트링"};
    Object[] n6 = n5; //--> O
}
