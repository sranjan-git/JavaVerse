// inverted star pattern

package patterns;

public class b {
    public static void main (String args[]){
        int n = 4;
        for (int line = 1; line <= n; line++){
            for(int star = 1; star <= star-n+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
