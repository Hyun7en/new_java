package org.example.day15.문제;


import java.util.ArrayList;

class GenericStack<T> {
    private ArrayList<T> stack; // 스택을 위한 ArrayList
    private int top; // 스택의 현재 크기

    public GenericStack() {
        stack = new ArrayList<>();
        top = 0;
    }

    // 스택에 요소 추가
    public void push(T item) {
        stack.add(item);
        top++;
    }

    // 스택에서 요소 제거 및 반환
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("스택이 비어있습니다.");
        }
        T item = stack.remove(--top);
        return item;
    }

    // 스택의 가장 위 요소를 반환
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("스택이 비어있습니다.");
        }
        return stack.get(top - 1);
    }

    // 스택이 비어있는지 확인
    public boolean isEmpty() {
        return top == 0;
    }

    // 스택의 크기 반환
    public int size() {
        return top;
    }
}


