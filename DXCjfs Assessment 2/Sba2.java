//2)  write a java function to break the given string when a space is encountered and reverse each word
public class Sba2 {
	
	public static void main(String args[]) {
		String str = "This Is Java Programming";
		
		String reverse="";
		
		char[] arr = str.toCharArray();
		
		
		for(int i=str.length()-1;i>=0;i--)
		{
			
			reverse=reverse+arr[i];
		
		}
		
		
		String[] str1 = reverse.split(" ");
		printString(str1);
		

	}
	
	public static void printString(String[] StringArray) {
		for(int i=StringArray.length-1; i>=0;i--)
		{
			System.out.println(StringArray[i]);
		}
	}

}
