<%-- 
    Document   : modalTrail
    Created on : 12 May, 2021, 12:43:09 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" contentType="text/html"%>
<%@page import="java.sql.*" contentType="text/html"%>

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
<script type="text/javascript">
function sendMail() {
    var link = "mailto:"+escape(document.getElementById('hidden').value)
            +"?subject=Your loan has been approved in Aapno Bank."
             + "&body=Respected sir/madam%20%3A%0D%0A%0D"
+"It is to notify you that your loan has been approved in our bank.%0D"
+"For more details visit your nearby bank.%0D%0D"
+"Thanks and Regards.%0D"
+"Aapno Bank - You trust therefore we exist.";
    
    window.location.href = link;
}
</script>

<form action="" onsubmit="sendMail(); return false">
    
                        
                    <%
                        try{
                            Connection conn = null;
                            Statement stmt = null;
                            ResultSet rs1 = null;
                            ResultSet rs2 = null;
                            Class.forName("com.mysql.jdbc.Driver");
                            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb?zeroDateTimeBehavior=convertToNull", "root", "");
                            stmt = conn.createStatement();
                            String str = request.getParameter("uid");
//                            rs1 = stmt.executeQuery("select * from pojectsign");
//                            while(rs1.next()){
//                                String ulaonid = "LP00" + Integer.toString(rs1.getInt(1) + 1);
//                                String uname = rs1.getString(2);
////                                String uemail = rs1.getString(9);r
                            rs1 = stmt.executeQuery("select * from sub_table2 where loan_id='"+str+"'");
                            if(rs1.next()){
                    
                        
//                                    out.print("mila 1?");
//                                    String str = rs1.getString("loan_id");
                                    String strArr[] = {str.substring(0, 4), str.substring(4)};
                                    int u_id = Integer.parseInt(strArr[1]);
                                    Statement stmt2 = conn.createStatement();
                                    rs2 = stmt2.executeQuery("select * from projectsign where id="+u_id+"");
//                                    String u_name = rs2.getString(2);
                                    
                                    if(rs2.next()){
//                                        out.print("mila 2?");
                                    String u_email = rs2.getString(9);
                                    %>
    <table border="1" class="table" style="background-color:  #ffcc99">
  <tr>
                   <th>ID</th>
                   <th>Name</th>    
                    <th>Loan ID</th>
                   <th>Email ID</th>
               </tr>                
                                    <tr>
                                        <td> <%= u_id %> </td>
                                        <td> <%= rs2.getString(2) %> </td>
                                        <td> <%= str %> </td>
                                        <td> <%= u_email %> </td>
                                    </tr>
                                    </table>
                                    <input type='hidden' id='hidden' value='<%=u_email%>'>
                                    <button type="submit" class="btn btn-primary" style="float: left;">Send mail</button>
               
                                    
                    <%
                         }
                         else{
                                %>
                                <div style='text-align: left'>This data is not available in the database.</div>  
                                        <%
                                }
                            }


                        }catch(Exception ex){}
                    
                    %>
                    
    
                      

</form>

</body>
</html>

