
public class ReverseString 
{ 
	public static void main(String[] args) 
	{ 
		String input = "Hello World"; 
		char[] temparray = input.toCharArray(); 
		int left, right=0; 
		right =input.length()-1;// temparray.length-1; 
		
	 
	//	System.out.println(right);

		for (left=0; left < right ; left++ ,right--) 
		{ 
			// Swap values of left and right 
			char temp = temparray[left]; //first store initial left value in temp
			temparray[left] = temparray[right]; //new left value
			temparray[right]=temp; //final right value, get it from temp
		} 

		for (char c : temparray) 
			System.out.print(c); 
		System.out.println(); 
	} 
} 

