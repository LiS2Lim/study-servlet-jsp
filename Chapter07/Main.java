package Chapter07;

import java.util.*;

@FunctionalInterface
interface X<T> {
    void res(T t);
}

public class Main {
    public static void main(String[] args) {
        Integer[] ints = {1};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println(ints[1]);
    }
}
