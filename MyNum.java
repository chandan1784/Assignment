
public class MyNum {
	
	
	public static void main(String[] args){
		int x=1234;
      //  int init =1;
		
		for(int i=1;i<=4;i++) {
			//init=init*(10);
			//int store =( x%init);
			//x=x/10;
			
			int store=x%10;
			x=x/10;
			
			System.out.println(store);
		}
		
		

}
}
