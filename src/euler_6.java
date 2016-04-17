/**
 * Created by sony on 4/18/2016.
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
