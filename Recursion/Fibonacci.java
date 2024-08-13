package Recursion;

import java.util.Scanner;

public class Fibonacci {

    static int Fibonacci(int n) {
        if (n <= 1)
            return n;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner input = new Scanner(System.in);
        do {

            System.out.print("ENter Number: ");
            n = input.nextInt();
            System.out.println(Fibonacci(n));
        } while (Fibonacci(n) > 0);
    }
}
