<%-- 
    Document   : trail.jsp
    Created on : 25 Apr, 2021, 1:10:31 AM
    Author     : ASUS
--%>

<%@page import="java.time.LocalDateTime"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.text.SimpleDateFormat"%>
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
        <%
//            String str = request.getParameter("date") + " " + request.getParameter("time");
////            SimpleDateFormat sdf=new SimpleDateFormat("E MMM dd hh:mm:ss Z yyyy");
////Date startDate = sdf.parse(request.getParameter("date"));
////            Date ld = new SimpleDateFormat.parse();
//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
//
////LocalDate userDate = LocalDate.parse(request.getParameter("date"));
////userDate.getMonth();
//dateTime.getDayOfMonth();
//
//
//            out.print(dateTime.getMonth());
        %>
    </body>
</html>-->

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Aapno Bank - Send Mails</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<!--  <script src="https://smtpjs.com/v3/smtp.js"></script>-->
</head>
<body>
    <style>
        body{
            background-color: #4d4d4d;
        }
        #trailTable{
            width: 50%;
        }
        th{
            text-align: center;
            background-color: #000000;
            color: #ffffff;
        }
        tr{
            background-color: #333333;
            color: #ffffff;
            text-align: center;
        }
        
    </style>

<!--<script type="text/javascript">
    function sendEmail() {
        Email.send({
//            SecureToken: "security token of your smtp",
            To: "btbtc18020_ankita@banasthali.in",
            From: "ankitasuman209@gmail.com",
            Subject: "document.getElementById('msg').value",
            Body: "document.getElementById('msg').value"
        }).then( 
            message => alert("mail sent successfully")
        );
    }
</script>-->
<script type="text/javascript">
//function sendMail() {
//    var link = "mailto:"+escape(document.getElementById('msg').value)
//             + "?subject=Your loan has been approved in Aapno Bank."
//             + "&body=Respected sir/madam\n\
//It is to notify you that your loan has been approved in our bank.\n\
//For more details visit your nearby bank.\n\
//Thanks and Regards.";
//    
//    window.location.href = link;
//}

$(document).ready(function() {
    $(".btn-primary").on("click", function(e) {
        var id= $(this).attr('id');
        $.ajax({
            url:"sendMail2.jsp",
            type:"post",
            data:  {
                uid: id
            },
            success:function(data){
                $("#contentBody").html(data);
                $("#myModal").modal('show'); 
            }
        })
    })
});
</script>
<center>
<table border="1" class="table" id='trailTable' style="background-color:  #ffffff">
                <tr>
                   <th>ID</th>
                   <th>Details</th>
               </tr>
<%
                        try{
                            Connection conn = null;
                            Statement stmt = null;
                            ResultSet rs1 = null;
                            Class.forName("com.mysql.jdbc.Driver");
                            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb?zeroDateTimeBehavior=convertToNull", "root", "");
                            stmt = conn.createStatement();
                            rs1 = stmt.executeQuery("select * from sub_table2");
//                            rs1.getString("loan_id");

                                while(rs1.next()){
//                                    out.print();
                                    String str = rs1.getString("loan_id");
                                    
                                    %>
                                    <tr>
                                        <td><%=str%></td>
                                    <td><button data-toggle="modal" data-target="#myModal" id="<%=str%>" class="btn btn-sm btn-primary"><i class="glyphicon glyphicon-eye-open"></i> View</button></td>
</tr>    

<!--                                 
<form action="" onsubmit="sendMail(); return false">
                    Loan ID: <br>
                    <input type="text" id='msg' name="comment" size="50" value="">
                    <button type="submit" class="btn btn-primary">Submit</button>
</form>-->

   <div id="myModal" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content" >
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h2 style="text-align: left">Applicant's Details:-</h2>
      </div>
      <div class="modal-body" id="contentBody">

      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>

  </div>
</div>


                               <% }
                        }catch(Exception ex){}
                                    %>









</table></center>
</body>
</html>


<!--<div class="container">
  <h2>Most Important Terms and Conditions - </h2>
   Trigger the modal with a button 
  <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Open Modal</button>

   Modal 
  <div class="modal fade" id="myModal" role="">
    <div class="modal-dialog">
        
    
       Modal content
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Modal Header</h4>
        </div>
        <div class="modal-body" >
            <div class="rich-text-box" style="box-sizing: border-box; border: 2px solid transparent; padding: 30px;font: menu;
                font-size: 1.8rem;">
                <form action="" onsubmit="sendMail(); return false">
                    Comment:<br>
                    <input type="text" id='msg' name="comment" size="50">
                    <button type="submit" class="btn btn-primary">Submit</button>
</form>
            <form method="post" enctype="text/plain">
Name:<br>
<input type="text" id='name' name="name"><br>
E-mail:<br>
<input type="text" id='emailID' name="mail"><br>
Comment:<br>
<input type="text" id='msg' name="comment" size="50"><br><br>
<input type="submit" value="Send">
<input type="reset" value="Reset">
</form>
            </div>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" onclick=sendEmail(); data-dismiss="modal">submit</button>
        </div>
      </div>
      
    </div>
  </div>
  
</div>-->



<!--<form action="" onsubmit="sendMail(); return false">
                    Comment:<br>
                    <input type="text" id='msg' name="comment" size="50" value="%>">
                    <button type="submit" class="btn btn-primary">Submit</button>
</form>-->