package numberformat;

class India extends Country {

	@Override
	public boolean phoneNumberFormat(String number) {
		
		int counter=0;
		
		
		String input = number; 
		char[] arr = input.toCharArray(); 
		
		if(input.length()==14 && arr[0]=='+' && arr[3]=='-' && arr[1]=='9' && arr[2]=='1')
		{
			
			for(int i=0;i<input.length();i++)
			{
				if(arr[i]>='0' && arr[i]<='9')
					counter++;
				//System.out.println(counter);
					
			}
			
			if(counter==10)
				return true;
			
			
		
	   }
		else
			return false;
		
	
		
	return false;
		
	}


}