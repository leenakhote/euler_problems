import java.util.HashSet;
import java.util.Set;

/**
 * Created by sony on 4/17/2016.
 */
/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class euler_5 {
    public static void main(String[] args)
    {
        int number = 20;
        while (true)
        {
            if (isDivisibleByAll(number))
            {
                System.out.println(number);
                break;
            }
            number++;
        }
    }

    private static boolean isDivisibleByAll(int number)
    {
        for (int i = 2; i <= 20; i++)
        {
            if (number % i != 0)
                return false;
        }
        return true;
    }
}
