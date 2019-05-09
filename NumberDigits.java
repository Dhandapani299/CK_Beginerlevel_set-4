
import java.io.*;
import java.util.*;

public class NumberDigits {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

        System.out.println("input");
        int count = 0, num,a;
	a = scan.nextInt();
	num =a; 
        while(num != 0)
        {
            // num = num/10
            num /= 10;
            ++count;
        }

        System.out.println("Number of digits output: " + count);
    }
}