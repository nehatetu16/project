<%-- 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!--<style>
   tr:nth-child(even){background-color: #800080}</style> -->  

 <style>
  .abc {
    background-color: #800080;
    color: blue;
}
</style>
<!-- <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.3.1/css/foundation.css">
 --></head>
<body>
<br><br>
<table style="width:100%; " >
<tr class="abc"><h1><center>	Welcome To Bank Management System</center></h1></tr></table>
	
	<br><br><br>


<table width=100% class="#800080">
<tr >&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
 <a href="mvc/applyHomeLoan">Apply Home Loan</a></tr>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<tr><a href="mvc/viewHomeLoan">View Home Loan</a> </tr>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<tr><a href="mvc/applyEducationLoan">Apply Education Loan</a>  </tr>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<tr><a href="mvc/viewEducationLoan">View Education Loan</a>  </tr>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<tr><a href="mvc/performtransaction">Perform Transaction</a> </tr>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<tr><a href="mvc/viewtransaction">View Transaction</a>  </tr>
<tr></tr>
<tr><td></td></tr>
<tr><a href="mvc/loginUser">Login</a> </tr>
</table>	

</body>
  --%>
  
 <%--  <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.3.1/css/foundation.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome!</title>
</head>
<body>
	<h1>Welcome to Bank Management System</h1>
	<!-- Please add your application links by replacing the below sample links -->
	<center><h3>LOGIN</h3></center>
	<!-- Please add your application links by replacing the below sample links -->
	<form method="GET" action = "mvc/home" >
	<br>
	<div class="input">
	<input Placeholder="Account Number" type="Text" maxlength="16" name="AccNo"></input>
	<center><button type="submit">Login</button></center>
	</div>
	</div>
	</form>
	</center>
</body>
</html> --%>
  
  
  
  
  
  
  
  
  
  
  
  
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Login Here</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.3.1/css/foundation.css">
<style>
	.cssClass {
		background-color: red;
	}
</style>
</style>
  <style> .button {
    display: inline-block;
    border-radius: 4px;
    background-color: #f4511e;
    border: none;
    color: #FFFFFF;
    text-align: center;
    font-size: 28px;
    padding: 20px;
    width: 100px;
    transition: all 0.5s;
    cursor: pointer;
    margin: 5px;
  }
  </style>
    <style> .button {
    display: inline-block;
    border-radius: 2px;
    background-color: #f4511e;
    border: none;
    color: #FFFFFF;
    text-align: center;
    font-size: 28px;
    padding: 10px;
    width: 150px;
    transition: all 0.5s;
    cursor: pointer;
    margin: 5px;
  }
  </style>
  <style>
  tr:nth-child(even){background-color: #f2f2f2}</style>
  <style>
  input[type=text] {
    width: 60%;
    
    padding: 12px 20px;
    margin: 8px 280px;
    box-sizing: border-box;
}
  </style>
</head>

<h1 style="color: purple;"><center><b>Welcome To Bank Management System</b></center></h1>

<br><br><br><br>
<h1 style="color: purple;"><center><b>Login Here</b></center></h1>


<body>


<form method="GET" action = "mvc/viewHomePage"  >
<div class="input">
	<input Placeholder="Account Number" type="text" maxlength="16" name="accountNumber"></input>
	<br>
	<center><button type="submit" class="button">Login</button></center>
	</div>
	</form>

</body>
</html>
















