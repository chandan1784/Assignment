
public class CountZeroTrail {
	
	
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
	        	 if(store!=0)
	        	 {
	        		
	        		
	        		 break;
	        	 }
	         }
	         
	         if(counter>0)
	         
	        System.out.println(counter + " Zero's");
	         else
	        	 System.out.println("no zero's found"); 
	}

}
