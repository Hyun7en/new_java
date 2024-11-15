package org.example.jdbc3.read연습;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeptVO {
    private int deptno;
    private String dname;
    private String loc;

    @Override
    public String toString() {
        return "DeptVO{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}
