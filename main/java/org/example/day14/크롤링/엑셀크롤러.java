package org.example.day14.크롤링;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.FileOutputStream;
import java.io.IOException;

public class 엑셀크롤러 {

    public void saveExcelForYear() {
        Workbook workbook = new XSSFWorkbook();

        for (int month = 1; month <= 12; month++) {
            String url = "https://ko.wikipedia.org/wiki/2024%EB%85%84_" + month + "%EC%9B%94";

            try {
                Document document = Jsoup.connect(url).get();

                Sheet sheet = workbook.createSheet(month + "월");

                Row header = sheet.createRow(0);
                header.createCell(0).setCellValue("날짜");
                header.createCell(1).setCellValue("내용");

                Elements dateElements = document.select("span.summary");
                Elements contentElements = document.select("td.description");

                for (int i = 0; i < dateElements.size(); i++) {
                    String date = dateElements.get(i).text();
                    String content = contentElements.size() > i ? contentElements.get(i).text() : null;
                    Row row = sheet.createRow(i + 1);
                    if (!content.equals("")) {
                        row.createCell(0).setCellValue(date.substring(18)); // 날짜
                        row.createCell(1).setCellValue(content); // 내용
                    }else{
                        row.createCell(0).setCellValue(date.substring(18));
                        row.createCell(1).setCellValue("====내용이 없습니다.====");
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (FileOutputStream fileOut = new FileOutputStream("2024_월별_크롤링_결과.xlsx")) {
            workbook.write(fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}