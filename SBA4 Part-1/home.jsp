<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	
    

    
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet" type="text/css">

   
</head>
<center>
<h1> Employee Management System</h1>
</center>

<body>
	<div class="page-wrapper bg-gra-01 p-t-00 p-b-100 font-poppins">
        <div class="wrapper wrapper--w780">
            <div class="card card-3">
                
                <div class="card-body">
<h1  class="title">Register/Save</h1>

<form action="disp">

<div class="input-group">
<input class="input--style-3" type="text" name="employeeid" placeholder="Employee Id">
</div>

<div class="input-group">
<input class="input--style-3" type="text" name="employeename" placeholder="Employee Name">
</div>

<div class="input-group">
 <input class="input--style-3" type="text" name="employeesalary" placeholder="Employee Salary">
</div>

<div class="input-group">
<input class="input--style-3" type="text" name="employeedesignation" placeholder="Employee Designation">
</div>
<div class="p-t-10">
<input class="btn btn--pill btn--green" type="submit" name="save employee" value="Register your info" >
</div>

</form>

<form action="searchemployeebydesignation">

<div class="input-group">
<input class="input--style-3" type="text" name="designation" placeholder="Search Employee by Designation">
</div>
<input class="btn btn--pill btn--green" type="submit" name="search employee by designation" value="search">
</form>

<form action="searchemployeebyname">
<div class="input-group">
<input class="input--style-3" type="text" name="name" placeholder="Search Employee by Name">
</div>

<input class="btn btn--pill btn--green" type="submit" name="search employee by name" value="Search">

</form>
<br>



               </div>
         <form action="updatePage">
<input class="btn btn--pill btn--green" type="submit" value="Update Data">
</form>

<form action="deleteemployeebyname">
	<div class="input-group">
<input class="input--style-3" type="text" name="name" placeholder="Delete Data by Name">
</div>
<input class="btn btn--pill btn--green" type="submit" value="Delete Data">
</form>

            </div>

        </div>

    </div>

       



</body>
</html>

<style type="text/css">

body {
    background-color: lightpink;
}

/*
.key{
	width:25%;
}	
.section{
	display: flex;
}
.container{
	margin-left:450px;
}*/

/* ==========================================================================
   #PAGE WRAPPER
   ========================================================================== */
.page-wrapper {
  min-height: 100vh;
}

body {
  font-family: "Poppins", "Arial", "Helvetica Neue", sans-serif;
  font-weight: 400;
  font-size: 14px;
}

h1, h2, h3, h4, h5, h6 {
  font-weight: 400;
}

h1 {
  font-size: 36px;
}

h2 {
  font-size: 30px;
}

h3 {
  font-size: 24px;
}

h4 {
  font-size: 18px;
}

h5 {
  font-size: 15px;
}

h6 {
  font-size: 13px;
}


/* ==========================================================================
   #WRAPPER
   ========================================================================== */
.wrapper {
  margin: 0 auto;
}

.wrapper--w960 {
  max-width: 960px;
}

.wrapper--w780 {
  max-width: 780px;
}

.wrapper--w680 {
  max-width: 680px;
}

/* ==========================================================================
   #CARD
   ========================================================================== */
.card {
  overflow: hidden;
  -webkit-border-radius: 3px;
  -moz-border-radius: 3px;
  border-radius: 3px;
  background: #fff;
}

.card-3 {
  background: #000;
  -webkit-border-radius: 10px;
  -moz-border-radius: 10px;
  border-radius: 10px;
  -webkit-box-shadow: 0px 8px 20px 0px rgba(0, 0, 0, 0.15);
  -moz-box-shadow: 0px 8px 20px 0px rgba(0, 0, 0, 0.15);
  box-shadow: 0px 8px 20px 0px rgba(0, 0, 0, 0.15);
  width: 100%;
  display: table;
}

.card-3 .card-heading {
  
  display: table-cell;
  width: 50%;
}

.card-3 .card-body {
  padding: 57px 65px;
  padding-bottom: 65px;
  display: table-cell;
}

@media (max-width: 767px) {
  .card-3 {
    display: block;
  }
  .card-3 .card-heading {
    display: block;
    width: 100%;
    padding-top: 400px;
    background-position: center center;
  }
  .card-3 .card-body {
    display: block;
    width: 100%;
    padding: 37px 30px;
    padding-bottom: 45px;
  }
}

.input-group {
  position: relative;
  margin-bottom: 33px;
  border-bottom: 1px solid rgba(255, 255, 255, 0.2);
}

.input--style-3 {
  padding: 5px 0;
  font-size: 16px;
  color: #ccc;
  background: transparent;
}

.input--style-3::-webkit-input-placeholder {
  /* WebKit, Blink, Edge */
  color: #ccc;
}

.input--style-3:-moz-placeholder {
  /* Mozilla Firefox 4 to 18 */
  color: #ccc;
  opacity: 1;
}

.input--style-3::-moz-placeholder {
  /* Mozilla Firefox 19+ */
  color: #ccc;
  opacity: 1;
}

.input--style-3:-ms-input-placeholder {
  /* Internet Explorer 10-11 */
  color: #ccc;
}

.input--style-3:-ms-input-placeholder {
  /* Microsoft Edge */
  color: #ccc;
}

/* ==========================================================================
   #SPACING
   ========================================================================== */
.p-t-100 {
  padding-top: 100px;
}

.p-t-180 {
  padding-top: 180px;
}

.p-t-20 {
  padding-top: 20px;
}

.p-t-10 {
  padding-top: 10px;
}

.p-t-30 {
  padding-top: 30px;
}

.p-b-100 {
  padding-bottom: 100px;
}

/* ==========================================================================
   #BUTTON
   ========================================================================== */
.btn {
  display: inline-block;
  line-height: 40px;
  padding: 0 33px;
  font-family: Poppins, Arial, "Helvetica Neue", sans-serif;
  cursor: pointer;
  color: #fff;
  -webkit-transition: all 0.4s ease;
  -o-transition: all 0.4s ease;
  -moz-transition: all 0.4s ease;
  transition: all 0.4s ease;
  font-size: 18px;
}

.btn--radius {
  -webkit-border-radius: 3px;
  -moz-border-radius: 3px;
  border-radius: 3px;
}

.btn--pill {
  -webkit-border-radius: 20px;
  -moz-border-radius: 20px;
  border-radius: 20px;
}

.btn--green {
  background: #57b846;
}

.btn--green:hover {
  background: #4dae3c;
}


/* ==========================================================================
   #TITLE
   ========================================================================== */
.title {
  font-size: 24px;
  color: #fff;
  font-weight: 400;
  margin-bottom: 36px;
}





</style>