package lecture3;

public abstract class Animal {
    private String name;
    private int age;
    protected int energy;
    protected int weight;

    private static int animalCount = 0;

    public Animal(String name, int age, int energy, int weight) {
        this.name = name;
        this.age = age;
        this.energy = energy;
        this.weight = weight;
        animalCount++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getEnergy() {
        return energy;
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        if (age > 0 && age < 50) {
            this.age = age;
        }
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public void sleep(int hours) {
        if (hours <= 0) {
            System.out.println("Количество часов сна должно быть больше 0.");
            return;
        }

        for (int i = 0; i < hours; i++) {
            energy += 10;
            if (energy > 100) {
                energy = 100;
                break;
            }
        }

        System.out.println(name + " спал(а) " + hours + "ч. Энергия: " + energy);
    }

    public void eat(int foodAmount) {
        if (foodAmount <= 0) {
            System.out.println("Количество еды должно быть больше 0.");
            return;
        }

        energy += foodAmount * 2;
        weight += foodAmount / 2;

        if (energy > 100) {
            energy = 100;
        }

        System.out.println(name + " поел(а). Вес: " + weight + ", энергия: " + energy);
    }

    public abstract void showInfo();
}
