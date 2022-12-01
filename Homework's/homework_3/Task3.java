// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Task3 {

    private static void close(Scanner in) {
    }

    public static void main(String[] args) {
        Random randome = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Какой длинны список? введите число: ");
        int lenghArray = in.nextInt();
        close(in);
        ArrayList<Integer> startList = new ArrayList<Integer>();
        int sum = 0;
        double average = 0;
        for (int i = 0; i < lenghArray; i++) {
            int value = randome.nextInt(-100, 100);
            startList.add(value);
            sum += startList.get(i);
            average = sum / lenghArray +1;
        }
        System.out.println("Начальный список: " + startList);
        System.out.println("Минимальное число " + Collections.min(startList));
        System.out.println("Максимальное число " + Collections.max(startList));
        System.out.println("Средне арифметическое " + (average));
    }
}
