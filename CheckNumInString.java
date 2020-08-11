
public class CheckNumInString {

	public static boolean isNum(String str){
		for(int i=0; i<str.length(); i++){
			
			char[] arr=str.toCharArray();
			if(arr[i] >= '0' && arr[i] <='9')
				return true;
			}
	
		return false;
	}
	
	
	
	
	
	
	static void check(String str)  
	{  
	    boolean res = isNum(str);  
	  
	    if (res == true)  
	        System.out.println( "yes" );  
	  
	    else
	        System.out.println( "No" );  
	} 
	
	
		
		
	
	
	public static void main(String args[]) 
	{  
	    String str1, str2;  
	  
	    str1 = "cky123";  
	
	    check(str1);  
	  
	   
	    str2 = "cky67778";  
	    check(str2);  
	}  
}
