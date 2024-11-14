package org.example.jdbc2.practice;

import java.util.Scanner;

public class DeptUpdateUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print(" 수정할 DEPT 테이블의 DEPTNO >> ");
        int deptNo = sc.nextInt();

        System.out.print("수정할 LOC >> ");
        String loc = sc.next();
        sc.nextLine();
        sc.close();

        DeptDAO dao = new DeptDAO();
        DeptVO vo = new DeptVO();
        vo.setDeptNo(deptNo);
        vo.setLoc(loc);
        dao.update(vo);

        System.out.println(vo);
    }
}
