package Collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // create a List
        List<Integer> integerList = new ArrayList<>();

        // add things to List
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        // show everything that's in the List
        for (Integer i : integerList) {
            System.out.println(i);
        }

        // remove one item from the List
        integerList.remove(3);

        // separating line for readablitiy
        System.out.println("--------------------------");

        // show list again to see changes
        for (Integer i : integerList) {
            System.out.println(i);
        }

        System.out.println("--------------------------");
        // see how long the List is
        System.out.println(integerList.size());


        // ANIMALS

        // create Lsit for Objects of type Animal
        List<Animal> animals = new ArrayList<>();

        // create an animal, then add it to the List
        Animal bear = new Animal("Boris", "Bear", AnimalType.MAMMAL);
        animals.add(bear);

        // ... or create Animal at the same time as adding it to the List
        animals.add(new Animal("Susi", "Schlange", AnimalType.REPTILE));

        // show all animals
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        // only print names
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }

    }
}
