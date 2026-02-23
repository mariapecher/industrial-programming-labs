package lecture1;
import java.util.Scanner;

public class Exercise1 {
    void main()
    {
        System.out.println("Напишите трёхзначное число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;
        int newNumber = 0;

        if (hundreds < 10)
        {
            if (number > 0)
            {
                if (number > 500)
                {
                    newNumber = ones * 100 + tens * 10 + hundreds;
                }
                else
                {
                    newNumber = hundreds * 100 + ones * 10 + tens;
                }

            }
        }

        System.out.println("Новое число: " + newNumber);
    }
}
