import java.util.ArrayList;
import java.util.Arrays;

public class ArrayL<T>{          //на вход любые типы данных принимает
    private T[] list;
    private int size;
    private static final int CAPACITY = 10;  // размер по-умолчанию

    public ArrayL(int capacity){     // принимает значения капасити
        if (capacity <= 0){
            throw new IllegalArgumentException("Illegal Capacity:"+ CAPACITY);}
        else{
            list = (T[]) new Object[capacity];
        }
    }

    public ArrayL(){
        list = (T[]) new Object[CAPACITY];
    }
    public void add(T item){
        //провекра на переполнение, если полный то должны изменить capacity в 1,5 раза

        list[size++]=item;
    }

    public void add(int index, T item){
        for (int i=size;i>index;i--){
            list[index]=list[i-1];
        }
        size++;
    }
    public void delete (int index){
        for (int i = index; i < size; i++) {
            list[i]=list[i+1];
        }
    }
    public void sout(){
        for (T elem:list){
            System.out.println(elem+" ");
        }
    }

    public T get(int index){
        return list[index];

    }

    public void set(int index, T item){
        list[index]=item;
    }

    public boolean isEmpty(){
        return size==0;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(list, size));
    }
}
