/**
 * Created by sony on 4/29/2016.
 */

/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
 */
public class euler_10 {

    /*public static void main(String[] args) {
        int i = 0 ;
        int num = 0;
        long sum = 0;

        for(i = 2 ; i <= 2000000 ;i++){
            int counter = 1;
                for( num = i ; num >= 2; num--){
                if(i%num == 0){
                    counter = counter +1 ;
                }
            }

            if(counter == 2){
                sum = sum + i ;
            }
        }
        System.out.println( sum);
    }*/
    public static void main(String[] args) {
        euler_10 prob_10Obj = new euler_10();
        long Sum = 0;

        // start the counter at 1 and increase by 2 (all odd numbers)
        int counter = 1;

        // while counter is less than two million
        while (counter < 2000000) {

            // checks to see if counter is a prime number - if true - add to Sum
            if (prob_10Obj.isPrime(counter)) {
                Sum += counter;
            }
            // increase counter by 2 -> 1, 3, 5, 7, 9, 11, etc.
            counter += 2;
        }
        // add 2 to the Sum - our counter does not count the first prime number -> 2.
        System.out.println(Sum + 2);
    }

    public boolean isPrime(int n)
    {
        if (n == 1){
            return false;
        }
        int k = (int) Math.sqrt(n);
        for (int i = 2; i <= k; i++)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }




}
