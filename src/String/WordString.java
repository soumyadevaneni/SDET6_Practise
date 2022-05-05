package String;

import java.util.Scanner;

public class WordString {

	public static void main(String[] args) {
				
		// TODO Auto-generated method stub
		/*
		 * System.out.println("we love we "); Scanner sc = new Scanner(System.in);
		 * String s=sc.nextLine(); int count=1; for(int i=0;i<s.length()-1;i++) {
		 * if((s.charAt(i)==' ') &&(s.charAt(i+1)!=' ')) { count++; }
		 * System.out.println("Number of words ina string is :"+count); }
		 */
		String str = "we love java  we love testing";
	     String s1[]=str.split(" ");
		String word="java";
		int count=0;
		for(int i=0;i<s1.length;i++) {
			if(s1[i].equals(word))
				count++;
		}
		System.out.println("The number of words in a string is " + count);
		


	}}