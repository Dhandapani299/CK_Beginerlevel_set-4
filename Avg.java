import java.io.*;  
import java.util.Scanner;  
public class Avg {  
   public static void main(String[] args)  
    {  
      int n, count = 1;   
      float  xF, averageF, sumF = 0;   
      Scanner sc = new Scanner(System.in);     
      System.out.println("Enter the value of n");  
      n = sc.nextInt();  
System.out.println("Enter the number");
      while (count <= n)   
             {   
                    
                  xF = sc.nextInt();  
                  sumF += xF;   
                  ++count;   
             }   
                  averageF = sumF/n;   
        System.out.println("The Average is"+averageF);  
    }    
}  