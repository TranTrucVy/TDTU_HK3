// public class Cau4{
//     public static int countOdd (int[] a, int n){
//         if (n == 0) return 0;
//         if (a[n-1] % 2 != 0)return 1 + countOdd(a,n-1);
//         return countOdd(a,n-1); 
//     }
//     public static void main (String[] args){
//         int[] a = {1,1,1,1,3,10,5,9,12,18};
//         System.out.println(countOdd(a,a.length));
//     }
// }
public class Cau2{
    public static boolean checkCP(int n, int k){
    if(k<=0) return false;
    if(k*k==n) return true;
    else return checkCP(n,k-1);
    }

    public static int checkSCP(int[] arr, int k){
        if(k<0) return 0;
        if(checkCP(arr[k],arr[k])) return 1 + checkSCP(arr, k-1);
        else return checkSCP(arr, k -1);
    }

    public static void main(String[] args){
        int[] arr = {2,3,5};
         System.out.println(checkSCP(arr,arr.length-1));
    }
}

public class Exercise2 {
    // 2^i
    public static double a_1 (int n){
        if (n == 1) return 2;
        return Math.pow(2,n) + a_1(n-1);
    }
    public static int a_2 (int n){
        int sum = 0;
        for (var i = 1; i<=n; i++){
            sum += Math.pow(2, i);
        }
        return sum;
    }
    // (x+1)/2
    public static int b_1(int n){
        if (n == 0) return 0;
        return (n+1)/2 + b_1(n-1);
     }
     public static int b_2(int n){
        int sum = 0;
        for (var i = 0; i<=n; i++){
            sum += (i+1)/2;
        }
        return sum;
     }
    //  (i!/(i-1)!)
     public static int fact (int n) {
        if (n == 0) return 1;
        return n*fact(n-1);
     }
     public static int c_1 (int n){
        if (n == 1) return 1;
        return fact(n)/fact(n-1) + c_1(n-1);
     }
     public static int c_2 (int n){
        int sum = 0;
        for (var i = 1; i<=n; i++){
            sum +=  fact(i)/fact(i-1);
        }
        return sum;
    }
    // (X*(x-1))
    public static int d_1 (int n){
        if (n == 1) return 0;
        return (n*(n-1)) + d_1(n-1);
     }
    public static int d_2 (int n){
        int sum = 0;
        for (var i = 1; i<=n; i++){
            sum +=  i*(i-1);
        }
        return sum;
    }
    // x
    public static int e_1 (int n){
        if (n == 1) return 1;
        return n * e_1(n-1);
     }
    public static int e_2 (int n){
        int prod = 1;
        for (var i = 1; i<=n; i++){
            prod *= i;
        }
        return prod;
    }


     public static void main(String[] args) {
        System.out.println(a_1(3));
        // System.out.println(a_2(3));

        System.out.println(b_1(3));
        // System.out.println(b_2(3));

        System.out.println(c_1(5));
        // System.out.println(c_2(5));

        System.out.println(d_1(5));
        // System.out.println(d_2(5));

        System.out.println(e_1(5));
        // System.out.println(e_2(5));

    }
}

public class Exercise7 {
    public static int findMin (int[] arr, int length){
        int min = 0;
        if (length == 1) {
            return arr[0] < min ? arr[0] : min;
        }
        return min = Math.min(arr[0], findMin(arr, length - 1));

    }
    public static int findMinn (int[] arr, int k){
        if (k == 0 )
            return arr[0];
        return arr[k]< findMinn(arr, k-1)? arr[k] : findMinn(arr,k-1);
    }

    public static int sum (int[] arr, int length){
        if (length == 0) return 0;
        return arr[length-1] + sum(arr, length - 1);
    }
    public static int countEven (int[] arr, int length){
        if (length == 0) return 0;
        if (arr[length-1] % 2 == 0) return 1 + countEven(arr, length - 1);
        return countEven(arr, length - 1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,0,8,9,10};
        System.out.println("Min of array: " + findMin(arr,arr.length));
        System.out.println("Min of array: " + findMinn(arr,arr.length-1));
        System.out.println("Sum of array: " + sum( arr,arr.length));
        System.out.println("Number of even element: " + countEven(arr,arr.length));
    }

}

public class Exercise3 {
    public static boolean checkPrime(int n, int d){
        if (n <= 2){
            return (n==2) ? true : false;
        }
        else if (n % d == 0){
            return false;
        }
        else if (d * d > n){
            return true;
        }
        return checkPrime(n, d + 1);
    }
    public static void main(String[] args) {
        System.out.println(checkPrime(8,2)); 
    }
}
public static int decimalToBinary(int n) {
    return (n == 0) ? 0: n % 2 + 10 * decimalToBinary(n / 2);
}
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

public class Cau2 {
    public static int recur(int n, int k) {
        if( k == 0 ){
            return 1;}
        return n*recur(n,k-1);
    }

    public static void main(String args[]){
		System.out.println(recur(3,5));
	}
}

public class Exercise1{
    public static double prod_recur(int a, int b){
        if (a>0 && b<0) return prod_recur(b, a);
        else if (a<0 && b<0) return prod_recur(-1*a, -1*b);
        if (a>b) return prod_recur(b, a);
        if (b == 0) return 0;
        return a + prod_recur(a, b-1);
    }
    public static int count (int n){
        int count = 0;
        while (n>0){
            n = n/10;
            count++;
        }
        return count;
    }
    public static int bin2dec(String n, int i){
        int size = n.length();
        if (i == size-1 ) return n.charAt(i) - '0';
        return ((n.charAt(i) - '0') << (size-i-1)) + bin2dec(n, i+1);
    }

    public static int maxDigit(int n){
        if (n<0) return maxDigit(-1*n);
        if (n==0) return 0;
        if (n%10>maxDigit(n/10)) return n%10;
        return maxDigit(n/10);
    }

    public static int maxElement(int a[], int n){
        int max;
        if (n == 1){
            max = a[0];
            return max;
        }
        return max = a[n-1] > maxElement(a,n-1) ? a[n-1] : maxElement(a,n-1);
    }
    public static int search(int[] a, int n, int key){
        if (n )
        if (n == 0 && a[0] == key){
            return 0;
        }
        return key == a[n-1] ? n-1 : search(a, n-1, key);

    }
    public static void main(String[] args) {
        // int[] a = {1,2,3,4,5,6,7,11,9,10};
        // int[] a = {6, 2, 9, 3};
        // System.out.println(prod_recur(3, -3));
        // System.out.println(bin2dec("1010", 0));

        // System.out.println(maxDigit(-6543));
        // System.out.println(maxElement(a, a.length));
        // System.out.println(search(a,  a.length, 11));
        System.out.println(prod_recur(3,5));
        System.out.println(bin2dec("1000", 0));
        System.out.println(maxDigit(1234));
        int[] a = {6, 2, 9, 3};
        System.out.println(maxElement(a, a.length));
        System.out.println(search(a, a.length, 15));

    }
}

public class Exercise3 {
    public static double a_1 (int n){
        return n==0 ? 2 : 2 - (a_1(n-1)/2);
    }
    public static double a_2 (int n){
        double sum = 0.0;
        double temp = 2;
        for (var i = 1 ; i<=n; i++){
            sum = 2 - (temp/2);
            temp = sum;
        }
        return sum;
    }

    public static double b_1 (int n){
        if (n<10) return 1;
        else return 1+b_1((n-1)/10);
    }

    public static double b_2 (int n){
        double sum = 0.0;
        for (var i = 1 ; i<=n; i++){
            if (i < 10)
                sum = 1;
            else
                sum = 1+b_2((i-1)/10);
        }
        return sum;
    }
    public static double c_1 (int n, int k){
        if (k == 1) return n;
        else return n + c_1 (n,k-1);
    }
    //Do same c_1(int n, int k) but with iteration
    public static double c_2 (int n, int k){
        double sum = 0.0;
        for (var i = 1 ; i<=k; i++){
            if (k == 1)
                sum = n;
            else
                sum += n;
        }
        return sum;
    }
    //F(n − 1) + F(n − 2), F(1) = 1, F(0) = 0

    //calculate fibonacci number with recursion
    public static int d_1 (int n){
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return d_1(n - 2) + d_1(n - 1);
    }

    //calculate fibonacci number with iteration
    public static int d_2 (int n){
        int previousNumber = 0;
        int nextNumber = 1;
        for (int i = 2; i <= n; ++i) {
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
        return nextNumber;
    }
    public static void main(String[] args) {
        System.out.println(a_1(5));
        System.out.println(a_2(5));
        System.out.println(b_1(1000));
        System.out.println(b_2(1000));
        System.out.println(c_1(100,500));
        System.out.println(c_2(100,500));
        System.out.println(d_1(5));
        System.out.println(d_2(5));

    }
}
