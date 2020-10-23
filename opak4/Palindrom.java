
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String output = "";
        
        for (int i = input.length() - 1; i > -1; i--) {
            output += input.charAt(i);
        }
        System.out.println(output);
    }
}