import java.util.Stack;

public class Cau3 {

	private static boolean isNumber(String str) {
		return str.matches("0|([1-9][0-9]*)");
	}

	public static int calculate(String[] expression) {
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < expression.length; i++) {
			if (isNumber(expression[i])) {
				stack.push(Integer.parseInt((expression[i])));
			} else {
				switch (expression[i]) {
				case "+": {
					Integer a = stack.pop();
					Integer b = stack.pop();
					System.out.println(a + b);
					stack.push(b + a);
					break;
				}
				case "-": {
					Integer a = stack.pop();
					Integer b = stack.pop();
					System.out.println(a - b);
					stack.push(b - a);
					break;
				}
				}
			}
		}
		System.out.print(stack.peek());
		return 1;
	}

	public static void main(String[] args) {
		String[] arr = { "3", "4", "+", "2", "1", "+", "-" };
		calculate(arr);
	}
}


// import java.util.Stack;

// public class Exercise1 {
//     public static boolean isOperator (String value){
//         switch(value){
//             case "+": case "-" : case "*" : case "/" : return true;
//             default : return false;
//         }
//     }

//     public static String calculate (String x, String y, String operator){
//         int a = Integer.parseInt(x);
//         int b = Integer.parseInt(y);
//         switch (operator) {
//             case "+" : return String.valueOf(a + b);
//             case "-" : return String.valueOf(a - b);
//             case "*" : return String.valueOf(a * b);
//             case "/" : return String.valueOf(a / b);
//             default: return "0";
//         }

//     }
//     public static String calPostfix (String[] spl){
//         Stack<String> stack = new Stack<String>();
//         for (String s : spl){
//             String operator = s;
//             if (!isOperator(s)){
//                 stack.push(s);
//             }
//             else {
//                 String a = stack.pop();
//                 String b = stack.pop();
//                 String result = calculate (b,a,operator);
//                 stack.push(result);
//             }
//         }
//         return stack.peek();
//     }
//     public static void main(String[] args) {
//         String postFix = "9 2 - 6 * 7 + 7 / 7";
//         String[] spl = postFix.split(" ");
//         System.out.println(Integer.parseInt(calPostfix(spl)));
//     }
// }
public static boolean checkPalindrome(String str){
    Stack<Integer> stack = new Stack<String>();
    String[] list = str.split("");
    for(String s:list){
    stack.push(s);
    }
    for(String s: list){
        if(!stack.pop().equals(s)) return false;
    }
    return true;
}   
public static boolean checkPalindrome(int n){
    Stack<Integer> stack = new Stack<String>();
    int t = n;
    while(t>0){
        Stack.push(t%10);
        t/=10;
    }
    while(!stack.isEmpty()){
    int tmp = stack.pop();
    if(tmp!=n%10) return false;
    n/=10;
    }
    return true;
}
public class Exercise2 {
    public static boolean checkPalindrome (Stack<Character> stack, Queue<Character> queue, int value){
        String number = String.valueOf(value);
        for (char n : number.toCharArray()){
            stack.push(n);
            queue.enQueue(n);
        }
        while (!stack.isEmpty() || !queue.isEmpty()){
            if (stack.pop() != queue.deQueue()){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>(10);
        Queue<Character> queue = new Queue<>(10);
        System.out.println(checkPalindrome(stack, queue, 1221));
        // System.out.println("Stack is activated: ");
        // stack.push(1);
        // stack.push(3);
        // stack.push(2);
        // stack.push(1);
        // System.out.println("Queue is activated: ");
        // queue.enQueue(1);
        // queue.enQueue(3);
        // queue.enQueue(2);
        // queue.enQueue(1);
        // System.out.println("Displaying: ");
        // stack.printStack();
        // queue.printQueue();
        // System.out.println("Stack: "+stack.pop());
        // System.out.println("Queue: "+queue.deQueue());
        // System.out.println("Stack: "+stack.pop());
        // System.out.println("Queue: "+queue.deQueue());
        // System.out.println("Stack: "+stack.pop());
        // System.out.println("Queue: "+queue.deQueue());
        // System.out.println("Stack: "+stack.pop());
        // System.out.println("Queue: "+queue.deQueue());

    }
}

// public class Cau2 {
//     public static String reverseSentence(String str) {
//         Stack<String> stack = new Stack();
//         String res = "";
//         String[] splitString = str.split(" ");
//         for (String word : splitString) {
//             stack.push(word);
//         }
//         while (!stack.isEmpty()) {
//             res += stack.pop() + " ";
//         }
//         return res.trim();
//     }

//     public static void main(String[] agrs) {
//         System.out.println(reverseSentence("i am student"));
//     }
// }
public class Exercise3 {
    public static String reverse (String string){
        Stack<String> stack = new Stack<>(string.length());
        String result = "";
        for (String sub :  string.split(" ")){
            stack.push(sub);
        }
        while (!stack.isEmpty()){
            result += stack.pop() + " ";
        }
        return result;
    }
    public static void main(String[] args) {
        String string = "I like apple";
        System.out.println(reverse(string));
    }
}

import java.util.Stack;
public class Cau2 {
    public static String reverseInt(int[] arr){
        Stack <Integer> newStack = new Stack<Integer>();
            // for (int item: arr){
            //     newStack.push(item);
            // }
            // String result = "";
            // while (!newStack.isEmpty()){
            //     result += Integer.toString(newStack.pop());
            // }
            // return result;
            for(int item: arr){
                newStack.push(item);
            }
            String res="";
            while(!(newStack.isEmpty())){
                res += newStack.pop();
            }
            return res;
    }
    public static void main(String[] args) {
        int[] a = {1,2,4,5,6,7,5};
        System.out.println(reverseInt(a));
    }
}    


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

public class elimRecursive {

    public static int exp(int n) {
        if (n == 0)
            return 1;
        return 2 * (exp(n - 1));

    }
    //Power function
    public static int pow(int a, int n) {
        if (n != 0)
            return a * pow(a, n - 1);
        return 1;
    }
    public static int elimRecursive(int n) {
        Stack<Integer> myStack = new Stack<Integer>(n);
        int result = 0;
        for (int i = n; i != 1; i--) {
            myStack.push(exp(n) + pow(n, 2));
            n--;
        }
        myStack.push(3);
        while (!myStack.isEmpty()) {
            result += myStack.pop();
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(elimRecursive(5));
    }
}

import java.util.Scanner;

public class isBalanced {
    public static boolean isBalanced(char[] arr, Stack<Character> stack) {
        for (char i : arr) {
            if (i == '(' || i == '{' || i == '[') {
                stack.push(i);
            }
            if (stack.isEmpty()) return false;
            char check;
            switch (i) {
                case ')':
                    check = stack.pop();
                    if (check == '[' || check == '{')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '[' || check == '(')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());      
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        char[] charArr = string.toCharArray();
        // System.out.println(charArr.length);
        Stack<Character> stack = new Stack<Character>(charArr.length);
        if (isBalanced(charArr, stack))
            System.out.println("String is balanced");
        else
            System.out.println("String is not balanced");
        
    }
}

