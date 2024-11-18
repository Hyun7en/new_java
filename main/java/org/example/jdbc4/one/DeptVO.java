package org.example.jdbc4.one;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//ORM 규칙
@Setter
@Getter
@ToString
public class DeptVO {
    private int deptno;
    private String dname;
    private String loc;

    //넣을 때 set변수명()
    //꺼낼 때 get변수명()
    //들어있는 변수들 값 문자열로 확인 toString()
}
