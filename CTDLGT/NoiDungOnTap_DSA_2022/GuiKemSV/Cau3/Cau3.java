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
