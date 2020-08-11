
public class CheckTenDigitStr {

	
	public static void main(String[] args) 
	{ 
		int counter=0;
		
		
		String input = "1234567890"; 
		char[] arr = input.toCharArray(); 
		
		if(input.length()==10)
		{
			System.out.println("Valid Length");
		
		for(int i=0;i<input.length();i++)
		{
			if(arr[i]>='0' && arr[i]<'9')
				counter++;
				
				
				
			
			    
		}
		}
		
		else
			System.out.println("Invalid Length");
		//System.out.println(counter);
		
		//if(counter==input.length())
		//	System.out.println("yes");
		//else
		//	System.out.println("No");
		
	}
}
