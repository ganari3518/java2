package String;

import java.util.Scanner;

public class String_charAt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		scan.close();
		
		for(int i=0;i<str.length() ; i++) {
			System.out.println("str "+i+"��° �ܾ� : " + str.charAt(i));
		}
	}

}
