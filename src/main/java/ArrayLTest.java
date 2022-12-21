import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayLTest {

    @Test
    void add() {
ArrayL<Integer> myArrayList = new ArrayL<Integer>();
myArrayList.add(122);
myArrayList.add(100);
Assertions.assertEquals(122,myArrayList.get(0));


    }
    @Test
    void delete() {
        ArrayL<Double> doubleArrayL = new ArrayL<Double>();
        doubleArrayL.add(2.4);
        doubleArrayL.delete(0);
        Assert.assertTrue(doubleArrayL.isEmpty());

    }

    @Test
    void sout() {
        ArrayL<Integer> integerArrayLL = new ArrayL<Integer>();
        integerArrayLL.add(21);
        integerArrayLL.add(22);
        integerArrayLL.add(23);
        integerArrayLL.sout();


    }

    @Test
    void get() {
        ArrayL<Integer> integerArrayget = new ArrayL<Integer>();
        integerArrayget.add(100);
        integerArrayget.get(0);
        Assertions.assertEquals(100,integerArrayget.get(0));
    }

    @Test
    void set() {
        ArrayL<Integer> set = new ArrayL<Integer>();
        set.add(100);
        set.set(0,50);
        Assertions.assertEquals(50,set.get(0));
    }

    @Test
    void isEmpty() {
        ArrayL<Integer> empty = new ArrayL<Integer>();
        //Assert.assertNotNull(empty);
        Assert.assertTrue(empty.isEmpty());
    }

}