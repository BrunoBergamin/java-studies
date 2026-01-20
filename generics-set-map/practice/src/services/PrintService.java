package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

    private List<T> list = new ArrayList<>();

    public List<T> getList() {
        return list;
    }

    public void addValue(T value) {
        list.add(value);
    }

    public T first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("list is empty");
        }
        return list.getFirst();
    }

    public void print() {
        System.out.print("[");
        if (!list.isEmpty()) {
            System.out.print(list.getFirst());

        }
        for (int i = 1; i < list.size(); i++) {
            System.out.printf(", " + list.get(i));
        }
        System.out.println("]");
    }
}
