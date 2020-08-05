
public class Employee {

	
	private String empName;
	private int age;
	private char gender;
	private float salary;
	
	
	void init (String x,int y, char z, float s)
	{
		
		empName =x;
		age=y;
		gender =z;
		salary =s;
		
	}
	
	void disp()
	{
		
		System.out.println(empName);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(salary);
		
		
	}

	public static void main(String[] args) {
		
		
		
		Employee emp01 = new Employee();
        Employee emp02 = new Employee();
        
        emp01.init("amit",24,'M',25000.56f);
        emp02.init("sumit",23,'M',70000.78f);
        
        emp01.disp();
        emp02.disp();
        
        
        
        
        
	
	}
}
