public class Exercise2 {
    public static int factorial(int n) {
        return n==1 ? 1 : n * factorial(n - 1);
    }

    public static int exp (int x, int n){
            return n == 0 ? 1 : x * exp(x, n - 1);
        }

    public static int countDigit (int n){
        return n >= 10 ? 1 + countDigit(n / 10) : 1;
    }
    
    public static int findGCD(int a, int b){
            return b == 0 ? a : findGCD(b, a % b);
    
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(exp(2, 5));
        System.out.println(countDigit(145442345));
        System.out.println(findGCD(20,10));
    }
}