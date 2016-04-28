/**
 * Created by sony on 4/20/2016.
 */
/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */

public class euler_9 {
    public static void main (String[] args)
    {
        int nes_sum = 1000; //necessary sum
        int last_number = 998; //let's count up to 998

        for(int i = 1; i < last_number; i++)
        {
            for(int o = i+1; o < last_number; o++)
            {
                for(int p = o+1; p < last_number; p++)
                {
                    check_everything n = new check_everything(); //creating class
                    n.setNumbers(i, o, p);  //setting numbers
                    n.is_pythagor(); //check if it is pythagoras, if yes, b1 becomes true
                    n.is_sum();  //check sum, if sum is good, b2 becomes true

                    if(n.b1 && n.b2) //if b1 and b2 are true, we have numbers
                    {
                        n.post_numbers();
                        break; //and break for, but I guess it breaks only the third for loop, not all of them, what do you suggest me there?
                    }
                }
            }
        }
    }
}

class check_everything //class for checking if it is Pythagoras and sum for 3 numbers
{
    int need_sum = 1000;
    int first_number;
    int second_number;
    int third_number;
    boolean b1 = false;
    boolean b2 = false;

    void setNumbers(int a, int b, int c)
    {
        first_number = a;
        second_number = b;
        third_number = c;
    }

    void is_pythagor()
    {
        if(first_number * first_number + second_number * second_number == third_number * third_number)
        {
            b1 = true;
        }
    }

    void is_sum()
    {
        if(first_number + second_number + third_number == need_sum)
        {
            b2 = true;
        }
    }

    void post_numbers()
    {
        int product = first_number * second_number * third_number;
        System.out.println("We have numbers! Product is: "+ first_number +" * "+ second_number +" * "+ third_number +" = "+ product);
    }
}
