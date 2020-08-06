
public class Customer {
	
	//Instance Variable
	private int cust_id; 
	private String cust_name;
	private char cust_gender;
	private float cust_salary;
	private String cust_address;
	private int cust_contact;
	
	
	
	
	
	
	private Customer(int cust_id, String cust_name, char cust_gender, float cust_salary, String cust_address,
			int cust_contact) {
		
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_gender = cust_gender;
		this.cust_salary = cust_salary;
		this.cust_address = cust_address;
		this.cust_contact = cust_contact;
	}
	
	private void disp()
	{
		
		System.out.println(cust_id);
		System.out.println(cust_name);
		System.out.println(cust_gender);
		System.out.println(cust_salary);
		System.out.println(cust_address);
		System.out.println(cust_contact);
		
	}






	public static void main(String[] args){
		
		
		Customer cust1 = new Customer(101,"Karan",'M',80000.56f,"Patna, Bihar",9738483);
	    Customer cust2 = new Customer(102,"Deeksha",'F',50000.56f,"Sitamarhi, Bihar",945667);
		
		
		cust1.disp();
		cust2.disp();

		
	
		
		
	}

}
