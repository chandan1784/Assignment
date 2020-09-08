package com.task.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.task.dao.EmployeeDao;
import com.task.model.Employee;


@Controller
public class HomeController {
	
	@Autowired
	EmployeeDao dao;
	
	@RequestMapping(value="/")
	public String home(Model model)
	{
	return "home";
	}
	
	@RequestMapping(value="/disp")
	public String display(Model model,@ModelAttribute Employee employee)
	{
	String save=dao.saveEmployee(employee);
	model.addAttribute("save",save);
	return "display";
	}
	

	
	@RequestMapping(value = "/searchemployeebydesignation", method = RequestMethod.GET)
	public String search(Model model,@RequestParam ("designation") String designation) {
		

	List<Employee> searchbydesig=dao.getEmployeebyDesignation(designation);
	model.addAttribute("searchbydesig",searchbydesig);
	return "display";
	}


    @RequestMapping(value = "/searchemployeebyname", method = RequestMethod.GET)
	public String search1(Model model,@RequestParam ("name") String name) {
		
    Employee searchbyname=dao.getEmployeebyName(name);
	model.addAttribute("searchbyname",searchbyname);
	return "display";
	}


@RequestMapping(value="/updatePage")
public String update()
{
return "updatePage";
}

int employeeId=0;
@RequestMapping(value="/searchForUpdate")
public String searchForUpdate(Model model,@RequestParam("employeeid") String employeeId)
{
int empId=Integer.parseInt(employeeId);
this.employeeId=empId;
Employee employee=dao.getEmployeeById(empId);
model.addAttribute(employee);
return "updatePage";
}


@RequestMapping(value="/updateData")
public String updateData(@ModelAttribute Employee employee)
{
employee.setEmployeeid(employeeId);
dao.updateEmployeeById(employee);
return "updatePage";
}


@RequestMapping(value = "/deleteemployeebyname", method = RequestMethod.GET)
public String delete(Model model,@RequestParam ("name") String name) {
	
String delete=dao.deleteEmployeebyName(name);
model.addAttribute("delete",delete);
return "display";
}

	

	
}
