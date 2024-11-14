package org.example.jdbc2.practice;

import java.util.Scanner;

public class DeptInsertUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("DEPTNO >> ");
        int deptNo = sc.nextInt();

        System.out.print("DNAME >> ");
        String dName = sc.next();

        System.out.print("LOC >> ");
        String loc = sc.next();
        sc.nextLine();
        sc.close();

        DeptDAO dao = new DeptDAO();
        DeptVO vo = new DeptVO();
        vo.setDeptNo(deptNo);
        vo.setDName(dName);
        vo.setLoc(loc);
        dao.insert(vo);

        System.out.println(vo);
    }
}
