/**
 * Created by sony on 4/16/2016.
 */

/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class euler_4 {
    public static boolean isPalindrome(int number){
        int n = number;
        int r, sum=0;
        while(number > 0){
            r = number %10 ;
            sum = sum*10 +r ;
            number = number/10 ;
        }
        if(sum == n){
            return(true);
        }
        return(false);
    }
    public static int Problem4(){
        int pp = 0;
        int a = 0;
        for (int i=100;i<1000;i++){
            for (int j=100;j<1000;j++){
                pp = i*j;
                if (isPalindrome(pp)){
                    if (pp>a){
                        a = pp;
                    }
                }
            }
        }
        return(a);
    }

    public static void main(String[] args) {
        int num = Problem4();
        System.out.println(num);
    }
}
