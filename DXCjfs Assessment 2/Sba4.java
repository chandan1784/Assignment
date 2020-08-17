/* 4 create a custom exception of type UNCHECKED to validate marks entered by user. 
valid marks are 0-100 anything beyond should throw the exception created by you*/

	
	class MarksInvalidException extends Exception{

		public MarksInvalidException() {
		super("Invalid Marks");
		}
		}

		class CheckMarks
		{
		void check(int marks)throws MarksInvalidException
		{
		if(marks >100 || marks<0)
		throw new MarksInvalidException();

		else
		System.out.println("Valid Marks: " +marks);
		}

		}


		public class Sba4 {

		public static void main(String[] args) {
		CheckMarks b=new CheckMarks();

		try{
		b.check(101);
		}
		catch (Exception e) {

		System.out.println(e);
		}

	
		}

		}


