package String;

import java.util.Scanner;

public class String_indexOf {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		String str = scan.next();
		
		scan.close();
		if(str.indexOf("w")>-1)
			System.out.println("w�� �ִ� ��ġ "+(str.indexOf("w")+1));
		else
			System.out.println("w�� �����ϴ�.");

	}

}
