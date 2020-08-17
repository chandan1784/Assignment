
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
		arrayPrint(str1);
		

	}
	
	public static void arrayPrint(String[] anStringArray) {
		for(int i=anStringArray.length-1; i>=0;i--)
		{
			System.out.println(anStringArray[i]);
		}
	}

}
