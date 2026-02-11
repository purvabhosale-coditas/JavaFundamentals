package javacoursepackage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Program8Serialize {

	public static void main(String[] args) {
		
		System.out.println("Writing..");
		User user[] = {new User("Purva","PB123","pb@gmail.com"), 
				new User("Ayush", "122was", "ayush@gmail.com")};
		
		try (FileOutputStream file = new FileOutputStream("user.txt")) {
			
			ObjectOutputStream obj =  new ObjectOutputStream(file);
			
			obj.writeObject(user);
			
			obj.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
