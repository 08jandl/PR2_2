package Generics1;

public class Main {
    public static void main(String[] args) {
//        StringPrinter stringPrinter = new StringPrinter();
//        IntPrinter intPrinter = new IntPrinter();
//        DoublePrinter doublePrinter = new DoublePrinter();
//        FruitPrinter fruitPrinter = new FruitPrinter();
//
//        stringPrinter.print("Print me");
//        intPrinter.print(123);
//        doublePrinter.print(1.234);
//        fruitPrinter.print(new Fruit(Color.ORANGE, "Orange", 12));

        // To use a Generic Class, we need to tell it what Object to work with in the <>
        // here we are working first with <String>
        GenericPrinter<String> stringPrinter = new GenericPrinter<>();
        GenericPrinter<Integer> integerPrinter = new GenericPrinter<>();
        GenericPrinter<Double> doublePrinter = new GenericPrinter<>();
        GenericPrinter<Fruit> fruitPrinter = new GenericPrinter<>();

        stringPrinter.print("Print me");
        integerPrinter.print(123);
        doublePrinter.print(1.234);
        fruitPrinter.print(new Fruit(Color.ORANGE, "Orange", 12));
    }
}
