import java.io.*;
import java.util.*;
public class FiboNum {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

        int count, num1 = 0, num2 = 1;
	System.out.print("enter the number ");	
	count = scan.nextInt();
	
        System.out.print("Fibonacci Series of "+count+" numbers:");

        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num2+" ");

            /* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
    }
}