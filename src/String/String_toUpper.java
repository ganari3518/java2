package String;

import java.util.Scanner;

public class String_toUpper {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		scan.close();
		
		System.out.println("str : " + str.toUpperCase());
	}


}
