<%-- <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Insert Education Loan</title>
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
    width: 300px;
    transition: all 0.5s;
    cursor: pointer;
    margin: 5px;
  }
  </style>
  <style>
  tr:nth-child(even){background-color: #f2f2f2}</style>
</head>


<h1 style="color: purple;"><center><b>Login Here</b></center></h1>
<body>

<form:form method="GET" commandName="command" modelAttribute="login">
<table>
     <tr>
        <td>Account Number </td>
        <td><form:input path="accountNumber" /></td>
        
    </tr>
 
    
    <tr>
        <td colspan="2"><center><input type="submit" class="button" value="login"></center></td>
    </tr>
</table>
</form:form>

</body>
</html> --%>

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


