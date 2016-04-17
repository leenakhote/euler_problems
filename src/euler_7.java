/**
 * Created by sony on 4/18/2016.
 */

/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number
 */
public class euler_7 {
    public static void main(String[] args) {
        long num = 2;
        int count = 1 ;
        while (count <= 10001 ){

            if(isPrime(num)){
                count ++ ;
                num ++;
            }
            else{
                num ++;
            }
        }
        System.out.println(num - 1);
    }

    public static boolean isPrime(long num){
        for(int i=2;i<num;i++){
            if(num%i==0) {
                return false;
            }
        }
        return true ;
    }
}

