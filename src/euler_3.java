/**
 * Created by sony on 4/15/2016.
 */

/*
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
 */

import java.util.ArrayList;
public class euler_3 {
/*    public static void main(String[] args) {
        Long i=new Long("1");
        Long p=new Long("600851475143");
        Long f=new Long("1");
        while(p>=i)
        {
            if(p%i==0)
            {
                f=i;
                p=p/i;
                int x=1;
                i=(long)x;
            }
            i=i+2;
        }
        System.out.println(f);

    }*/
        private static ArrayList<Long> factor_list = new ArrayList<Long>();

        public static void main (String[] args)
        {
            long targetNum = 600851475143L;

            for (long n = 2; n <= targetNum; n++)
            {
                if ((targetNum % n) == 0)
                {
                    targetNum /= n;

                    factor_list.add(n);
                }
            }

            System.out.println("The prime factors of 600851475143 :");

            for (int i = 0; i < factor_list.size(); i++)
            {
                System.out.println(factor_list.get(i));
            }

            System.out.println("The largest prime factor is " + factor_list.get(factor_list.size()-1));
        }



    }
