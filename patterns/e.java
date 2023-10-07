// hollow rectangle
package patterns;
public class e {

    public static void main(String[] args) {
        int rows = 4;
        int columns = 5;

        // Print the top row
        for (int i = 0; i < columns; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Print the middle rows
        for (int i = 0; i < rows - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < columns - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        // Print the bottom row
        for (int i = 0; i < columns; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
