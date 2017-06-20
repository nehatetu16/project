<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.3.1/css/foundation.css">
<title>Insert title here</title>

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

{{edu}}

 <body ng-app="myApp1">
 
 <table><tr>
 
  
  <td width="20%"><a href="http://localhost:8079/BaseCodeSlice_BankManagementSystem/mvc/viewHomePage?accountNumber=${msg}" class="button1" />Home</a>
 </td>

 </tr>
 </table>
 
     <div ng-controller="EduCtrl">
        
       <input type="text" ng-model="search.course_Name" placeholder="Search"/>
        <hr/>
 
 <table>
 <tr>
 <td>Sr. No.</td>
 <td>Education Loan ID</td>
 <td>Education Loan Amount</td>
 <td>Course name</td>
  <td>Father name</td>
 </tr>
 
 
 
 </table>
 
 
         <table>
             <tr ng-repeat="details in edu | filter: search">
                <td>{{$index + 1}}</td>
    			 <td>{{details.educationLoanID}}</td> 
                 <td>{{details.eduLoanAmount}}</td>
                 <td>{{details.courseName}}</td>
                 <td>{{details.fatherName}}</td>
                 
                  
                  
             </tr>
         </table>
     </div>
     <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
     <script>
         var app = angular.module('myApp1', []);
         app.controller('EduCtrl', function($scope, $http){
             $http({
               method: 'GET',
               url: 'http://localhost:8079/BaseCodeSlice_BankManagementSystem/mvc/View1?accountNumber=${msg}'
             }).then(res=>res.data)
             .then(data => {
             	console.log(data);
             	$scope.edu=data;
             })
         
 
            
         })
     </script>
 </body>
 </html>

