
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<body bgcolor="yellow">
    <center>
        <h1 style="color: aquamarine;"> ACCOUNT HOLDER DETAILS...</h1>
        <table border="2"> 
<tr> 
	
    <th>Account_Number</th> 
    <th> Account_name</th> 
    <th>AccountBalance</th> 
    <th>Address</th> 
    <th>MobileNo</th> 
    
</tr> 
  <tr>
        <td>${account.accountNumber}</td>   
        <td>${account.name}</td>    
        <td>${account.accountBalance}</td>  
        <td>${account.address}</td>  
        <td>${account.mobileNo}</td>  
  </tr>
  </table>
        <td> 
          <a href="/">Home Page</a> 
        </center>
</body>