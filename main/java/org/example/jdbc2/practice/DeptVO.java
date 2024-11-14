package org.example.jdbc2.practice;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeptVO {
    private int deptNo;
    private String dName;
    private String loc;

    @Override
    public String toString() {
        return "DeptVO{" +
                "deptNo=" + deptNo +
                ", dName='" + dName + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}
