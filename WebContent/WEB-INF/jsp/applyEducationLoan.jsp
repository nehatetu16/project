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
  
  <style> .button1 {
    display: inline-block;
    border-radius: 1px;
    background-color: #f4511e;
    border: none;
    color: #FFFFFF;
    text-align: center;
    font-size: 20px;
    padding: 6px;
    width: 90px;
    transition: all 0.5s;
    cursor: pointer;
    margin: 5px;
  }
  </style>
  <style>
  tr:nth-child(even){background-color: #f2f2f2}</style>
</head>


<body ng-app="myApp">
<table><tr>
 
  
  <td width="20%"><a href="http://localhost:8079/BaseCodeSlice_BankManagementSystem/mvc/viewHomePage?accountNumber=${msg}" class="button1" />Home</a>
 </td>
  <td><h1 style="color: purple;"><center><b>Apply Education Loan</b></center></h1></td>
  <td></td>
 <td></td>
 <td></td>
 <td></td>
 <td></td>
 <td></td>
 </tr>
 </table>
<form:form method="POST" commandName="/BaseCodeSlice_BankManagementSystem/mvc/applyEducationLoan?accountNumber=${msg}" modelAttribute="inserEducationLoan" name="educationForm">
<table>
     <%-- <tr>
        <td>Account Number </td>
        <td><form:input path="Account_number" /></td>
        <td><form:errors path="Account_number" cssClass="error" /></td>
    </tr>
     --%>
    <tr>
 <div class="form-group" ng-class="{ 'has-error' : educationForm.eduLoanAmount.$invalid && !educationForm.eduLoanAmount.$pristine }">  
        <td>Loan Amount </td>
       <%--  <td><form:input path="eduLoanAmount" /></td> --%>
        <td><form:input path="eduLoanAmount" ng-pattern="/^[0-9]+$/" ng-model="eduLoanAmount" required="true" /> 
        <span ng-show="educationForm.eduLoanAmount.$invalid && !educationForm.eduLoanAmount.$pristine" class="help-block">
        Education  Loan Amount is required.</span></td> 
        <td><form:errors path="eduLoanAmount" cssClass="error" /></td>
        </div>
    </tr>
    
   <%--   <tr>
        <td>Loan Apply Date </td>
        <td><form:input path="Loan_Apply_Date" /></td>
        <td><form:errors path="Loan_Apply_Date" cssClass="error" /></td>
    </tr> --%>
    <%java.text.DateFormat df = new java.text.SimpleDateFormat("dd/MM/yyyy"); %>
        <tr>  <td>Loan Apply Date  :</td>
     <td><form:input path="loanApplyDate"  value="<%= df.format(new java.util.Date())%>" type="hidden" /><%= df.format(new java.util.Date())%></td>
      <td><form:errors path="loanApplyDate" cssClass="error" /></td>
     </tr>
    <tr>
        <td>Loan Duration </td>
        <td><form:select path="eduLoanDuration">
        <option value=" ">Enter Loan Duration</option>
         <option value="5">5</option>
                <option value="10">10</option>
            
                </form:select>
        
        </td>
        
 
    
    <tr>
    <div class="form-group" ng-class="{ 'has-error' : educationForm.courseName.$invalid && !educationForm.courseName.$pristine }">  
        <td>Course name </td>
         <td><form:input path="courseName"  ng-pattern ="/^[a-zA-Z\s]+$/" ng-model="courseName" required="true" /> 
         <span ng-show="educationForm.courseName.$invalid && !educationForm.courseName.$pristine" class="help-block">
         Course name is required.</span></td> 
       <%--  <td><form:input path="courseName" /></td> --%>
        <td><form:errors path="courseName" cssClass="error" /></td>
        </div>
    </tr>
    
    <tr>
      <div class="form-group" ng-class="{ 'has-error' : educationForm.courseFee.$invalid && !educationForm.courseFee.$pristine }"> 
        <td>Course Fee</td>
             <td><form:input path="courseFee"  ng-pattern ="/^[0-9]+$/" ng-model="courseFee" required="true" /> 
         <span ng-show="educationForm.courseFee.$invalid && !educationForm.courseFee.$pristine" class="help-block">
         Course Fee is required.</span></td> 
      <%--   <td><form:input path="courseFee" /></td> --%>
        <td><form:errors path="courseFee" cssClass="error" /></td>
        </div>
    </tr>
    
    <tr>
     <div class="form-group" ng-class="{ 'has-error' : educationForm.fatherName.$invalid && !educationForm.fatherName.$pristine }"> 
        <td>Father Name </td>
         <td><form:input path="fatherName"  ng-pattern ="/^[a-zA-Z\s]+$/" ng-model="fatherName" required="true" /> 
         <span ng-show="educationForm.fatherName.$invalid && !educationForm.fatherName.$pristine" class="help-block">
         Enter valid father name.</span></td> 
        <%-- <td><form:input path="fatherName" /></td> --%>
        <td><form:errors path="fatherName" cssClass="error" /></td>
        </div>
    </tr>
    
    <tr>
        <td>ID Number </td>
         <div class="form-group" ng-class="{ 'has-error' : educationForm.iDCardNumber.$invalid && !educationForm.iDCardNumber.$pristine }"> 
        <td><form:input path="iDCardNumber"  ng-pattern ="/[0-9]+$/" ng-model="iDCardNumber" required="true" /> 
         <span ng-show="educationForm.iDCardNumber.$invalid && !educationForm.iDCardNumber.$pristine" class="help-block">
         Enter valid ID Number.</span></td> 
       <%--  <td><form:input path="iDCardNumber" /></td> --%>
        <td><form:errors path="iDCardNumber" cssClass="error" /></td>
        </div>
    </tr>
     <tr>
      <div class="form-group" ng-class="{ 'has-error' : educationForm.fatherAnnualIncome.$invalid && !educationForm.fatherAnnualIncome.$pristine }"> 
        <td>Father's Annual Income </td>
         <td><form:input path="fatherAnnualIncome"  ng-pattern ="/^[0-9]+$/" ng-model="fatherAnnualIncome" required="true" /> 
         <span ng-show="educationForm.fatherAnnualIncome.$invalid && !educationForm.fatherAnnualIncome.$pristine" class="help-block">
         Enter valid Father's Annual Income.</span></td> 
       <%--  <td><form:input path="fatherAnnualIncome" /></td> --%>
        <td><form:errors path="fatherAnnualIncome" cssClass="error" /></td>
        </div>
    </tr>
    
    <tr>
        <td colspan="2"><center><input type="submit" class="button" value="Apply Education Loan" ng-disabled="educationForm.$invalid"></center></td>
    </tr>
</table>
</form:form>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<script>
	var app = angular.module('myApp', []);
	
	app.controller('AppCtrl', function($scope){
		/* $scope.Edu_Loan_Amount = "";
		$scope.Course_Name = "";
		$scope.Course_Fee= "";
		$scope.Father_Name= "";
		$scope.ID_Card_Number= "";
		$scope.Father_Annual_Income= ""; */
	})
</script>
</body>
</html>