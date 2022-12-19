public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ArrayL<String> myArrayList = new ArrayL<String>();
        myArrayList.add("Andrey");
        myArrayList.add("Nikita");
        myArrayList.add("Denis");
        myArrayList.add("Vasy");
        myArrayList.add("Petya");
        myArrayList.add("Roma");
        myArrayList.add("Dima");
        myArrayList.add("Kostya");
        myArrayList.set(0, "Kek");
        System.out.println(myArrayList);
    }
}
