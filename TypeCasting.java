// import java.util.*;

// public class TypeCasting {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         float marks = 59.9f;
//         int marks2 = (int) marks;
//         System.out.println(marks2);
//     }
// }

// typecasting is also known as narrowing conversion.
// On  going from bigger to lower type conversion there is more data loss and vice versa.

// Example:

import java.util.*;

public class TypeCasting {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char ch = 'a';
        char ch2 = 'b';
        int number = ch;
        int number2 = ch2;
        System.out.println(number);
        System.out.println(number2);
    }
}
