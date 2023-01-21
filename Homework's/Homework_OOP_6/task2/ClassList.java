package task2;

import java.util.LinkedList;

public abstract class ClassList<T> {

    public LinkedList<T> colList;

    public abstract void getSize();

    public abstract void get(int i);

    public void colList() {
    }

    public ClassList(LinkedList<T> colList) {
        this.colList = colList;
    };

}
