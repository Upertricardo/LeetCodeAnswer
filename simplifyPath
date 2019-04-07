class Solution {
    public String simplifyPath(String path) {
        Stack<String> pathStack = new Stack<>();
		int i = path.length() - 1;
		StringBuilder sb = new StringBuilder();
		while (i >= 0) {
			char getc = path.charAt(i);
			if (getc == '/') {
				if (!sb.toString().isEmpty()) {
					if (sb.toString().equals(".")) {
						sb = new StringBuilder();
					} else {
						if (!pathStack.isEmpty()) {
							if (pathStack.peek().equals("/..") && !sb.toString().equals("..")) {
								sb = new StringBuilder();
								pathStack.pop();
								i--;
								continue;
							}
						}
						pathStack.push("/" + sb.reverse().toString());
						sb = new StringBuilder();
					}
				}
			} else {
				sb.append(getc);
			}
			i--;
		}
		sb = new StringBuilder();
		while (!pathStack.empty()) {
			String pa = pathStack.pop();
			pa = pa.equals("/..") ? "" : pa;
			sb.append(pa);
		}
		if (sb.toString().isEmpty()) {
			sb.append("/");
		}
		return sb.toString();
    }
}
