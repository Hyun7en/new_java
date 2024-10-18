package org.example.test;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class Programmers {

    public static void main(String[] args) {

        int[][] arr = {{1,2},{3,4},{5,6}};
        Workbook wb = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Sheet1"); // 새 시트 생성

        Row row = sheet.createRow(0); // 첫 번째 행 생성
        Cell cell = row.createCell(0); // 첫 번째 셀 생성
        cell.setCellValue("Hello, Excel!"); // 셀에 데이터 추가

        try (FileOutputStream fileOut = new FileOutputStream("example.xlsx")) {
            workbook.write(fileOut); // 워크북을 파일로 저장
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                workbook.close(); // 워크북 닫기
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
