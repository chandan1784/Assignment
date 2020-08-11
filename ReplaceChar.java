
public class ReplaceChar {
	
	
	String myReplace(String str,char oldChar , char newChar)
	{
	char[] arr=str.toCharArray();
	for(int i=0;i<str.length();i++){
	if(arr[i]==oldChar)
	arr[i]=newChar;
	}
	String manStr=new String(arr);
	return manStr;
	}


	public static void main(String[] args) {
		ReplaceChar scm=new ReplaceChar();
		String data=scm.myReplace("test data", 't', 'w');

		System.out.println(data);
	}

}
