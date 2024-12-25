class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

// Using Generic in a bounded type parameter.
class Calculator<T extends Number> {
    public double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
}

class Pair<K, V> {
    private K key;
    private V value;

    // Constructor
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Getters
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    // toString for better readability
    @Override
    public String toString() {
        return "Key: " + key + ", Value: " + value;
    }
}

public class GenericDemo {
    // Generic method
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        // Using Box for Integer
        Box<Integer> intBox = new Box<>();
        intBox.setItem(123);
        System.out.println("Integer Box: " + intBox.getItem());

        // Using Box for String
        Box<String> strBox = new Box<>();
        strBox.setItem("Hello Generics");
        System.out.println("String Box: " + strBox.getItem());

        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Java", "Generics", "Are", "Powerful"};

        System.out.println("Integer Array:");
        printArray(intArray);

        System.out.println("String Array:");
        printArray(strArray);

        Calculator<Integer> intCal = new Calculator<>();
        System.out.println("Sum: " + intCal.add(10, 20));

        Calculator<Double> doubleCalc = new Calculator<>();
        System.out.println("Sum " + doubleCalc.add(5.5, 4.5));

        // Create a Pair of Integer and String
        Pair<Integer, String> idNamePair = new Pair<>(1, "Alice");
        System.out.println("ID-Name Pair: " + idNamePair);

        // Create a Pair of String and Double
        Pair<String, Double> productPricePair = new Pair<>("Laptop", 899.99);
        System.out.println("Product-Price Pair: " + productPricePair);

        // Create a Pair of two Strings
        Pair<String, String> countryCapitalPair = new Pair<>("France", "Pairs");
        System.out.println("Country-Capital Pair: " + countryCapitalPair);
    }
}
