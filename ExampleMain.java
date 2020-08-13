package numberformat;

public class ExampleMain {

	public static void main(String[] args) {
	
		
		India i = new India();
		System.out.println(i.phoneNumberFormat("+90-9988776595"));
		Brazil b = new Brazil();
		System.out.println(b.phoneNumberFormat("+55 15 99999-9999"));
		

	}
}
