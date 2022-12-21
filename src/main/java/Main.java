import org.junit.Test;

import java.util.ArrayList;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ArrayL<Integer> myArrayList = new ArrayL<Integer>();
        myArrayList.add(12);
        myArrayList.add(16);
        myArrayList.add(5);
        myArrayList.add(23);
        myArrayList.add(64);
        myArrayList.add(22);
        myArrayList.add(33);
        myArrayList.add(43);
        myArrayList.set(0,23);
        myArrayList.sout();
        myArrayList.delete((Integer) 1);
        System.out.println(myArrayList.isEmpty());
        System.out.println(myArrayList);

        ArrayList<Number> arrayList = new ArrayList<Number>();

    }
}
