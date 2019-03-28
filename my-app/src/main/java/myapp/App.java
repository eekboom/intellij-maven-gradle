package myapp;

import com.eekboom.mylib.Calculator;

public class App {

    public static void main(String[] args) {
        System.out.println("3 + 2 is " + new Calculator().add(3, 2));
    }
}
