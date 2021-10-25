package CoreJava.Q5;
import java.util.Scanner;
public class Q5 {

        // method to find factorial of given number
        static int factorial(int n)
        {

            if (n == 0)
                return 1;
            System.out.print(n+"*");

            return n * factorial(n - 1);
        }

        // Driver method
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Number to find fsctorial of:");
            int num =sc.nextInt();
            System.out.println("\n Factorial of " + num
                    + " is " + factorial(5));
        }

}