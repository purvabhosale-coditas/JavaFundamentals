package javacoursepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Program8Deserialize {

	public static void main(String[] args) {
		System.out.println("Reading..");
		
		try (FileInputStream file = new FileInputStream("user.txt")) {
			
			ObjectInputStream obj =  new ObjectInputStream(file);
			
			User user[] = (User[])obj.readObject();
			
			for(User myusers : user) {
				System.out.println(myusers);
			}
			
			obj.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
