
public class CountZero {

	
	
	public static void main(String[] args){
		
		 int input= Integer.parseInt(args[0]); 
		
		 int counter=0;
	         while(true)
	         {
	        	 int store=input%10;
	        	// System.out.println(store);
	        	
	        	 if(store==0)
	        		 counter++;
	        	 
	        	 input=input/10;
	        	 if(input==0)
	        	 {
	        		
	        		
	        		 break;
	        	 }
	         }
	         
	        
	        System.out.println(counter + " Zero's");
	        
	}
}
