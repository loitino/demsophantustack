package basic.dev;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Cau2_stack {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> s = new Stack<Integer>();
		
		s.push(5);
		s.push(6);
		s.push(7);
		s.push(8);
		s.push(9);
		s.push(10);
		System.out.println(s.size());
		int n = sc.nextInt();
		System.out.println(s.get(n-1));
	}

}
