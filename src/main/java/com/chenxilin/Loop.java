package com.chenxilin;

public class Loop {
    public static void main(String[] args) {
        forLoop();
        forEachLoop();
        whileLoop();
        doWhileLoop();
    }

    /** for循环 */
    public static void forLoop() {
        System.out.println("---for循环例子---");
        int iter = 10;
        for (int i = 0; i <= iter; i++) {
            System.out.println(i);
        }
    }

    /** for each循环 */
    public static void forEachLoop() {
        System.out.println("---for each循环例子---");
        String[] array = { "a", "b", "c", "d", "e"};
        for (String i : array) {
            System.out.println(i);
        }
    }

    /** while循环 */
    public static void whileLoop() {
        System.out.println("---while循环例子---");
        int iter = 10;
        while (iter >= 0) {
            System.out.println(iter);
            iter -= 1;
        }
    }

    /** do while循环 */
    public static void doWhileLoop() {
        System.out.println("---do while循环例子---");
        int iter = 10;
        do {
            System.out.println(iter);
            iter -= 1;
        } while (iter >= 0);
    }
}
