package org.example.dbcp;

public class MemberVO {
    //가방에 들어갈 데이터 공간을 할당(member테이블의 컬럼명과 동일)
    private String id;
    private String pw;
    private String name;
    private String tel;
    //넣을 때 사용하는 메소드 set변수명()
    public void setId(String id){
        this.id = id;
    }
    //꺼낼 때 사용하는 메서드 get변수명()
    public String getId(){
        return id;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getPw() {
        return pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
