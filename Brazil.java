package numberformat;

class Brazil extends Country {

	
	@Override
	public boolean phoneNumberFormat(String number) {
		
		int counter=0;
		
		
		String input = number; 
		char[] arr = input.toCharArray(); 
		
		if(input.length()==17 && arr[0]=='+' && arr[12]=='-' && arr[3]==' ' && arr[6]==' ' && arr[1]=='5' && arr[2]=='5')
		{
			
			for(int i=0;i<input.length();i++)
			{
				if(arr[i]>='0' && arr[i]<='9')
					counter++;
			//	else
					//continue;
				
					
			}
			//System.out.println(counter);
			
			if(counter==13)
				return true;
		
			
			
		
	   }
		else
		{
//System.out.println("else");
			return false;
		
		}
		
	return false;
		
	}

}
