package task2;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>(Arrays.asList(6, 9, 9999, 987));
        LinkedList<Integer> lst2 = new LinkedList<>(Arrays.asList(43333, 4322349, 987));
        ImmutableList immutableList = new ImmutableList(lst);
        immutableList.colList();
        immutableList.get(3);
        immutableList.get(2);
        System.out.println();
        MutableList mutableList = new MutableList(lst2);
        mutableList.add(4);
        mutableList.add(3);
        mutableList.colList();
        mutableList.get(3);
        mutableList.remove(2);
        mutableList.getSize();
        mutableList.colList();
    }
}
