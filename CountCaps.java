
public class CountCaps {
	
	//static int counter=0;
	
	public static int countCaps(String str){
		int counter=0;
		for(int i=0; i<str.length(); i++){
			
			char[] arr=str.toCharArray();
			if((arr[i] >= 65 && arr[i] <=90 )/*&& !(arr[i]>=97 && arr[i]<=122)*/ )
			counter++;
			//System.out.println(counter);
			
			}
		
		return counter;
}
	
	
	
	static void check(String str)  
	{  
	    int res = countCaps(str);  
	  
	  System.out.println(res);
	} 
	
	
		
	public static void main(String args[]) 
	{  
	    String str1, str2;  
	  
	   str1 = "CkY";  
	
	   check(str1);  
	  
	   
	    str2 = "CKy";  
	    check(str2);  
	}  

}
