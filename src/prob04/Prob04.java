package prob04;

import java.util.Scanner;

public class Prob04 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();		
		char[] reverse = reverse(str);
		printCharArray(reverse);
		sc.close();
	}
	
	public static char[] reverse(String  str) {
		char[] reverse = new char[str.length()];
		for(int i=str.length(); i>0; i--) {
			reverse[str.length()-i] = str.charAt(i-1);
		}
		return reverse;		
	}
	
	public static void printCharArray(char[] array) {
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i]);
		}
		
	}
}
