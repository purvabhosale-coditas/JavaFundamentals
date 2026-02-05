package javacoursepackage;

public class Program4 {

	public static void main(String[] args) {

        String input = "aaabbcccdd";
//        StringBuilder result = new StringBuilder();
        String result = "";

        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            if (i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1)) 
            {
                count++;
            } 
            else {
//                result.append(input.charAt(i)).append(count);
//            	result = result.concat(String.valueOf(input.charAt(i))).concat(String.valueOf(count));
            	result = result + input.charAt(i) + count;
                count = 1;   
            }
        }

        System.out.println("Output: " + result);

	}

}
