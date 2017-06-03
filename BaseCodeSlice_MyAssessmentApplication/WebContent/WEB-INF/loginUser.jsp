 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
  <html>
  <head>
  <title>Login Page</title>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.3.1/css/foundation.css">
  <style>
  	.cssClass {
  		background-color: red;
  	}
  </style>
  </head>
  <body>
  
  <form:form method="POST" commandName="/BaseCodeSlice_BankManagementSystem/mvc/loginUser" modelAttribute="login">
  <table>
      <tr>
          <td>A/c Number  :</td>
          <td><form:input path="accountNumber" /></td>
        
      </tr> 
      
    <tr>
          <td colspan="12"><input type="submit" value="login"></td>
      </tr>
  </table>
  </form:form>
  
  </body>
  </html>