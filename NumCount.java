import java.io.*;
import java.util.Scanner;
public class NumCount {
    
 public static void main(String[] args) {
Scanner scan= new Scanner(System.in);
		String test = scan.nextLine();
		count(test);

	}
	public static void count(String x){
		char[] ch = x.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
	System.out.println("input:");
		for(int i = 0; i < x.length(); i++){
			if(Character.isLetter(ch[i])){
				letter ++ ;
			}
			else if(Character.isDigit(ch[i])){
				num ++ ;
			}
			else if(Character.isSpaceChar(ch[i])){
				space ++ ;
			}
			else{
				other ++;
			}
		}
		
		System.out.println("output:" +num);
		
			}
}