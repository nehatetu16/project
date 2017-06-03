<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
</head>
<h1 style="color: purple;"><center><i ><b>Apply Education Loan</b></i></center></h1>
<body>

<form:form method="POST" commandName="/BaseCodeSlice_BankManagementSystem/mvc/inserEducationLoanDetails" modelAttribute="inserEducationLoan">
<table>
     <%-- <tr>
        <td>Account Number </td>
        <td><form:input path="Account_number" /></td>
        <td><form:errors path="Account_number" cssClass="error" /></td>
    </tr>
     --%>
    <tr>
        <td>Loan Amount </td>
        <td><form:input path="Edu_Loan_Amount" /></td>
        <td><form:errors path="Edu_Loan_Amount" cssClass="error" /></td>
    </tr>
    
     <tr>
        <td>Loan Apply Date </td>
        <td><form:input path="Loan_Apply_Date" /></td>
        <td><form:errors path="Loan_Apply_Date" cssClass="error" /></td>
    </tr>
    
    <tr>
        <td>Loan Duration </td>
        <td><form:input path="Edu_Loan_Duration" /></td>
        <td><form:errors path="Edu_Loan_Duration" cssClass="error" /></td>
    </tr>
    <%-- <tr>
        <td>Loan Apply Date </td>
        <td><form:input path="Loan_Apply_Date" /></td>
        <td><form:errors path="Loan_Apply_Date" cssClass="error" /></td>
    </tr> --%>
    
    <tr>
        <td>Course name </td>
        <td><form:input path="Course_Name" /></td>
        <td><form:errors path="Course_Name" cssClass="error" /></td>
    </tr>
    
    <tr>
        <td>Course Fee</td>
        <td><form:input path="Course_Fee" /></td>
        <td><form:errors path="Course_Fee" cssClass="error" /></td>
    </tr>
    
    <tr>
        <td>Father Name </td>
        <td><form:input path="Father_Name" /></td>
        <td><form:errors path="Father_Name" cssClass="error" /></td>
    </tr>
    
    <tr>
        <td>ID Number </td>
        <td><form:input path="ID_Card_Number" /></td>
        <td><form:errors path="ID_Card_Number" cssClass="error" /></td>
    </tr>
     <tr>
        <td>Father's Annual Income </td>
        <td><form:input path="Father_Annual_Income" /></td>
        <td><form:errors path="Father_Annual_Income" cssClass="error" /></td>
    </tr>
    
    <tr>
        <td colspan="2"><center><input type="submit" class="button" value="Apply Education Loan"></center></td>
    </tr>
</table>
</form:form>

</body>
</html>