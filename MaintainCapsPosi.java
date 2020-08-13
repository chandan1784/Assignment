public class MaintainCapsPosi {
	
String MaintainCaps(String str)
	
	{
		
		//String b="";
	char[] arr = str.toCharArray();
	char[] arr1= new char[arr.length];
	int j=0;
	
	//reverse
	for(int i=str.length()-1;i>=0;i--)
	{
		
		arr1[j]=arr[i];
		j++;
		//b=b+arr[i];
		
    }
	//char[] arr1 = b.toCharArray();
	 int temp=0;
	
	//lowercase
	
	for(int i=0;i<str.length();i++)
	{
		 
		if(!(arr1[i]>=65 && arr1[i]<=90))
			{//System.out.println(i);
			continue;}
		else
		{
			//System.out.println(i);
			
			  temp = (int)arr1[i];
			  //System.out.println(temp);
		        temp = temp +32;
		        
		       // System.out.println(temp);
		        arr1[i] = (char) temp;
		      //  System.out.println(arr[i]);
		       // System.out.println();
		}
		
		
	}
	
	for(int i=0;i<str.length();i++)
	{

	if(arr[i] >= 65 && arr[i]<=90)
	{
	arr1[i]=(char)(arr1[i]-32);
	}

	}
	
	
	
	
	
	String manStr=new String(arr1);
	return manStr;
		
	}
	

	
	public static void main(String[] args) {
		
		
	MaintainCapsPosi str=new MaintainCapsPosi();
		
	 String us =str.MaintainCaps("HeLloWorld");
	System.out.println(us);
	}

	
	
	

	}


