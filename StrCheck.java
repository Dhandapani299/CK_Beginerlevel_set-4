import java.io.*;
import java.util.*;
public class StrCheck {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
        int[] num = {1, 2, 3, 4, 5, 6, 7 , 8, 9, 10};
        int toFind = scan.nextInt();
        boolean found = false;

        for (int n : num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println(toFind + " yes.");
        else
            System.out.println(toFind + " no");
    }
}