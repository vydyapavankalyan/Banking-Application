<head>
    <title>Insert Title here</title>
       
        <style>
            .navbar{
                width: 100%;
                height:40px;
                background-color:yellowgreen ;
                font-size: x-large;
            }
         </style>
         </head>
         <body>
        <center>
            <h1 style="color: rgb(13, 13, 235);"> OPEN ACCOUNT FORM</h1>
           <div class="navbar">
            <a href="/h">Home </a> &nbsp&nbsp&nbsp&nbsp&nbsp
            <a href="/Newaccount">New Account</a> &nbsp&nbsp&nbsp&nbsp&nbsp
            <a href="/Balance">Balance</a> &nbsp&nbsp&nbsp&nbsp&nbsp
            <a href="/Deposit">Deposit</a> &nbsp&nbsp&nbsp&nbsp&nbsp
            <a href="/withdraw">Withdraw</a> &nbsp&nbsp&nbsp&nbsp&nbsp
            <a href="/Transfer">Transfer</a> &nbsp&nbsp&nbsp&nbsp&nbsp
            <a href="/CloseA/c">CloseA/C</a> &nbsp&nbsp&nbsp&nbsp&nbsp
        </div>
        </center>
        
        <form action="Newaccount2p" method="POST">
        
      <center> <table>
        <tr>
        <td> Account Number:</td>
        <td><input type="text" name="accountNumber"/></td>
        </tr>
        <tr>
        <td>Name:</td>
        <td><input type="text" name="name"/></td>
        </tr>
        <tr>
        <td>Password:</td>
        <td><input type="text" name="password"/></td>
        </tr>
        <tr>
        <td>Confirm_Password::</td>
        <td><input type="text" name="confirm_password"/></td>
        </tr>
        <tr>
        <td>Account Balance:</td>
        <td><input type="text" name="accountBalance"/></td>
        </tr>
        <tr>
        <td>Address:</td>
        <td><input type="text" name="address"/></td>
        </tr>
        <tr>
        <td>Mobile No::</td>
        <td><input type="number" name="mobileNo"/></td>
        </tr>
        <tr>
        <td><input type="submit" value="submit"/></td>
        <td><input type="submit" value="Clear"/></td>
        </tr>
        </table>
        </form>
         </center>
    </body>
    