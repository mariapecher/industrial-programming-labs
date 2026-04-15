package lecture3;

public class Cat extends Animal implements ISoundable {
    private String color;
    private int moodLevel;

    public Cat(String name, int age, int energy, int weight, String color) {
        super(name, age, energy, weight);
        this.color = color;
        this.moodLevel = 50;
    }

    public String getColor() {
        return color;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    @Override
    public void makeSound() {
        int count = 0;

        while (count < 2) {
            System.out.print("Мяу!");
            count++;
        }
        System.out.println();
    }

    public void play(int minutes) {
        if (minutes <= 0) {
            System.out.println("Время игры должно быть больше 0.");
            return;
        }

        for (int i = 0; i < minutes; i += 10) {
            if (energy < 5) {
                System.out.println(getName() + " устал(а) и больше не хочет играть.");
                break;
            }

            energy -= 5;
            moodLevel += 4;

            if (moodLevel > 100) {
                moodLevel = 100;
            }
        }

        System.out.println(getName() + " поиграл(а). Настроение: " + moodLevel + ", энергия: " + energy);
    }

    @Override
    public void showInfo() {
        System.out.println("Кошка:");
        System.out.println("Имя: " + getName());
        System.out.println("Возраст: " + getAge());
        System.out.println("Энергия: " + getEnergy());
        System.out.println("Вес: " + getWeight());
        System.out.println("Окрас: " + color);
        System.out.println("Настроение: " + moodLevel);
    }
}