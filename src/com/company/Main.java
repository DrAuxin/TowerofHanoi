package com.company;

public class Main {

    public static void main(String[] args) {
        {
            int index = 0;
            while (index <= 9) {
                System.out.println(fib(index));
                index++;
            }
        }
    }
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int term = fib(n - 1) + fib(n - 2);
        return term;

    }
}


