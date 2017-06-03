<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
  <html>
  <head>
  <title>Registration Page</title>
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
    margin: 5px;
  }
  </style>
  </head>
  <body>
  <h1 style="color: purple;"><center><i ><b>Apply Home Loan</b></i></center></h1>
  
  <form:form method="POST" commandName="/BaseCodeSlice_BankManagementSystem/mvc/applyHomeLoan" modelAttribute="applyHomeLoan">
  <table>
    <%--   <tr>
          <td>A/c Number  :</td>
          <td><form:input path="accountNumber" /></td>
          <td><form:errors path="name" cssClass="error" /></td>
      </tr> --%>
      <tr>
          <td>Loan Amount :</td>
          <td><form:input path="loanAmount" /></td>
          <td><form:errors path="loanAmount" cssClass="error" /></td>
      </tr>
      <tr>
          <td>Loan Apply Date  :</td>
          <td><form:input path="loanApplyDate" /></td>
          <td><form:errors path="loanApplyDate" cssClass="error" /></td>
      </tr>
      <tr>
          <td>Duration of the loan  :</td>
          <td><form:input path="loanDuration" /></td>
          <td><form:errors path="loanDuration" cssClass="error" /></td>
      </tr>
      <tr>
          <td>Annual Income   :</td>
          <td><form:input path="annualIncome" /></td>
          <td><form:errors path="annualIncome" cssClass="error" /></td>
      </tr>
      <tr>
          <td>Company Name   :</td>
          <td><form:input path="companyName" /></td>
          <td><form:errors path="companyName" cssClass="error" /></td>
      </tr>
      <tr>
          <td>Designation   :</td>
          <td><form:input path="designation" /></td>
          <td><form:errors path="designation" cssClass="error" /></td>
      </tr>
      <tr>
          <td>Total Exp   :</td>
          <td><form:input path="totalExperience" /></td>
          <td><form:errors path="totalExperience" cssClass="error" /></td>
      </tr>
      <tr>
          <td>Exp with Current company  :</td>
          <td><form:input path="currentExperience" /></td>
          <td><form:errors path="currentExperience" cssClass="error" /></td>
      </tr>
      <tr>
          <td colspan="16"><center><input type="submit" class="button" value="Apply Home Loan"></center></td>
      </tr>
  </table>
  </form:form>
  
  </body>
  </html> 