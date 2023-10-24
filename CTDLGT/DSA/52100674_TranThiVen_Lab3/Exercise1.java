public class Exercise1{
    //a
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    //b
    public static int exponential (int x, int n){
        int exp = 1;
        for (int i = 1; i <=n; i++) {
            exp *= x;
        }
        return exp;

    }
    //c
    public static int countDigit(int n){
        int count =0;
        while( n>0){
            n /= 10;
            count++;
        }
        return count;
    }
    //d
    public static boolean checkForPrime(int intn){
        boolean isItPrime = true;
        if(intn <= 1) {
            isItPrime = false;
        return isItPrime;
        }
        else
        {
        for (int i = 2; i<= intn/2; i++) {
            if ((intn % i) == 0)
        {
            isItPrime = false;
            break;
        }
    }
    return isItPrime;
}
}
    //e
    public static int GCD(int a, int b){
        int gcd=1;
        if(a>b){
            for(int i= b; i>0;i--){
                if(a % i == 0 && b % i == 0){
                    gcd = i; 
            }
        }
    }
    else{
        for(int i = a; i>0; i--){
            if( a % i == 0 && b % i == 0){
                gcd = i; 
            }
        }
    }
    return gcd;
    }
    public static void main(String[] args){
        System.out.println(factorial(4));
        System.out.println(exponential(2,5));
        System.out.println(countDigit(1234567));
        System.out.println(checkForPrime(2));
        System.out.println(GCD(2,4));
    }
}