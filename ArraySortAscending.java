
public class ArraySortAscending {
	
	public static void main(String args[]) {
       
        int tempValue=0;
        

     
        int[] numArray = new int[5];

    
        for (int i = 0; i < 5; i++) {
            
            numArray[i] = Integer.parseInt(args[i]);
        }
        
 
 
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) { 

         
            if (numArray[i] > numArray[j]) {
                    tempValue = numArray[i];
                    numArray[i] = numArray[j];
                    numArray[j] = tempValue;
                
            }
            }
        }

   
       
        for (int i = 0; i < 5 ; i++) {
            System.out.print(numArray[i]);
            System.out.println();
        }
     
    }
}


