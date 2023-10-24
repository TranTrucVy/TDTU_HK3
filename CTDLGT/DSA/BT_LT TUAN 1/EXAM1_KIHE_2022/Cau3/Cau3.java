import java.util.Stack;
public class Cau3 {
    public static String dec2oct(int num){
        Stack<Integer> stack = new Stack<Integer>();

        while (num != 0){
            int n = num % 8;
            stack.push(n);
            num /= 8;  
        }   
        String res = "";
        while( !(stack.isEmpty())){
            res += stack.pop();
        }
        return res;
    }
    public static void main (String[] args){
        System.out.println(dec2oct(1507));
    }
}