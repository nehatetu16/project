<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.3.1/css/foundation.css">
<title>Insert title here</title>
</head>
<body>


 <body ng-app="myApp">
     <div ng-controller="EmpCtrl">
        
       <input type="text" ng-model="search.$" placeholder="Search By Company name"/>
        <hr/>
 
         <table>
             <tr ng-repeat="detail in homeLoan | filter: search">
                 <td>{{$index + 1}}</td>
                 <td>{{detail.homeLoanId}}</td> 
                 <td>{{detail.loanAmount}}</td>
                  <td>{{detail.companyName}}</td>
             </tr>
         </table>
     </div>
     <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
     <script>
         var app = angular.module('myApp', []);
         app.controller('EmpCtrl', function($scope, $http){
             $http({
               method: 'GET',
               url: 'http://localhost:8079/BaseCodeSlice_BankManagementSystem/mvc/viewHomeLoan1'
             }).then(res=>res.data)
             .then(data => {
             	console.log(data);
             	$scope.homeLoan=data;
             })
         
 
            
         })
     </script>
 </body>
 </html>

