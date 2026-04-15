package lecture3;

public class Dog extends Animal implements ISoundable, ITrainable {
    private String breed;
    private int skillLevel;

    public Dog(String name, int age, int energy, int weight, String breed) {
        super(name, age, energy, weight);
        this.breed = breed;
        this.skillLevel = 0;
    }

    public String getBreed() {
        return breed;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    @Override
    public void makeSound() {
        for (int i = 0; i < 3; i++) {
            System.out.print("Гав ");
        }
        System.out.println();
    }

    @Override
    public void train(int minutes) {
        if (minutes <= 0) {
            System.out.println("Время тренировки должно быть больше 0.");
            return;
        }

        if (energy < 20) {
            System.out.println(getName() + " слишком устал(а) для тренировки.");
            return;
        }

        int completedMinutes = 0;

        while (completedMinutes < minutes && energy >= 5) {
            completedMinutes += 10;
            energy -= 5;
            skillLevel++;
        }

        System.out.println(getName() + " тренировался(ась) " + completedMinutes + " минут.");
        System.out.println("Уровень навыка: " + skillLevel + ", энергия: " + energy);
    }

    @Override
    public void showInfo() {
        System.out.println("Собака:");
        System.out.println("Имя: " + getName());
        System.out.println("Возраст: " + getAge());
        System.out.println("Энергия: " + getEnergy());
        System.out.println("Вес: " + getWeight());
        System.out.println("Порода: " + breed);
        System.out.println("Уровень навыка: " + skillLevel);
    }
}