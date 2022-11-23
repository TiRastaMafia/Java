// package com.example;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = "Ваш ответ: ";

        System.out.println("Введите число: ");
        int num1 = scan.nextInt();
        System.out.println("Введите действие: ");
        String operation = scan.next();
        System.out.println("Введите число: ");
        int num2 = scan.nextInt();


    if (num1 / num1 == 1 & num2 / num2 == 1)
        if (operation.equals("+") | operation.equals("-") | operation.equals("*") | operation.equals("/")){
        }else {
            System.out.println("Неверное арифметическое действие");
            }
            if (operation.equals("+")) {
                System.out.println(text + (num1 + num2));
            } else if (operation.equals("-")) {
                System.out.println(text + (num1 - num2));
            } else if (operation.equals("*")) {
                System.out.println(text + (num1 * num2));
            } else if (operation.equals("/")) {
                System.out.println(text + (num1 / num2));
            }

        }

        }
