<%--
  Created by IntelliJ IDEA.
  User: YEN
  Date: 5/24/2021
  Time: 3:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Caculator</title>
  </head>
  <body>
      <h1>SIMPLE CACULATOR</h1>
  <form action ="/caculator", method ="post">
      <span>caculator</span>
      <span>firstOperator</span><input name="number1" type="text" size="15px" />
      </br>
      <span>operator</span>
      <select name ="operator">
            <option value='+'>Addition</option>
            <option value='-'>Subtraction</option>
            <option value='*'>Mutil</option>
            <option value='/'>Division</option>
      </select>
      <br>

    <span>secondOperator</span><input name="number2" type="text" size="15px" />
    </br>
    <button type="submit">caculator</button>


  </form>
  </body>
</html>
