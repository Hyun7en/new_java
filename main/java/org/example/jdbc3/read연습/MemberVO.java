package org.example.jdbc3.read연습;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class MemberVO {
    //가방에 들어갈 데이터 공간을 할당(member테이블의 컬럼명과 동일)
    private String id;
    private String pw;
    private String name;
    private String tel;
}