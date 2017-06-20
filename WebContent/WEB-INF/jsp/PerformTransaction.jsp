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

</head>
<body ng-app="myApp">

<table><tr>
 
  
  <td width="20%"><a href="http://localhost:8079/BaseCodeSlice_BankManagementSystem/mvc/viewHomePage?accountNumber=${msg}" class="button1" />Home</a>
 </td>
  <td><h1 style="color: purple;"><center><b>Perform Transaction</b></center></h1></td>
  <td></td>
 <td></td>
 <td></td>
 <td></td>
 <td></td>
 <td></td>
 </tr>
 </table>

<form:form method="POST" commandName="/BaseCodeSlice_BankManagementSystem/mvc/performtransaction?accountNumber=${msg}" 
modelAttribute="transaction" name="transactionForm" >

<table>

    <tr>
    <div class="form-group" ng-class="{ 'has-error' : transactionForm.transactionAmount.$invalid && !transactionForm.transactionAmount.$pristine }"> 
        <td>Transaction Amount:</td>
        <td><form:input path="transactionAmount" maxlength="20" ng-model="transactionAmount" required="true" ng-pattern="/^[0-9]+$/"/></td>
            <td><span ng-show="transactionForm.transactionAmount.$invalid && !transactionForm.transactionAmount.$pristine" class="help-block" style="color: red;">Transaction Amount is required.</span></td>
        
        <td><form:errors path="transactionAmount" cssClass="error" /></td></div>
    </tr>
    
    <tr>
        <div class="form-group" ng-class="{ 'has-error' : transactionForm.transactionType.$invalid && !transactionForm.transactionType.$pristine }"> 
    
        <td>transactionType:</td>
        <td><form:input path="transactionType" maxlength="11" ng-model="transactionType" required="true" ng-pattern="/^[A-Za-z]+$/" /> </td>
<td><span ng-show="transactionForm.transactionType.$invalid && !transactionForm.transactionType.$pristine" class="help-block" style="color: red;">Transaction type should be valid.</span></td>
       
        <td><form:errors path="transactionType" cssClass="error" /></td></div>
    </tr>
    
    
    
    
      <tr>
              <div class="form-group" ng-class="{ 'has-error' : transactionForm.transactionDescription.$invalid && !transactionForm.transactionDescription.$pristine }"> 
      
        <td>Transaction Description: </td>
        <td><form:input path="transactionDescription" maxlength="50" ng-model="transactionDescription" required="true" ng-pattern="/^[A-Za-z]+$/"/></td>
    <td><span ng-show="transactionForm.transactionDescription.$invalid && !transactionForm.transactionDescription.$pristine" class="help-block" style="color: red;">Transaction description should be valid.</span></td>
        
        <td><form:errors path="transactionDescription" cssClass="error" /></td></div>
    </tr>
    
    <tr>
        <td colspan="2" ><center><input type="submit" class="button" value="Perform transaction"
          ng-disabled="transactionForm.$invalid" ></center></td>
    </tr>
    
    
</table>


</form:form>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>

<script>
	var app = angular.module('myApp', []);
	
	app.controller('AppCtrl', function($scope){
		//$scope.loanAmount ={};
		// 	$scope.annualIncome = "";
		//$scope.companyName = "companyName";
		/*$scope.designation = "";
		$scope.totalExperience = "";
		$scope.currentExperience = ""; */
	})
</script>
</body>

</html>