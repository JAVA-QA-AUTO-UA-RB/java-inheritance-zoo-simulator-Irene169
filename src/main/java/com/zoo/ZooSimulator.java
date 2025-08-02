package com.zoo;

import com.zoo.animals.Animal;
import com.zoo.species.Penguin;
import com.zoo.species.Lion;
import com.zoo.species.Eagle;
import com.zoo.species.Elephant;
import com.zoo.zookeper.ZooKeeper;

public class ZooSimulator {

    public static void main(String[] args) {

        // Створіть кілька об'єктів різних тварин (лев, орел, пінгвін, слон), задавши їх унікальні параметри.
        Lion Simba = new Lion("Simba", 8, 190.0, 50, "golden");
        Eagle Freedom = new Eagle("Freedom", 2, 6.5, 40, 2.1);
        Penguin Skipper = new Penguin("Skipper", 4, 12.0, 35, 0.8);
        Elephant Dumbo = new Elephant("Dumbo", 11, 5400.0, 60, "gray");

        // Створіть об'єкт ZooKeeper і прив'яжіть його до зоопарку.
        ZooKeeper keeper = new ZooKeeper("Tom");
                System.out.println("The doors of our amazing zoo are opening!\n");

        // Додайте логіку, яка представляє типові події дня в зоопарку:
        // - Годування тварин: використання методу feedAnimal().
        keeper.feedAnimal(Simba);
        keeper.feedAnimal(Freedom);
        keeper.feedAnimal(Skipper);
        keeper.feedAnimal(Dumbo);

        System.out.println();

        // - Гра з тваринами: використання методу playWithAnimal().
        keeper.playWithAnimal(Simba);
        Simba.hunt();

        keeper.playWithAnimal(Freedom);
        Freedom.fly();

        keeper.playWithAnimal(Skipper);
        Skipper.fly();

        keeper.playWithAnimal(Dumbo);
        Dumbo.spraySelf();

        System.out.println();

        // - Перевірка рівня енергії тварин: використання методу checkAnimalEnergyLevel().
        keeper.checkAnimalEnergyLevel(Simba);
        keeper.checkAnimalEnergyLevel(Freedom);
        keeper.checkAnimalEnergyLevel(Skipper);
        keeper.checkAnimalEnergyLevel(Dumbo);

        System.out.println("\n Energy level check after activities");

        // Симулюйте зміну стану тварин (наприклад, втома після грається, зростання енергії після їжі).
        // Виведіть фінальні результати та стани тварин наприкінці дня.
        Animal[] animals = { Simba, Freedom, Skipper, Dumbo};
        for(Animal animal : animals) {
            int energy = animal.getEnergyLevel();
            String energyLevel;

            if (energy <= 30) {
                energyLevel = "Low";
            } else if (energy <= 70) {
                energyLevel = "Medium";
            }else {
                energyLevel = "High";
            }
            System.out.println(" - " + animal.getName() + " has " + energyLevel + " energy (" + energy + ")");
}
       System.out.println("\n The doors oof our zoo are closing. Animals need rest");
    }
}
