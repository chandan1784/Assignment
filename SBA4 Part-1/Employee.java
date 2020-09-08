package com.task.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee { 
@Id
private int employeeid;    
private String employeename;    
private float employeesalary;    
private String employeedesignation;
public int getEmployeeid() {
	return employeeid;
}

public Employee()
{
	
}
public void setEmployeeid(int employeeid) {
	this.employeeid = employeeid;
}
public String getEmployeename() {
	return employeename;
}
public void setEmployeename(String employeename) {
	this.employeename = employeename;
}
public float getEmployeesalary() {
	return employeesalary;
}
public void setEmployeesalary(float employeesalary) {
	this.employeesalary = employeesalary;
}
public String getEmployeedesignation() {
	return employeedesignation;
}
public void setEmployeedesignation(String employeedesignation) {
	this.employeedesignation = employeedesignation;
}
public Employee(int employeeid, String employeename, float employeesalary, String employeedesignation) {
	super();
	this.employeeid = employeeid;
	this.employeename = employeename;
	this.employeesalary = employeesalary;
	this.employeedesignation = employeedesignation;
}


@Override
public String toString() {
	return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", employeesalary="
			+ employeesalary + ", employeedesignation=" + employeedesignation + "]";
}    
    

    
}    