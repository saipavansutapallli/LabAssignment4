package lab4;
import lab4.InputException;
import java.io.IOException;
public class Question7 {
	public static void main(String[] args) {
		ExceptionExample ex = new ExceptionExample();
		try {
			ex.throwException();
		} catch (InputException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
