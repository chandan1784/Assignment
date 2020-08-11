
public class StringOverload {
	
	
	
	String mySubStr(String str, int index, int index1)
	{
	char[] arr=str.toCharArray();
//	String str1= new String();
//char[] arr1=str1.toCharArray();
	char[] arr1= new char[100];
	
	int j=0;
	
	
	for(int i=0;i<str.length();i++){
			
		if(i>=index && i<=index+index1-1)
			continue;
		else

			{arr1[j]=arr[i];
			j++;}
	}
	String manStr=new String(arr1);
	return manStr;
	}

	public static void main(String[] args) {

	StringOverload store=new StringOverload();
	String data=store.mySubStr("Hello World", 4,3);

	System.out.println(data);

	}

}
