
public class TypesOfVars {
	
	int x; /*instance variable :- In object-oriented programming with classes, 
	an instance variable is a variable defined in a class (i.e. a member variable), 
	for which each instantiated object of the class has a separate copy,
	or instance. An instance variable is similar to a class variable.
	An instance variable is a variable which is declared in a class but outside of constructors, methods, or blocks. 
	Instance variables are created when an object is instantiated, and are accessible to all the constructors, methods, or blocks in the class. 
	Access modifiers can be given to the instance variable.*/


	void accept(){
	
		//int x=10; //local variable
		System.out.println("accept function");
		System.out.println(x);

		}
		void disp(){
		System.out.println("disp function");
		System.out.println(x); //error when x isn't local or global variable

		}

		public static void main(String[] args) {

		TypesOfVars t=new TypesOfVars(); //
		TypesOfVars t1=new TypesOfVars();
		
		
		t.x=10;
		//t1.x=10;

	    /*t.accept();
		t.disp();*/
		
		System.out.println("t x "+t.x);
		System.out.println("t1 x "+t1.x);
		}
}
