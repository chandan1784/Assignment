package numberformat;

public class ToggleCaseString {
	
String ToggleCase(String str)
	
	{
		
	char[] arr = str.toCharArray();
	
	for(int i=0;i<str.length();i++)
	{
		int temp=0;
		
		if(arr[i]>=65 && arr[i]<=90)
		{	
			 temp = (int)arr[i];
		        temp = temp +32;
		        arr[i] = (char) temp;
		}
	//	if(!(arr[i]>=65 && arr[i]<=90))
		else
		{
			 temp = (int)arr[i];
		        temp = temp - 32;
		        arr[i] = (char) temp;
			
		}
		
		
	}
	String manStr=new String(arr);
	return manStr;
		
	}
	

	
	public static void main(String[] args) {
		
		
		ToggleCaseString str=new ToggleCaseString();
		
	 String us =str.ToggleCase("Cky");
	 System.out.println(us);
	}

}
