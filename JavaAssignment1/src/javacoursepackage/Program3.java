package javacoursepackage;

public class Program3 {

	public static void main(String[] args) {

		int arr[] = {3,4,5,1,2};
		int large = arr[0];
		int small = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>large) {
				large = arr[i];
			}
			else if(arr[i]<small){
				small = arr[i];
			}
		}
		
		System.out.println("Largest: " + large);
        System.out.println("Smallest: " + small);

	}

}
