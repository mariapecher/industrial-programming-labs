package lecture1;
import java.util.Scanner;


public class Exercise3 {
    void main(){
        Scanner scan = new Scanner(System.in);

        int peopleCount = 0;
        int peopleWeight = 0;
        String reason = "";

        while (true){
            System.out.print("Введите вес человека: ");
            int currentWeight = scan.nextInt();

            if (peopleCount + 1 > 6) {
                reason = "Количество людей превысило 6 человек";
                break;
            }
            if (peopleWeight + currentWeight > 450) {
                reason = "Общий вес превысил 450 кг";
                break;
            }

            peopleCount++;
            peopleWeight += currentWeight;
        }

        System.out.println("\nКоличество людей в лифте: " + peopleCount);
        System.out.println("Общий вес: " + peopleWeight + " кг");
        System.out.println("Причина остановки лифта: " + reason);
    }
}
