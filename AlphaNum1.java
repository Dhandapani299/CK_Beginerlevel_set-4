
import java.io.*;
import java.util.Scanner;
import java.util.regex.*;
public class AlphaNum1{


public static boolean isStringOnlyAlphabet(String str) 
    { 
        return ((str != null) 
                && (!str.equals("")) 
                && (str.matches("^[a-zA-Z0-9]*$"))); 
    } 

public static void main (String args[]){
Scanner scan = new Scanner(System.in);
String str1 = scan.nextLine(); 
        System.out.println("Input: " + str1); 
        System.out.println("Output: " + isStringOnlyAlphabet(str1)); 
  



}
}