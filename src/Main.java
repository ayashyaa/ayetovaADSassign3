public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Integer> table = new MyHashTable<>();


        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass(i, "Name" + i);
            table.put(key, i);
        }




        // Testin it
        MyTestingClass testKey = new MyTestingClass(2555, "Name2555");
        System.out.println("Value for key 2555: " + table.get(testKey));

//        MyTestingClass testKey2 = new MyTestingClass(655, "Name655");
//        System.out.println("VValue for key 655: " + table.get(testKey2));

        testKey = new MyTestingClass(655, "Name655");
        System.out.println("Value for key 655: " + table.get(testKey));



        // contains ----> возращает true or false
        System.out.println("Contains value 9999: " + table.contains(9999));
        System.out.println("Contains value 10000: " + table.contains(10000)); // is there a value 10000?

        MyTestingClass anotherKey = new MyTestingClass(1234, "Name1234");
        table.remove(anotherKey);
        System.out.println("After removing 1234, value: " + table.get(anotherKey));
    }
}
