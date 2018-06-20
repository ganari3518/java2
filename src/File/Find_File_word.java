package File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Find_File_word {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("$ ");
		String menu = scan.next();
		String Filename;
		String word;
		while(!menu.equals("exit")) {
			if(menu.equals("show")) {
				Filename = scan.next();
				if(Filename.equals("help"))
					System.out.println("show [File Name]");
				else {
					show(Filename);
				}
			}
			else if(menu.equals("read")) {
				Filename = scan.next();
				if(Filename.equals("help"))
					System.out.println("read [File Name] [Find word]");
				else {
					word = scan.next();
//					read(Filename,word);
				}
			}
			else if(menu.equals("save")) {
				Filename = scan.next();
//				save();
			}
			else if(menu.equals("make")) {
				Filename = scan.next();
				if(Filename.equals("help"))
					System.out.println("make [File Name]");
				else 
					make(Filename);
			}
			
			System.out.print("$ ");
			menu = scan.next();
			
		}
		scan.close();
		System.out.println("End");
		
	}
	static void show(String Filename) throws Exception {
		Scanner Filescan = new Scanner(new File(Filename));
		String [] filecontents = new String[10000];
		
		int n=0;
		
		while(Filescan.hasNext()) {
			filecontents[n] = Filescan.next();	
			n++;
		}
			
		for(int i=0;i<n;i++) {
			System.out.println(i+" : " + filecontents[i]);
		}
		
		Filescan.close();		
	}
	static void make(String Filename) throws Exception {
		BufferedWriter out = new BufferedWriter(new FileWriter(Filename));
		out.close();
	}

}
