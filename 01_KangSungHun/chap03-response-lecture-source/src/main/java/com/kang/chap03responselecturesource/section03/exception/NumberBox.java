package com.kang.chap03responselecturesource.section03.exception;

public class NumberBox {
    int number;

    NumberBox(int number) {
        this.number = number;
    }

    void swap (NumberBox other) {
        int temp = this.number;
        this.number = other.number;
        other.number = temp;
    }

}

class Main {
    public static void main(String[] args) {

        NumberBox box1 = new NumberBox(100);
        NumberBox box2 = new NumberBox(200);
        box1.swap(box2);
        System.out.println(box1.number);
    }
}
