package com.pagerduty.client;

public class Main {

    public static void main(String[] args) {
        while (true) {
            String userInput = Util.readKeyboardInputFromUser();
            System.out.println("Hello, " + userInput);
        }
    }
}
