<%-- 
    Document   : modalTrail
    Created on : 12 May, 2021, 12:43:09 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>-->

<!DOCTYPE html>
<html>
<style>
body {font-family: Arial, Helvetica, sans-serif;}

form {
    border: 3px solid #f1f1f1;
    font-family: Arial;
}

.container {
    padding: 20px;
    background-color: #f1f1f1;
    width: 560px;
}

input[type=text], input[type=submit] {
    width: 100%;
    padding: 12px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

input[type=checkbox] {
    margin-top: 16px;
}

input[type=submit] {
    background-color: #4CAF50;
    color: white;
    border: none;
}

input[type=submit]:hover {
    opacity: 0.8;
}
</style>
<body>

<h2>CSS Newsletter</h2>

<form action="/action_page.php">
  <div class="container">
    <h2>Subscribe to our Newsletter</h2>
    <p>Lorem ipsum text about why you should subscribe to our newsletter blabla. Lorem ipsum text about why you should subscribe to our newsletter blabla.</p>
  </div>
<%String str = request.getParameter("uid");%>
  <div class="container" style="background-color:white">
    <input type="text" placeholder="Name" name="name" value="<%=str%>" required>
    <input type="text" placeholder="Email address" name="mail" required>
    <label>
      <input type="checkbox" checked="checked" name="subscribe"> Daily Newsletter
    </label>
  </div>

  <div class="container">
    <input type="submit" value="Subscribe">
  </div>
</form>

</body>
</html>

