import java.io.*;
import java.util.Scanner;
 
class Product55
{
   public static void main(String args[])
   {
      int x,a,b,mul;
      System.out.println("input :");
      Scanner in = new Scanner(System.in);
     
      a = in.nextInt();
      b = in.nextInt();
     mul = a*b;
      if (mul % 2 == 0)
         System.out.println("output :" + "even" );
      else
         System.out.println("output" +  "odd");
   }
}