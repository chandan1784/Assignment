//question 1:  write a java function to break the given string when a space is encountered
public class Sba1 {
	
	public static void main(String[] args) {
		String str = "This Is Java Programming";
		
		String[] str1 = str.split(" ");
		printString(str1);
		

	}
	
	public static void printString(String[] StringArray) {
		for (String str: StringArray) {
			System.out.println(str);
		}
	}
}
