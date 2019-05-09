
import java.io.*;
import java.util.*;

public class NextNum{

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

        System.out.println("input");
        int  num,a,b;
	a = scan.nextInt();
	num =a; 
       b = ++a;

        System.out.println(" output: " + b);
    }
}