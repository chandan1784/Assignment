package com.task.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


import com.task.model.Employee;


@Transactional
public class EmployeeDao {
	
	@Autowired
	SessionFactory factory;
	
	public EmployeeDao() {
		// TODO Auto-generated constructor stub
		}
	

public EmployeeDao(SessionFactory factory) {
super();
this.factory = factory;
}

	//save or insert
	
	public String saveEmployee(Employee employee){
		try{
		Session session=factory.getCurrentSession();
		session.save(employee);
		return "Employee Created";
		}
		catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		}

		return "cannot create Employee";
		}
	
	//search
	
	public List<Employee> getEmployeebyDesignation(String designation){
		{
		try
		{
		Session session= factory.getCurrentSession();

		Query query=session.createQuery("from Employee e where e.employeedesignation=:desigParam");
		query.setParameter("desigParam", designation);

		List<Employee> listofemployees=(List<Employee>)query.list();

		return listofemployees;
		}
		catch (Exception e) {
		e.printStackTrace();
		}


		return null;



		}



		}
	
	
	public Employee getEmployeebyName(String name){
		{
		try
		{
		Session session= factory.getCurrentSession();

		Query query=session.createQuery("FROM Employee e WHERE e.employeename=:nameparam");
		query.setParameter("nameparam", name);
		Employee employee=(Employee) query.uniqueResult();

		return employee;
		}
		catch (Exception e) {
		e.printStackTrace();
		}


		return null;



		}



		}

	//update
	
	public Employee getEmployeeById(int employeeId){
		try{
		Session session=factory.getCurrentSession();
		Employee employee=(Employee)session.get(Employee.class,employeeId);
		return employee;
		}
		catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		}

		return null;
		}



		public String updateEmployeeById(Employee employee){
		try{
		Session session=factory.getCurrentSession();

		//System.out.println("author "+author);
		session.update("Employee",employee);
		return "Employee Updated";
		}
		catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		}

		return "Cannot Update Employee";
		}
		
		
		//to delete employee by name
		
		public String deleteEmployeebyName(String employeeName)
		{
			
			try {
			Session session = factory.getCurrentSession();
			
			Query query=session.createQuery("delete from Employee e WHERE e.employeename=:nameparam");
			query.setParameter("nameparam", employeeName);
			int res = query.executeUpdate();
			if(res>0)
			return	"Employee Deleted";
			}
			
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				}
			
			
			return "Cannot delete Employee";
			
		}
	

}
