package org.example.day14.크롤링;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링테스트3 {
    public static void main(String[] args) throws Exception {

        //카카오 035720
        //네이버 035420
        //현대차 005380
        String[] names = {"카카오","네이버","현대차"};
        String[] codes = {"035720","035420","005380"};

        for (int i = 0; i< names.length; i++) {
            Document doc2 = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + codes[i]).get();
            //찾아볼 태그, 태그.클래스명, 태그#아이디명, 클래스명, 아이디명
            //<img src="a.png"> src는 속성

            Elements list = doc2.select("span.code"); //0~여러개
            //<span class="code">12s3fd</span> : Element, tag
            //System.out.println(list.size()); //1

            Element e1 = list.get(0); //<span class="code">005930</span>
            String code = e1.text();

            Elements list5 = doc2.select("span.blind");
            //고가 high에 넣기
            String high = list5.get(18).text();
            //현재가 today에 넣기
            String today = list5.get(14).text();
            //전일 yesterday에 넣기
            String yesterday = list5.get(17).text();
            //다음과 같이 프린트해보자.
            //회사명 : 삼성전자
            System.out.println("회사명 : " + names[i]);
            //코드 :
            System.out.println("코드 : " + code);
            //고가 :
            System.out.println("고가 : " + today);
            //현재가 :
            System.out.println("현재가 : " + high);
            //전일가 :
            System.out.println("전일가 : " + yesterday);
            System.out.println("----------------");
            //회사명 : 삼성전자
            //코드 : 005930
            //고가 : 59,300
            //현재가 : 60,100
            //전일가 : 59,700
        }


    }

}