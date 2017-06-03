<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First Page</title>
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.3.1/css/foundation.css">
<style>
	.cssClass {
		background-color: red;
	}
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
    margin: 20px;
  }
  </style>


</head>
<body>
<form:form method="POST" commandName="/BaseCodeSlice_BankManagementSystem/mvc/performtransaction" modelAttribute="transaction">

<table>


    
    
    <tr>
        <td>Transaction Amount:</td>
        <td><form:input path="transactionAmount" /></td>
        <td><form:errors path="transactionAmount" cssClass="error" /></td>
    </tr>
    
    <tr>
        <td>transactionType:</td>
        <td><form:input path="transactionType" /></td>
        <td><form:errors path="transactionType" cssClass="error" /></td>
    </tr>
    
    
    
    
      <tr>
        <td>Transaction Description:</td>
        <td><form:input path="transactionDescription" /></td>
        <td><form:errors path="transactionDescription" cssClass="error" /></td>
    </tr>
    
    <tr>
        <td colspan="2" ><center><input type="submit" class="button" value="Perform transaction"></center></td>
    </tr>
    
    
</table>


</form:form>
</body>

</html>