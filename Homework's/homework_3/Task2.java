
// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task2 {

    private static void close(Scanner in) {
    }
    public static void main(String[] args) {
        Random randome = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Какой длинны список? введите число: ");
        int lenghArray = in.nextInt();
        close(in);
        ArrayList<Integer> startList = new ArrayList<Integer>();

        for (int i = 0; i < lenghArray; i++) {
            int value = randome.nextInt(-100, 100);
            startList.add(value);
        }
        System.out.println("Начальный список: " + startList);
        int i = 0;
        while (i < startList.size()) {
            if (startList.get(i) % 2 == 0) {
                startList.remove(i);
            } else {
                i++;
            }
        }
        System.out.println("Список без четных чисел: " + startList);
    }


}