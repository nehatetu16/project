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
{{edu}}

 <body ng-app="myApp1">
     <div ng-controller="EduCtrl">
        
       <input type="text" ng-model="search.course_Name" placeholder="Search By Course_Name"/>
        <hr/>
 
         <table>
             <tr ng-repeat="details in edu | filter: search">
                
    			 <td>{{details.course_Name}}</td> 
                 <td>{{details.father_Name}}</td>
                 
                  
                  
             </tr>
         </table>
     </div>
     <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
     <script>
         var app = angular.module('myApp1', []);
         app.controller('EduCtrl', function($scope, $http){
             $http({
               method: 'GET',
               url: 'http://localhost:8079/BaseCodeSlice_BankManagementSystem/mvc/View1'
             }).then(res=>res.data)
             .then(data => {
             	console.log(data);
             	$scope.edu=data;
             })
         
 
            
         })
     </script>
 </body>
 </html>

