package lecture1;

public class Exercise2 {
    void main()
    {
        for (int number = 100; number < 1000; number++)
        {
            if (number % 10 == 0 )
            {
                int sum = 0;

                for (int i = 1; i <= number; i++) {
                    if (number % i == 0 && i % 2 != 0) {
                        sum += i;
                    }
                }

                if (sum % 10 == 0)
                {
                    System.out.println(number);
                }
            }
        }
    }
}
