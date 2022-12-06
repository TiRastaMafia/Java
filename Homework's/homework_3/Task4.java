//4*. (Необязательная задача повышенной сложности)
//Даны два ArrayList из целых чисел. Написать функции, которые вычисляют разницу коллекций:
//Разность:
//A - B = все числа из первой коллекции, которые не содержатся во второй коллекции
//B - A = все числа из второй коллекции, которые не содержатся в первой
//Симметрическая разность:
//A ^ B = числа из первой коллекции, которых нет во второй, А ТАКЖЕ числа из второй, которых нет в первой

import java.util.ArrayList;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        // Задаем размер массивов
        ArrayList<Integer> list1 = createListRandom(10);
        ArrayList<Integer> list2 = createListRandom(10);
        // Вывод полученных массивов
        System.out.printf("First list %s\n", list1);
        System.out.printf("Second list %s\n", list2);
        // Разница массивов
        System.out.printf("A - B %s\n", diffAB(list1, list2));
        System.out.printf("B - A %s\n", diffAB(list2, list1));
        // Склейка массивов
        System.out.printf("Symmetrical Difference A - B merged %s\n", symmetricDiff(diffAB(list1, list2),
                diffAB(list2, list1)));
    }
    // Заполнение значениями 
    private static ArrayList<Integer> createListRandom (int size) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < size; j++) {
            list.add(rand.nextInt(-2,6));
        }
        return list;
    }
    // Расчет разности элементов и склейка
    private static ArrayList<Integer> diffAB (ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> resultList = new ArrayList<>();
        int count = 0;
        for (int i : list1) {
            for (int j : list2) {
                if (i == j)
                    count++;
            }
            if (count == 0) {
                resultList.add(i);
            }
            count = 0;
        }
        return resultList;
    }
    // и склейка
    private static ArrayList<Integer> symmetricDiff (ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for(int i: list2) {
            list1.add(i);
        }
        return list1;
    }
}
