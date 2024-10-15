package org.example.day11.스태틱static;


public class BuyStock {
    public static void main(String[] args) {
        KB_M_able mable = new KB_M_able();

        // 주식 추가
        mable.addStock("AAPL", "Apple Inc.", 145.00, 10);
        mable.addStock("GOOGL", "Alphabet Inc.", 2725.60, 5);
        mable.addStock("TSLA", "Tesla Inc.", 722.50, 7);

        // 주식 목록
        mable.displayStocks();

        // 총 가치 계산
        double totalValue = mable.calculateTotalValue();
        System.out.println("총 가치 : $" + totalValue);
    }
}
