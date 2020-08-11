
public class ReplaceFirst {
	
	String replaceFirst(String var,char find , char replace)
	{
	char[] arr=var.toCharArray();
	for(int i=0;i<var.length();i++){
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
		
		ReplaceFirst scm=new ReplaceFirst();
		String data=scm.replaceFirst("princee", 'e', 'y');

		System.out.println(data);
	
	}

}
