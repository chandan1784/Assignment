
public class CapsOnly {
	
	public static boolean isCapsOnly(String str){
		for(int i=0; i<str.length(); i++){
			
			char[] arr=str.toCharArray();
			if(arr[i] >= 97 && arr[i] <=122)
				return false;
			}
		
		
		return true;
	}
	
	
	
	
	
	
	static void check(String str)  
	{  
	    boolean res = isCapsOnly(str);  
	  
	    if (res == true)  
	        System.out.println( "yes" );  
	  
	    else
	        System.out.println( "No" );  
	} 
	
	
		
		
	
	
	public static void main(String args[]) 
	{  
	    String str1, str2;  
	  
	    str1 = "CKY";  
	
	    check(str1);  
	  
	   
	    str2 = "cky";  
	    check(str2);  
	}  

}
