package lab4;

import java.io.*;
public class Question1 {
	public static void main(String[] args) {
		FileInputStream f = null;
		try {
			f = new FileInputStream("E:\\sai.txt");
			int line = 0;
			while ((line = f.read()) != -1) {
				System.out.print((char) line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			f.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}