// print reverse of a number
import java.util.*;
public class g {
    public static void main(String args[]){
        int n = 10899;

        while(n>0){
            int lastDigit = n%10;
            System.out.println(lastDigit + " ");
            n = n / 10;
        }
    }
}
