package jsjf;

import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * initilizes the ArrayStack from ArrayStack.java, the Scanner from java.util.scanner;, and the repeat string to contain if the program will repeat or not
		 */
		ArrayStack as = new ArrayStack();
		Scanner input = new Scanner(System.in);
		String repeat = "";
		
		//while(repeat== "Y") {
		/**
		 * the do runs at least once and sets repeat to N initially
		 */
		do
		{
		repeat = "N";
		
		/**
		 * prompting the user to type a sentance and scans for user input
		 */
		System.out.print("Type a sentence: ");
		String sentance = input.nextLine();
		
		/**
		 * initializes a String array and splits the sentance into words
		 */
		String[] words = sentance.split(" ");
		
		
		/**
		 * reverseString String is initialized 
		 */
		String reverseString="";
		
		/**
		 * for each of the words in the words array, each word will be reversed and pushed to the reverseword variable
		 */
		for(String w:words) {
			String reverseword="";
			
			for(int i=w.length()-1;i>+(-1);i--) {
				reverseword=reverseword+w.charAt(i);
			}
			as.push(reverseword); 
		}
		
		/**
		 * System prints the appended reversed words pushed to the stack
		 */
		System.out.print("Reversed: " + as.toString() + "\n");
		
		/**
		 * asks user if they would like to repeat the program and scans for user input of "Y", the do repeats if the user input equals "Y"
		 */
		System.out.print("\nWould you like to enter another sentence? Y or N: ");
		repeat = input.nextLine();
		
		}
		while(repeat.equals("Y"));
		/**
		 * the user specified not to repeat the program so the system prints GOODBYE
		 */
		System.out.print("<GOODBYE>");
		
		//}//end while
		
		//System.out.println("Goodbye");
			
			
		/*
		for(int i =0; i < words.length; i++)
		{
			String word = words[i];
			
					
			for(int k = 0; k < word.length(); k++) {
				as.push(word.charAt(k));
			}
				
			if (i< words.length-1) {
				System.out.print(" ");
			}
			
			
			
			
			while (!as.isEmpty())
		{
			String ch = as.pop();
			System.out.print(ch + " ");
			
		}
			
			
			//as.push (word);
		}//end for
		
		*/
		
		
		/*
		
		
		*/
		
		//System.out.println ("reversed: ");
		
		/*
		
		
		String[] words = sentance.split(" "); // splits on the space between words

		for (int k = 0; k < words.length; k++) {
		    String word = words[k];
		    System.out.print(reverseWord(word));

		    if (i < words.length-1) {
		        System.out.print(" "); // space after all words but the last
		    }
		}
		
		public String reverseWord(String word) {
		    for( int i = 0; i < word.length(); i++) {
		        as.push(word.charAt(i));
		    }
		    return as.empty();
		}
		*/
		
			
		/*	
		while (!(as.isEmpty())) {
			System.out.println(as.pop());
		
		}//end while
		*/
		
	}//end main

}//end class