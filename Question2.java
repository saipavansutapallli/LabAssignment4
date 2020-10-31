package lab4;

import java.io.*;

public class Question2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String wr = "";
		wr = br.readLine();
		BufferedWriter bw = new BufferedWriter(new FileWriter("tester2.txt"));
		bw.write(wr);
		System.out.println("data written successfully...");
		bw.close();
		br.close();
	}
}
