package org.example.day11.스태틱static;

import java.util.ArrayList;
import java.util.List;

public class KB_M_able {

    private String ticker; // 주식 티커 (ex: AAPL, GOOGL)
    private String companyName; // 회사 이름
    private double currentPrice; // 현재 가격
    private int quantity; // 보유 수량

    // 주식 목록 저장
    private List<KB_M_able> stocks;

    public KB_M_able() {
        this.stocks = new ArrayList<>();
    }

    // 주식 추가
    public void addStock(String ticker, String companyName, double currentPrice, int quantity) {
        KB_M_able stock = new KB_M_able();
        stock.ticker = ticker;
        stock.companyName = companyName;
        stock.currentPrice = currentPrice;
        stock.quantity = quantity;
        stocks.add(stock);
    }

    // 주식 목록 표시
    public void displayStocks() {
        System.out.println("내 주식 목록:");
        for (KB_M_able stock : stocks) {
            System.out.println("Stock{" +
                    "ticker='" + stock.ticker + '\'' +
                    ", companyName='" + stock.companyName + '\'' +
                    ", currentPrice=" + stock.currentPrice +
                    ", quantity=" + stock.quantity +
                    '}');
        }
    }

    // 총 가치 계산
    public double calculateTotalValue() {
        double totalValue = 0;
        for (KB_M_able stock : stocks) {
            totalValue += stock.currentPrice * stock.quantity;
        }
        return totalValue;
    }
}

