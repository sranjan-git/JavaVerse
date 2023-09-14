import java.util.*;

public class a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read an integer from the user's input.

        if (num >= 0) {
            System.out.println("number is positive");
        } else {
            System.out.println("number is negative");
        }
    }
}
