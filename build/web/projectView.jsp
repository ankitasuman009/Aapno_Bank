<%-- 
    Document   : projectView
    Created on : 5 Mar, 2021, 5:24:54 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.sql.*" contentType="text/html"%>
<html>
    <head>
    <title>Aapno Bank - View</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/header.css" type="text/css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        
        
<script type = "text/javascript" >
   function preventBack(){
       window.history.forward();
   }
    setTimeout("preventBack()", 0);
    window.onunload=function(){null};
    
</script>
    </head>
    <body class="hero-image">
        <style>
            .hero-image {
                background-image: url("images/bank1.jpeg");
                background-color: #cccccc;
                height: 650px;
                background-position: center;
                background-repeat: no-repeat;
                background-size: cover;
                position: relative;
            }
            body{
                font-family: Arial, Helvetica, sans-serif;
                background-color: black;
                /*display: block;*/
                /*position: fixed;*/
            }
             #text1{
                font-family: Arial, Helvetica, sans-serif;
                /*font-weight: bold*/
            }
            #left1{
                display: block;
                padding: 20px;
                color: graytext;
                
                /*width: 30%;*/
            }
            #right1{
                padding: 10px;
                /*background-color: lightblue;*/
                /*width: 30%;*/
            }
            .innerleft1{
                display: relative;
                border-right: 1px solid white;
                border-bottom: 1px solid white;
                text-align: center;
                font-size: 1.5rem;
            }
            .innerleft1:hover{
                /*text-decoration: none;*/
                /*border-radius: 20px;*/
                border: 1px solid white;
            }
            a{
                text-decoration : none;
            }
            innerleft1 a:hover{
                text-decoration: none;
                background-color: #fff;
                color: #111;
            }
            #home2 {
                border-radius:100px;
                border: 5px solid #fff;
                color: #fff;
            }
            #other2 {
                border-radius:100px;
                border: 5px solid transparent;
            }
            #home2:hover{
                background-color: #fff;
                color: #111;
                font-family: sans-serif;
            }
            #other2:hover{
                background-color: #fff;
                color: #111;
                font-family: sans-serif;
            }
            
            table {
                width: 100%;
            }

            th {
                height: 70px;
                background-color: #ffa64d;
            }
            </style>
        <header>
            <div  id="text1"  class="header container-fluid tranparent">
                <h2><sup>Aapno</sup><sub> Bank</sub></h2>
                <p style="position:absolute; left:100px;color: white"> - You trust therefore we are.</p>
            
                <ul>
                    <li><a id="other2" href="projectHome1.html">Sign Out</a></li>
                    <li><a id="home2" href="#">Data</a></li>
                    <li><a id="other2" href="#">News</a></li>
                    <li><a id="other2" href="projectReport.html">Report</a></li>
                    <li><a id="other2" href="projectbank1.html">Home</a></li>
                    
                </ul></div>
        </header>
        <div class='container-fluid' style="">
            <div class='row'>
                <div id='left1' class='col-sm-3'>
                    <form action="projectSign.jsp" method="post" name="loan">
                        <div class='innerleft1'><a href='#' class='text-white' style="text-decoration : none">View Data</a></div><hr>
                        <div class='innerleft1'><a href='#' style="text-decoration : none">Insert Data</a></div><hr>
                        <div class='innerleft1'><a href='#' style="text-decoration : none">Update Data</a></div><hr>
                        <div class='innerleft1'><a href='projectDelete.html' style="text-decoration : none">Delete Data</a></div><hr>
                        <div class='innerleft1'><a href='projectApproval.jsp' style="text-decoration : none">Approval</a></div><hr>
                        <div class='innerleft1'><a href='#' style="text-decoration : none">Send Mails</a></div><hr>
                    </form>
                </div>
                <div id='right1' class='col-sm-9' style="margin-top: 10px">
                    <table border="1" class="" style="background-color:  #ffcc99">
                <tr>
                   <th>Loan ID</th>
                   <th>Gender</th>
                   <th>Married</th>
                   <th>Dependents</th>
                   <th>Education</th>
                   <th>Self Dependent</th>
                   <th>Income</th>
                   <th>Co Income</th>
                   <th>Loan Amount</th>
                   <th>Loan Terms</th>
                   <th>Credit History</th>
                   <th>Property</th>
               </tr>
                    <%
                        try{
                            Connection conn = null;
                            Statement stmt = null;
                            ResultSet rs1 = null;
                            ResultSet rs2 = null;
                            Class.forName("com.mysql.jdbc.Driver");
                            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb?zeroDateTimeBehavior=convertToNull", "root", "");
                            stmt = conn.createStatement();
//                            rs1 = stmt.executeQuery("select * from projectsign");
//                            while(rs1.next()){
//                                String ulaonid = "LP00" + Integer.toString(rs1.getInt(1) + 1);
//                                String uname = rs1.getString(2);
////                                String uemail = rs1.getString(9);
                                rs2 = stmt.executeQuery("select * from projectdata");

                                while(rs2.next()){
//                                    String ugender = rs2.getString(2);
//                                    String umarried = rs2.getString(3);
//                                    int udependents = rs2.getInt(4);
//                                    String uqualification = rs2.getString(5); 
//                                    String uself_dependent = rs2.getString(6);
//                                    double uincome = rs2.getDouble(7);
//                                    double ucoincome = rs2.getDouble(8);
//                                    double uloanamt = rs2.getDouble(9);
//                                    double uloanterms = rs2.getDouble(10);
//                                    int ucredit = rs2.getInt(11);
//                                    String uproperty = rs2.getString(12);

                                    %>
                                    <tr>
                                    
                                    <td> <%= rs2.getString(1) %> </td>
                                    <td> <%= rs2.getString(2) %> </td>
                                    <td> <%= rs2.getString(3) %> </td>
                                    <td> <%= rs2.getString(4) %> </td>
                                    <td> <%= rs2.getString(5) %> </td>
                                    <td> <%= rs2.getString(6) %> </td>
                                    <td> <%= rs2.getDouble(7) %> </td>
                                    <td> <%= rs2.getDouble(8) %> </td>
                                    <td> <%= rs2.getDouble(9) %> </td>
                                    <td> <%= rs2.getDouble(10) %> </td>
                                    <td> <%= rs2.getInt(11) %> </td>
                                    <td> <%= rs2.getString(12) %> </td>
               </tr>
                                    
                    <%
                         }
//                            }
                        }catch(Exception ex){}
                    
                    %>
                    </table> 
                </div>
            </div>
        </div>
    </body>
</html>
