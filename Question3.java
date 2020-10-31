package lab4;
import java.io.*;
public class Question3 {
	public static void main(String[] args) {
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tester3.ser"));
			Employee employee = new Employee("kiran",12121, "andhrapradesh", 50000.0);
			oos.writeObject(employee);
			employee.display();
			System.out.println("serialized successfully");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("tester3.ser"));
			Employee employeeObj = (Employee) ois.readObject();
			employeeObj.display();
			System.out.println("deserialized successfully");
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}