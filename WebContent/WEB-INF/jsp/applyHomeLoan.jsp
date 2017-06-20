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
  <script>
  
  
  </script>
  
  </head>
  <body ng-app="myApp">
 
  <table><tr>
 
  
  <td width="20%"><a href="http://localhost:8079/BaseCodeSlice_BankManagementSystem/mvc/viewHomePage?accountNumber=${accNo}" class="button1" />Home</a>
 </td>
  <td><h1 style="color: purple;"><center><b>Apply Home Loan</b></center></h1></td>
  <td></td>
 <td></td>
 <td></td>
 <td></td>
 <td></td>
 <td></td>
 </tr>
 </table>
  <form:form method="POST" commandName="/BaseCodeSlice_BankManagementSystem/mvc/applyHomeLoan?accountNumber=${msg}"
   modelAttribute="applyHomeLoan" name="userForm"  >
  <table>
    
      <tr>
      
        <div class="form-group" ng-class="{ 'has-error' : userForm.loanAmount.$invalid && !userForm.loanAmount.$pristine }"> 
          <td>Loan Amount :</td>
          <td><form:input path="loanAmount" maxlength="16" ng-model="loanAmount" required="true" ng-pattern="/^[0-9]+$/" /></td>
    <td>      <span ng-show="userForm.loanAmount.$invalid && !userForm.loanAmount.$pristine" class="help-block" style="color: red;">Loan Amount is required.</span></td>
          <td><form:errors path="loanAmount" cssClass="error" /></td>
     </div> 
      </tr>
       <%java.text.DateFormat df = new java.text.SimpleDateFormat("dd/MM/yyyy"); %>
        <tr>  <td>Loan Apply Date  :</td>
     <td><form:input path="loanApplyDate"  value="<%= df.format(new java.util.Date())%>" type="hidden" /><%= df.format(new java.util.Date())%></td>
      <td><form:errors path="loanApplyDate" cssClass="error" /></td>
     </tr>
 
      <tr>
          
          
          <td class="select">Duration of the loan :</td>
           <td> <form:select  path="loanDuration"> 
                <option value="5">5</option>
                <option value="10">10</option>
                <option value="15">15</option>
                <option value="20">20</option>
                </form:select>
       </td>  
        
      </tr>
      <tr>
      <div class="form-group" ng-class="{ 'has-error' : userForm.annualIncome.$invalid && !userForm.annualIncome.$pristine }">
          <td>Annual Income   :</td>
		 <td><form:input path="annualIncome" maxlength="20" ng-model="annualIncome" required="true" ng-pattern="/^[0-9]+$/" /> </td>
      <td>    <span ng-show="userForm.annualIncome.$invalid && !userForm.annualIncome.$pristine" class="help-block" style="color: red;">Annual Income should be valid</span></td>
        
         
          <td><form:errors path="annualIncome" cssClass="error" /></td>
           </div>
      </tr>
      <tr>
            <div class="form-group"  ng-class="{ 'has-error' : userForm.companyName.$invalid && !userForm.companyName.$pristine }" >
      
          <td>Company Name   :</td>
          <td><form:input path="companyName" maxlength="30" ng-model="companyName" required="true" ng-pattern="/^[A-Za-z0-9]+$/" /> </td>
        <td>  <span ng-show="userForm.companyName.$invalid && !userForm.companyName.$pristine" class="help-block" style="color: red;">Valid Company name is allowed.</span></td>
       
          
          <td><form:errors path="companyName" cssClass="error" /></td>
          </div>
      </tr>
      <tr>
     <div class="form-group" ng-class="{ 'has-error' : userForm.designation.$invalid && !userForm.designation.$pristine }">
      
          <td>Designation   :</td>
          <td><form:input path="designation" maxlength="30" ng-model="designation" required="true" ng-pattern="/^[A-Za-z]+$/" /> </td>
        <td>  <span ng-show="userForm.designation.$invalid && !userForm.designation.$pristine" class="help-block" style="color: red;">Valid designation is allowed.</span></td>
       
          <td><form:errors path="designation" cssClass="error" /></td>
          </div>
      </tr>
      <tr>
           <div class="form-group" ng-class="{ 'has-error' : userForm.totalExperience.$invalid && !userForm.totalExperience.$pristine }">
      
          <td>Total Exp   :</td>
          <td><form:input path="totalExperience" maxlength="2"  ng-model="totalExperience" required="true" ng-pattern="/^[0-9]+$/" /> </td>
        <td>  <span ng-show="userForm.designation.$invalid && !userForm.totalExperience.$pristine" class="help-block" style="color: red;">Only digits are allowed.</span></td>
        </td>
          <td><form:errors path="totalExperience" cssClass="error" /></td></div>
      </tr>
      <tr>
                 <div class="form-group" ng-class="{ 'has-error' : userForm.currentExperience.$invalid && !userForm.currentExperience.$pristine }">
      
          <td>Exp with Current company  :</td>
          <td><form:input path="currentExperience"  maxlength="2" ng-model="currentExperience" required="true" ng-pattern="/^[0-9]+$/" /> </td>
        <td>  <span ng-show="userForm.currentExperience.$invalid && !userForm.currentExperience.$pristine" class="help-block" style="color: red;">Only digits are allowed.</span></td>
        </td>
          <td><form:errors path="currentExperience" cssClass="error" /></td>
      </tr>
      <tr>
          <td colspan="16"><center><input type="submit" class="button" value="Apply Home Loan"
        ng-disabled="userForm.$invalid"  ></center></td>
      </tr>
  </table>
  </form:form>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<script>
	var app = angular.module('myApp', []);
	
	app.controller('AppCtrl', function($scope){
		$scope.loanAmount ={};
		// 	$scope.annualIncome = "";
		$scope.companyName = "companyName";
		/*$scope.designation = "";
		$scope.totalExperience = "";
		$scope.currentExperience = ""; */
	})
</script>
  </body>
  </html> 