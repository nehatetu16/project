<html>
<head>
    <title>Transaction List</title>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.3.1/css/foundation.css">
    
    
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

<table>
<tr>
  <td width="20%"><a href="http://localhost:8079/BaseCodeSlice_BankManagementSystem/mvc/viewHomePage?accountNumber=${msg}" class="button1" />Home</a>

</table>

    <div ng-controller="EmpCtrl">
     <h2>Your account number is:{{userdisplay[0].accountNumber}}</h2>
       
      <input type="text" ng-model="search.accountHolderName" placeholder="Search"/>
       <hr/>

        <table>
            <tr ng-repeat="list in li | filter: search">
                <td>{{$index + 1}}</td>
                <td>{{list.transactionId}}</td>
                <td>{{list.transactionDescription}}</td>
                <td>{{list.transactionType}}</td>
                 <td>{{list.transactionAmount}}</td>
            </tr>
        </table>
    </div>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
    <script>
        var app = angular.module('myApp', []);
        app.controller('EmpCtrl', function($scope, $http){
            $http({
              method: 'GET',
              url: 'http://localhost:8079/BaseCodeSlice_BankManagementSystem/mvc/transaction?accountNumber=${msg}'
            }).then(res=>res.data)
            .then(data => {
            	console.log(data);
            	$scope.userdisplay=data;
            	$scope.li = data[0].trans;
            })
        
           
        })
    </script>
</body>

</html>