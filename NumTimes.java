import java.io.*;
import java.util.*;

public class NumTimes {
    public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	
	 String a;
	int b;
System.out.println("enter the name and string");
       a= scan.nextLine();
	 b = scan.nextInt();	

         //i starts with 0 as array index starts with 0 too
         int i=0;
         while(i<b){
              System.out.println(a);
              i++;
         }
    }
}