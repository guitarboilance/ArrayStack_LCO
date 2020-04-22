package jsjf;

public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/**
	 * testing the methods I implimented
	 */
		ArrayStack as = new ArrayStack();
		as.push("hi");
		as.push("bye");
		System.out.println("Stack is empty: " + as.isEmpty());
		System.out.println("Stack Size: " + as.size());
		/*
		while (as.isEmpty()==false) {
			System.out.println(as.pop());
			as.toString();
		}
		*/
		System.out.println(as.toString());
	}

}
