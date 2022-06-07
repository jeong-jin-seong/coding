package kr.ac.green;

import java.io.File;

public class FileEx1 {
	public static void main(String[] args) {
		// c:\\test\\a.txt
		
		File f1 = new File("c:\\test\\a.txt");
		
		File dir = new File("c:\\test");		
		File f2 = new File(dir, "a.txt");
		
		File f3 = new File("c:\\test", "a.txt");
	}
}
