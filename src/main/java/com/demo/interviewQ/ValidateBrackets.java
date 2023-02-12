package com.demo.interviewQ;

import java.util.Stack;

public class ValidateBrackets {

	public static void main(String[] args) {

		String s = "{[(()))]}";
		int l = s.length();
		System.out.println(l);

	boolean status = isValidateBracket(s);
	if(status)
	{
		System.out.println(s + "is :"+"Valid" );
	}
	else {
		System.out.println(s + "is :"+"Not Valid" );
	}
	}

	public static boolean isValidateBracket(String s) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			System.out.println(i+""+ch);
			if (ch == ')') {
				if (stack.peek() == '(') {
                    stack.pop();
				} else {
					return false;
				}
			} else if (ch == '}') {

				if (stack.peek() == '{') {

					stack.pop();
				} else {
					return false;
				}

			} else if (ch == ']') {

				if (stack.peek() == '[') {

					stack.pop();
				} else {
					return false;
				}

			} else {
				stack.push(ch);
			}
		}
		if(stack.size()==0)
			return true;
		else {
			return false;
		}
		
	}
}
