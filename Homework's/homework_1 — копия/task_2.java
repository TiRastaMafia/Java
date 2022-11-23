// package com.example;
import java.util.Scanner;

public class task_2 {

    public static void main(String[] args) {
        System.out.println("Введите положительное число: ");
        Scanner scan = new Scanner(System.in);
        // int input = scan.nextInt();
        int input = 1000;
        boolean b = true;
        System.out.println("Ваш результат: ");
        for (int start_position = 2; start_position <= input; start_position++) {
            for (int i = 2; i < start_position; i++) {
                if (start_position % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b)
                System.out.println(start_position);
            else
                b = true;
        }
    }
}