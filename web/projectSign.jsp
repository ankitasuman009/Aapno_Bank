<%-- 
    Document   : projectLogin
    Created on : 14 Jan, 2021, 3:59:50 PM
    Author     : ASUS
--%>

<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<!DOCTYPE html>
<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>

 <%
     Connection conn = null;
     Statement stmt = null;
     ResultSet rs = null;
     
     
     if(request.getParameter("login")!=null){
         try{
             Class.forName("com.mysql.jdbc.Driver");
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb?zeroDateTimeBehavior=convertToNull", "root", "");
             stmt = conn.createStatement();
             String uemail = request.getParameter("emailid");
             String upassword = request.getParameter("password");
             String[] emailsplit = uemail.split("@", 2);
             
             if(emailsplit[1].equals("banasthali.in")){
                 rs = stmt.executeQuery("select * from projectmanager where email = '"+uemail+"'");
                 if(rs.next()){
                     if(rs.getString(3).equals(upassword)){
                         response.sendRedirect("projectbank1.html");
                     }
                     else
                         out.print("<script>alert('Oops! Your password is incorrect.');window.location.href='projectLogin.html';</script>");
                 }
             }
             else{
                 rs = stmt.executeQuery("select * from projectsign where email = '"+uemail+"'");
                 if(rs.next()){
                     if(rs.getString(10).equals(upassword)){ 
                         response.sendRedirect("projectHome2.html");
                     }
                     else
                         out.print("<script>alert('Oops! Your password is incorrect.');window.location.href='projectLogin.html';</script>");
                 }
             }
             if(!rs.next() && uemail!=null){
                 out.print("<script>alert('No Such ID Exist');window.location.href='projectLogin.html';</script>");
//                    response.sendRedirect("LoginJSP");
             }
             else response.sendRedirect("projectLogin.html");
             conn.close();
         }catch(Exception ex){}
     }
     
     
     
     
     else if(request.getParameter("signup")!=null){
         try{
             String uemail = request.getParameter("emailid");
             
             if(uemail!=null){
                 String[] arremail = uemail.split("@", 2);
                 if(arremail[1].equals("banasthali.in")){
                     out.print( "<center><h4>Sorry you cannot register with this email ID</h4>"
                             + "<h3>Contact with administrator or try to signup with another email ID.</h3></center>");
                    %>
                    <center>
                    <div>
                        <form action="projectSignup.html">
                            <input type='submit' name="signup" value='Sign Up' style="background-color: slategrey;"/>
                        </form>
                    </div></center>
                    <%
                 }
                 else{
                     Class.forName("com.mysql.jdbc.Driver");
                     conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb?zeroDateTimeBehavior=convertToNull", "root", "");
                     stmt = conn.createStatement();
                     rs = stmt.executeQuery("select * from projectsign where email= '"+uemail+"'");
                     if(rs.next()){
                         out.print( "<center><h4>This ID already exist.</h4><h3>Try to log in.</h3></center>");
                         %>
                        <center>
                            <div>
                                <form action="projectLogin.html">
                                    <input type='submit' name="login" value='Log In' style="background-color: slategrey;"/>
                                </form>
                            </div>
                        </center>
                         <%                    
                     }
                     else{
                         rs = stmt.executeQuery("select max(id) from projectsign");
                         rs.next();
                         int id;
                         if(rs.getInt(1)!=0) id = rs.getInt(1) + 1;
                         else id = 3001;
                         String uname = request.getParameter("name");
                         String ufname = request.getParameter("fname");
                         String uaddress = request.getParameter("address");  
                         int upincode = Integer.parseInt(request.getParameter("pincode"));
                         String ucity = request.getParameter("city");
                         String ustate = request.getParameter("state");
                         double uno = Double.parseDouble(request.getParameter("phnno"));
                         String upassword = request.getParameter("password");
                         int a = 0;  
                         a = stmt.executeUpdate("insert into projectsign(id, name, fname, address, pincode, city, "
                                   + "state, contact, email, password) values("+id+", '"+uname+"', '"+ufname+"', '"+uaddress+"', "+upincode+", "
                                   + "'"+ucity+"', '"+ustate+"', "+uno+", '"+uemail+"', '"+upassword+"')");
                            
                         if(a>0) response.sendRedirect("projectHome2.html");
                         else out.print("<script>alert('Something went wrong! Try again.);window.location.href='projectSignup.html';</script>");
                     }
                 }
             }
             else response.sendRedirect("projectSignup.html");
             conn.close();
         }catch(Exception ex){}
     }




     else if(request.getParameter("Apply")!=null){
         try{
             Class.forName("com.mysql.jdbc.Driver");
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb?zeroDateTimeBehavior=convertToNull", "root", "");
             stmt = conn.createStatement();
             String uemail = request.getParameter("emailid");
             rs = stmt.executeQuery("select id from projectsign where email='"+uemail+"'");
             boolean status = rs.next();
             if(!status) out.print("<script>alert('No such ID exist');window.location.href='projectLoan.html';</script>");
else{
             String uloanid = "LP00" + Integer.toString(rs.getInt(1));
             rs = stmt.executeQuery("select * from projectdata where loanid='"+uloanid+"'");
         
             if(rs.next()){
                out.print("<center><h4>You have already applied for loan with loan ID "+uloanid+"</h4></center>");
                %>
                <center>
                    <div>
                        <form action="projectHome2.html">
                            <input type='submit' name="GoBack" value='GoBack' style="background-color: slategrey;"/>
                        </form>
                    </div>
                </center>
               <%
             }
            else{
                String ugender = request.getParameter("gender");
                String umarried = request.getParameter("marital");
                String udependents = request.getParameter("dependents");
                String uqualification = request.getParameter("qualification");  
                String uself_dependent = request.getParameter("self_dependent");
                double uincome = Double.parseDouble(request.getParameter("income"));
                double ucoincome = Double.parseDouble(request.getParameter("coincome"));
                double uloanamt = Double.parseDouble(request.getParameter("loanamt"));
                double uloanterms = Double.parseDouble(request.getParameter("loanterms"));
                int ucredit = Integer.parseInt(request.getParameter("credit"));
                String uproperty = request.getParameter("propertyarea");
//            out.print(uloanid + ugender + umarried+""+uqualification+udependents+uself_dependent+uincome+ucoincome+uloanamt+uloanterms+ucredit+uproperty);
//            int a = stmt.executeUpdate("insert into projectdata(loanid, gender, married, education, dependents, self_dependent, income, co_income, loan_amt, loan_terms, credit_history, property, loan_status) values('"+uloanid+"', 'female', 'N', 'Undergraduate', 3, 'N', 1234.0, 1234.0, 123.0, 123.0, 2, 'Semi-Urban', 'N')");
                int a = stmt.executeUpdate("insert into projectdata(loanid, gender, married, dependents, education, "
+ "self_dependent, income, co_income, loan_amt, loan_terms, credit_history, property) values('"+uloanid+"', "
+ "'"+ugender+"', '"+umarried+"', '"+udependents+"', '"+uqualification+"', '"+uself_dependent+"', "+uincome+", "
+ ""+ucoincome+", "+uloanamt+", "+uloanterms+", "+ucredit+", '"+uproperty+"')");
                if(a>0){ out.print("<center><h2>Your application successfully submitted with loan ID: "+uloanid+".</h2>"
+ "<p>A confirmation email will be send to you after 48 hrs.</p><h3>Thank You!</h3></center>");
%>
                   <center>
                    <div>
                        <form action="projectHome2.html" method="post">
                            <input type='submit' name="GoBack" value='GoBack' style="background-color: slategrey;"/>
                        </form>
                    </div></center>
<%
                 }
                 else out.print("<script>alert('Something went wrong! Try again.);window.location.href='projectLoan.html';</script>");
            }
}
                
        }catch(Exception ex){}finally{
                                conn.close();
                            }
    }        




    else if(request.getParameter("GoBack")!=null) response.sendRedirect("projectHome2.html");




    else if(request.getParameter("btnid")!=null){
        String uloanid = request.getParameter("loan_id");
        try{
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb?zeroDateTimeBehavior=convertToNull", "root", "");
        stmt = conn.createStatement();
        int a = 0;
        a = stmt.executeUpdate("delete from projectdata where loanid = '"+uloanid+"'");
        if(a>0)
            response.sendRedirect("projectView.jsp");
        else 
            out.print("<script>alert('Loan ID not found');window.location.href='projectDelete.html';</script>");
        }catch(Exception ex){}
    }



    else if(request.getParameter("btnemail")!=null){
        try{
            String uemailid = request.getParameter("email_id");
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb?zeroDateTimeBehavior=convertToNull", "root", "");
            stmt = conn.createStatement();
            int a = 0;
            rs = stmt.executeQuery("select id from projectsign where email='"+uemailid+"'");
            if(rs.next()){
                String uloan_id = "LP00" + Integer.toString(rs.getInt(1));
                a = stmt.executeUpdate("delete from projectdata where loanid = '"+uloan_id+"'");
                if(a>0)
                    response.sendRedirect("projectView.jsp");
            }
            else 
                out.print("<script LANGUAGE='JavaScript'>window.alert('Email ID not found');window.location.href='projectDelete.html';</script>");
        }catch(Exception ex){}
    }
    
    else{  
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb?zeroDateTimeBehavior=convertToNull", "root", "");
            stmt = conn.createStatement();
            int a = 0;
            a = stmt.executeUpdate("delete from projectdata");
            if(a>0)
                response.sendRedirect("projectView.jsp");
            else response.sendRedirect("projectDelete.html");
        }catch(Exception ex){}
    }

%>

