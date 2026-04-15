import lecture3.Animal;
import lecture3.Cat;
import lecture3.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Барбос", 13, 60, 15, "Овчарка");
        Cat cat = new Cat("Мурка", 2, 50, 5, "Рыжая");

        dog.showInfo();
        dog.makeSound();
        dog.eat(5);
        dog.train(30);
        dog.sleep(2);

        System.out.println();

        cat.showInfo();
        cat.makeSound();
        cat.eat(3);
        cat.play(20);
        cat.sleep(1);

        System.out.println();
        System.out.println("Всего создано животных: " + Animal.getAnimalCount());
    }
}