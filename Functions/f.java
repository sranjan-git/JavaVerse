// binolial coefficient
public class f {
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
        }
    
public static int binCoeff(int n, int r){
    int fact_n = factorial(n);
    int fact_r = factorial(r);
    int fact_nmr = factorial(n-r);

    int binCoeff = fact_n / (fact_r * fact_nmr);
    return binCoeff;
}
public static void main(String args[]){
    System.out.println("Binomial Coefficient: " +binCoeff(40,2)); 
} 
}
    