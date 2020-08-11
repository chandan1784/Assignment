
public class ReplaceLastChar {
	

	String replaceLast(String var,char find , char replace)
	{
	char[] arr=var.toCharArray();
	for(int i=var.length()-1;i>=0;i--){
	if(arr[i]==find)
	{
		arr[i]=replace;
		break;
	   
	}
	}
	String manStr=new String(arr);
	return manStr;
	
	}

	public static void main(String[] args) {
		
		ReplaceLastChar scm=new ReplaceLastChar();
		String data=scm.replaceLast("princee", 'e', 'y');

		System.out.println(data);
	
	}

}
