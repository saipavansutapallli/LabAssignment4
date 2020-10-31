package lab4;

import java.util.Scanner;
public class Question5 {
	public static void main(String[] args) {
		try(Scanner n= new Scanner(System.in)) {
			System.out.println("Please enter a number");
			int num = n.nextInt();
			try {
				if(num > 100) {
					throw new Exception();
				}
			}catch (Exception e) {
				System.out.println("Number can't be greater than 100");
			}
		}
	}
}