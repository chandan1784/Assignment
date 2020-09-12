<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<style>
body {
  color: #fff;
  background: #3598dc;
}
.form-control {
  min-height: 41px;
  background: #f2f2f2;
  box-shadow: none !important;
  border: transparent;
}
.form-control:focus {
  background: #e2e2e2;
}
.form-control, .btn {        
  border-radius: 2px;
}
.login-form {
  width: 350px;
  margin: 30px auto;
  text-align: center;
}
.login-form h2 {
  margin: 10px 0 25px;
}
.login-form form {
  color: #7a7a7a;
  border-radius: 3px;
  margin-bottom: 15px;
  background: #fff;
  box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
  padding: 30px;
}
.login-form .btn {        
  font-size: 16px;
  font-weight: bold;
  background: #3598dc;
  border: none;
  outline: none !important;
}
.login-form .btn:hover, .login-form .btn:focus {
  background: #2389cd;
}
.login-form a {
  color: #fff;
  text-decoration: underline;
}
.login-form a:hover {
  text-decoration: none;
}
.login-form form a {
  color: #7a7a7a;
  text-decoration: none;
}
.login-form form a:hover {
  text-decoration: underline;
}
</style>

</head>
<body>


<div class="form-gap"></div>
<div class="container">
  <div class="row">
    <div class="col-md-4 col-md-offset-4">
       <div class="panel panel-default">
              <div class="panel-body">
                <div class="text-center">
                	 <div class="panel-body">
                	 		 <h2 class="text-center">Validation</h2> 



<form action="validation">


<div class="form-group">
<input type="text" name="userName" placeholder="Username">
</div>


<!-- Security Question dropdwon -->
<div class="form-group">
<select  name="question">
<option value="ques1" >Your first school ?</option>
<option value="ques2"> Your favourite place?</option>
<option value="ques3" >Your lowest marks</option>
<option value="ques4"> Your Highest marks</option>
</select>
</div>


<div class="form-group">
 <input type="text" name="securityAnswer" placeholder="Answer">
</div>
<div class="form-group">
<input type="submit" value="Validate" class="btn btn-primary btn-lg btn-block">
</div>



</form>


</div>
</div>
</div>
</div>
</div>
</div>
</div>


</body>
</html>