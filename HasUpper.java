
public class HasUpper {
	
	//char[] arr=var.toCharArray();
	
	
	public static boolean hasUpper(String str){
		for(int i=0; i<str.length(); i++){
			//char c = str.charAt(i);
			char[] arr=str.toCharArray();
			if(arr[i] >= 65 && arr[i] <=90)
				return true;
			}
		
		//str.charAt(index)
		return false;
	}
	
	
	
	
	
	
	static void check(String str)  
	{  
	    boolean res = hasUpper(str);  
	  
	    if (res == true)  
	        System.out.println( "yes" );  
	  
	    else
	        System.out.println( "No" );  
	} 
	
	
		
		
	
	
	public static void main(String args[]) 
	{  
	    String str1, str2;  
	  
	    str1 = "CKy";  
	
	    check(str1);  
	  
	   
	    str2 = "cky";  
	    check(str2);  
	}  
	
}
