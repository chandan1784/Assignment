<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>
</head>
<body>
<h1>

</h1>

 <P>  ${save} </P>
 
  <P>  ${delete} </P>
 
 
<div>
<table border="border" width="80%">
<tr> <td>Employee Id </td> <td> Employee Designation </td> <td> Employee Name </td> <td> Employee Salary </td>  </tr>

<tr>

<td> ${searchbyname.employeeid}</td>
<td> ${searchbyname.employeedesignation} </td>
<td> ${searchbyname.employeename} </td>
<td> ${searchbyname.employeesalary} </td>

</tr>

</table>

</div>




<c:forEach items="${searchbydesig}" var="searchbydesig">

<table border="border" width="80%">
<tr> <td>Employee Id </td> <td> Employee Designation </td> <td> Employee Name </td> <td> Employee Salary </td>  </tr>

<tr>

<td> ${searchbydesig.employeeid}</td>
<td> ${searchbydesig.employeedesignation} </td>
<td> ${searchbydesig.employeename} </td>
<td> ${searchbydesig.employeesalary} </td>

</tr>

</table>

</c:forEach>

</body>
</html>

