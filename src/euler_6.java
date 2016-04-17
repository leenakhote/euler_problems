/**
 * Created by sony on 4/18/2016.
 */

/*
The sum of the squares of the first ten natural numbers is,
12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class euler_6 {
    public static void main(String[] args) {
       int a =  sumOfSquares(100);
        int b = squareOfSum(100);
        int diff = b - a ;
        System.out.println(diff);
    }

    public static int sumOfSquares(int num){
        int square = 0;
        for(int i = 1 ; i <= num ; i++){
            square += i*i;
        }
        return  square ;
    }

    public static int squareOfSum(int num){
        //sum = n*n+1 / 2
        int sum = (num * (num+1)) / 2 ;
        sum = sum * sum ;
        return sum ;
    }
}
