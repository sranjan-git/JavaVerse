//  pinting numbers form 1 to n

import java.util.*;

public class c{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();;
        int counter = 1;

        while(counter <= range){
            System.out.print(counter + " ");
        }
        System.out.println();
    }
}