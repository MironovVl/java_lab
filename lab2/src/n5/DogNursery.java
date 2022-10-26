package n5;

import java.util.ArrayList;
import java.util.List;

public class DogNursery {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog("имя",3));
        dogs.add(new Dog("имя 2",2));
        System.out.println(dogs.get(0).getAge());
        System.out.println(dogs.get(0).getHumanAge());
        dogs.get(1).setName("новое имя");
        System.out.println(dogs.get(1).toString());
    }
}
