package HW_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Барсик", "Пепельный"));
        animals.add(new Dog("Арчи", "серый"));
        animals.add(new Sparrow("Вася", "коричневый"));
        animals.add(new Duck("Дональд", "белый"));
        animals.add(new Goldfish("Поньё", "золотистый"));

        for (Animal a: animals) a.toGo();
        System.out.println();

        for (Animal a: animals) a.fly();
        System.out.println();

        for (Animal a: animals) a.swim();
        System.out.println();
    }

}
