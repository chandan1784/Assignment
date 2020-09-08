<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Update</title>
</head>
<body>
<center>
<h1>
Hello Employee!! Update Your Details by Providing Employee Id  
</h1>
 </center>
<div class="container">



<form action="searchForUpdate">
<div class="section">
<div class="key">	
Employee Id:<input type="text" name=employeeid value="${employee.employeeid}">
</div>
</div>
<input type="submit" value="search">

</form>


<form action="updateData">
<div class="section">
<div class="key">
Employee Name:
</div>
<input type="text" name="employeename" value="${employee.employeename}">
</div>

<div class="section">
<div class="key">
Employee Salary: 
</div>
<input type="text" name="employeesalary" value="${employee.employeesalary}">
</div>


<div class="section">
<div class="key">
Employee Designation:
</div>
 <input type="text" name="employeedesignation" value="${employee.employeedesignation}">
 </div>

<br>

<div class="section">
<div class="key">
</div>
<input type="submit" value="update Employee">

</div>
</form>

</div>
</body>
</html>

<style type="text/css">

body {
    background-color: lightblue;
}
.key{
	width:25%;
}	
.section{
	display: flex;
}
.container{
	margin-left:450px;
}
</style>
