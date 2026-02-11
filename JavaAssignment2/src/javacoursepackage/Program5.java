package javacoursepackage;

public class Program5 {
	int x = 10;
	
	int changeValue(int a) {
		a =50;
		return a;
	}
	
	void changeObjValue(Program5 obj) {
		obj.x =50;
	}

	public static void main(String[] args) {
		int a = 10;
		
		Program5 obj = new Program5();
		System.out.println(a);
		a=obj.changeValue(a);
		System.out.println(a);
		
		System.out.println(obj.x);
		obj.changeObjValue(obj);
		System.out.println(obj.x);
		obj.x =60;
		System.out.println(obj.x);

	}

}
