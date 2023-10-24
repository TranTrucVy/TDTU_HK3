public class Cau4{
    public static int countOdd (int[] a, int n){
        if (n == 0) return 0;
        if (a[n-1] % 2 != 0)return 1 + countOdd(a,n-1);
        return countOdd(a,n-1); 
    }
    public static void main (String[] args){
        int[] a = {1,1,1,1,3,10,5,9,12,18};
        System.out.println(countOdd(a,a.length));
    }
}