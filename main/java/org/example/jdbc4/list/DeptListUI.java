package org.example.jdbc4.list;

import org.example.jdbc4.one.DeptDAO;
import org.example.jdbc4.one.DeptVO;

import java.sql.SQLException;
import java.util.ArrayList;

public class DeptListUI {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DeptDAO dao = new DeptDAO(); //1-2단계
        //모든 리스트를 가지고 오자.
        ArrayList<DeptVO> list = dao.list();
        //반복해서 꺼내서 출력~!  {vo, vo}
        for (DeptVO bag: list){
            System.out.println("검색한 no>> " + bag.getDeptno());
            System.out.println("검색한 name>> " + bag.getDname());
            System.out.println("검색한 loc>> " + bag.getLoc());
            System.out.println("------------------------");
        }
    }
}