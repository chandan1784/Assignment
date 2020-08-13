package numberformat;

public class LowercaseString {
	
	String LowerCase(String str)
	
	{
		int temp=0;
	char[] arr = str.toCharArray();
	
	for(int i=0;i<str.length();i++)
	{
		if(!(arr[i]>=65 && arr[i]<=90))
			continue;
		else
		{
			  temp = (int)arr[i];
		        temp = temp +32;
		        arr[i] = (char) temp;
		}
		
		
	}
	String manStr=new String(arr);
	return manStr;
		
	}
	

	
	public static void main(String[] args) {
		
		
		LowercaseString str=new LowercaseString();
		
	 String us =str.LowerCase("HeLLo");
	 System.out.println(us);
	}

}
