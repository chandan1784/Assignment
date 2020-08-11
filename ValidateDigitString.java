
public class ValidateDigitString {
	
	

	public static void main(String[] args) 
	{ 
		int counter=0;
		
		
		String input = "1234567A"; 
		char[] arr = input.toCharArray(); 
		
		for(int i=0;i<input.length();i++)
		{
			if(arr[i]>='0' && arr[i]<'9')
				counter++;
				
				
				
			
			    
		}
		//System.out.println(counter);
		
		if(counter==input.length())
			System.out.println("has only digits");
		else
			System.out.println("Invalid");
		
	}
	

}
