class Solution {
    public boolean isValid(String s) {
        		Stack<Integer> bracketStack = new Stack<>();
		Stack<Integer> postStack = new Stack<>();
		int lengthen = s.length();
		if (lengthen == 0) {
			return true;
		} else if ((lengthen&1)==1) {//括号数为奇数的时候一定是不匹配的
			return false;
		} else {//优先级栈
			for (int i = 0; i < lengthen; i++) {
				switch (s.charAt(i)) {
				case '{':
					bracketStack.push(1);
					break;
				case '[':
					bracketStack.push(2);
					break;
				case '(':
					bracketStack.push(3);
					break;
				case ')':
					bracketStack.push(4);
					break;
				case ']':
					bracketStack.push(5);
					break;
				case '}':
					bracketStack.push(6);
					break;
				default:
					break;
				}
			}
		}
		int a, b;
		for (int i = 0; i < lengthen; i++) {
			if (postStack.isEmpty()) {
				b = bracketStack.pop();
				if (b < 4) {
					return false;
				} else {
					postStack.push(b);
					continue;
				}
			} else {
				a = postStack.peek();
				b = bracketStack.peek();
				if (7 == (a + b)) {
					postStack.pop();
					bracketStack.pop();
				} else {
					if (b > 3) {
						postStack.push(b);
						bracketStack.pop();
						continue;
					} else {
						return false;
					}
				}
			}
		}
		if (postStack.isEmpty()) {
			return true;
		}else {			
			return false;
		}
    }
}
