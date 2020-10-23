import java.util.Scanner;

public class OtoceneSlovo {
    public static void main(String[] args) {
        System.out.println("Zadejte slo ktere chcete otocit?");

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        System.out.println("Otocena cast:");
        System.out.println(sb.toString());
    }
}