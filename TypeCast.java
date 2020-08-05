public class TypeCast {

	
	
	public static void main(String vars[]){
		int x=10;
		int age=x;

		byte a=127; // 8 bits
		int b=a; // 32 bits
		//implicit casting (compiler cast)


		int c=500;
		byte d=(byte)c;
		//explicit cast (programmer cast)

		System.out.println("hello world " + age);
		System.out.println("value of b =  " + b);
		System.out.println("value of d =  " + d);
		
		
		char w='A'; // 2 byte
		int h=w; // 4 byte
		//implicit cast


		int y=65;
		//char z=y;  error

		char z=(char)y;

		System.out.println("value of h is "+h);
		System.out.println("value of z is "+z);
		
		
		
		

		}
}
