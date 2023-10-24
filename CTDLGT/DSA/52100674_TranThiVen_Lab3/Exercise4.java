import javax.lang.model.element.Element;

public class Exercise4 {
    public static int sigma1(int n){
        return n == 1 ? 2*n+1 : 2*n+1+ sigma1(n-1);
    }
    public static int sigma2(int target, int counter) {
        return (target == counter) ? target : counter * (1 + sigma2(target, counter + 1));
    }

    public static int product_fact(int target, int counter){
        return (target == counter) ? target : counter * (counter* product_fact(target, counter + 1));
    }

    public static int p_n(int r,int n){
        return (r > n && r <= 0) ? 1 : n * p_n(r - 1, n-1);
    }

    public static double caue (int n){
         return n == 1 ? 3 : Math.pow(2,n) + Math.pow(n,2) + caue(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sigma1(5));
        System.out.println(sigma2(5,1));
        System.out.println(product_fact(5,2));
        System.out.println(p_n(3,5));
        
    }
}