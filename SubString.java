
public class SubString {
	
	
	
		String mySubStr(String str, int index)
		{
		char[] arr=str.toCharArray();
	
		char[] arr1= new char[100];
		//String c="";
		
		
		int j=0;
		
		for(int i=index;i<str.length();i++){
		
			arr1[j]=arr[i];
			//c=c+arr[i];
			
			j++;
		}
		String manStr=new String(arr1);
		return manStr;
		}
		
		
		
		
		
		String mySubStr(String str, int index, int index1)
		{
		char[] arr=str.toCharArray();

		char[] arr1= new char[100];
	      //	String b="";
		
		int j=0;
		
		
		for(int i=0;i<str.length();i++){
				
			if(i>=index && i<=index+index1-1)
				continue;
			else

				{arr1[j]=arr[i];
				//b=b+arr[i];
				j++;}
		}
		String manStr=new String(arr1);
		return manStr;
		}
		
		

		public static void main(String[] args) {

		SubString store=new SubString();
		SubString store1=new SubString();
		
		String data=store.mySubStr("Hello World", 3 );
		String data1=store1.mySubStr("Hello World",1,3);

		System.out.println(data);
		System.out.println(data1);

		}

}
