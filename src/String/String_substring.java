package String;

import java.util.Scanner;

public class String_substring {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		String str = scan.next();

		scan.close();
		
		System.out.println("a���ڿ��� 4���� 6�������� �ܾ� ��������");
		System.out.println(str.substring(4,6));
	}

}
