package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_write {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);

		System.out.print("���� : ");
		String Filename = scan.next();
		if(!Filename.contains(".txt")) {
			Filename += ".txt";
		}
		Scanner Filescan = new Scanner(Filename);
		int n = 0;
		while(Filescan.hasNext()) {
			n++;
			break;
		}
		Boolean tf = null;			
		if(n != 0) {
			System.out.print("����ðڽ��ϱ�?");
			String YS = scan.next();
			
			if(YS.equals("Y") || YS.equals("y"))
				tf = true;//�����
			else
				tf = false;//���� ����
		}
		System.out.print("�� ���� : ");
		String content = scan.next();

		
		File file = new File(Filename);
		FileWriter fw = new FileWriter (file,tf);

		fw.write(content);
        fw.flush();
        
        System.out.println("���� �Ϸ�");
    }

}
