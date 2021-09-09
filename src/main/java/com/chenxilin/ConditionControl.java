package com.chenxilin;

/**
 * @author chenxilin
 */
public class ConditionControl {
    public static void main(String[] args) {
        ifStatement();
        switchStatement();
        breakStatement();
        continueStatement();
    }

    public static void ifStatement() {
        System.out.println("---if语句---");
        int x = 10;
        if (x > 10) {
            System.out.println("x > 10");
        } else if (x > 5) {
            System.out.println("10 > x > 5");
        } else {
            System.out.println("x <= 5");
        }
    }

    public static void switchStatement() {
        System.out.println("---switch语句---");
        String city = "北京";
        switch (city) {
            case "北京":
                System.out.println("天安门");
                break;
            case "上海":
                System.out.println("黄浦江");
                break;
            case "广州":
                System.out.println("广州塔");
                break;
            default:
                System.out.println("未知");
                break;
        }
    }

    public static void breakStatement() {
        System.out.println("---break语句---");
        int iter = 10;
        for (int i = 0; i < iter; i++) {
            System.out.println(i);
            if (i == 8) {
                break;
            }
        }
    }

    public static void continueStatement() {
        System.out.println("---continue语句---");
        int iter = 10;
        for (int i = 0; i < iter; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
