// check if a number is prime 
import java.util.*; //utility package
public class l {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n == 2){
            System.out.println("n is prime");

        }else{
                 boolean isPrime = true;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println("n is not prime");
            }
        }
       
    }
}
    

