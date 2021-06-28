package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.*;
import java.sql.*;

public final class sendMail1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>-->\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>Terms and Conditions</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("<!--  <script src=\"https://smtpjs.com/v3/smtp.js\"></script>-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("            background-color: #009999;\n");
      out.write("        }\n");
      out.write("        #trailTable{\n");
      out.write("            width: 50%;\n");
      out.write("        }\n");
      out.write("        th{\n");
      out.write("            text-align: center;\n");
      out.write("            background-color: #008080;\n");
      out.write("            color: #ffffff;\n");
      out.write("        }\n");
      out.write("        tr{\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("<!--<script type=\"text/javascript\">\n");
      out.write("    function sendEmail() {\n");
      out.write("        Email.send({\n");
      out.write("//            SecureToken: \"security token of your smtp\",\n");
      out.write("            To: \"btbtc18020_ankita@banasthali.in\",\n");
      out.write("            From: \"ankitasuman209@gmail.com\",\n");
      out.write("            Subject: \"document.getElementById('msg').value\",\n");
      out.write("            Body: \"document.getElementById('msg').value\"\n");
      out.write("        }).then( \n");
      out.write("            message => alert(\"mail sent successfully\")\n");
      out.write("        );\n");
      out.write("    }\n");
      out.write("</script>-->\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("//function sendMail() {\n");
      out.write("//    var link = \"mailto:\"+escape(document.getElementById('msg').value)\n");
      out.write("//             + \"?subject=Your loan has been approved in Aapno Bank.\"\n");
      out.write("//             + \"&body=Respected sir/madam\\n\\\n");
      out.write("//It is to notify you that your loan has been approved in our bank.\\n\\\n");
      out.write("//For more details visit your nearby bank.\\n\\\n");
      out.write("//Thanks and Regards.\";\n");
      out.write("//    \n");
      out.write("//    window.location.href = link;\n");
      out.write("//}\n");
      out.write("\n");
      out.write("$(document).ready(function() {\n");
      out.write("    $(\".btn-primary\").on(\"click\", function(e) {\n");
      out.write("        var id= $(this).attr('id');\n");
      out.write("        $.ajax({\n");
      out.write("            url:\"sendMail2.jsp\",\n");
      out.write("            type:\"post\",\n");
      out.write("            data:  {\n");
      out.write("    uid: id\n");
      out.write("  },\n");
      out.write("            success:function(data){\n");
      out.write("                $(\"#contentBody\").html(data);\n");
      out.write("                $(\"#myModal\").modal('show'); \n");
      out.write("            }\n");
      out.write("        })\n");
      out.write("    })\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<center>\n");
      out.write("<table border=\"1\" class=\"table\" id='trailTable' style=\"background-color:  #ffffff\">\n");
      out.write("                <tr>\n");
      out.write("                   <th>ID</th>\n");
      out.write("                   <th>Name</th>\n");
      out.write("               </tr>\n");

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
                                    
                                    
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>");
      out.print(str);
      out.write("</td>\n");
      out.write("                                    <td><button data-toggle=\"modal\" data-target=\"#myModal\" id=\"");
      out.print(str);
      out.write("\" class=\"btn btn-sm btn-primary\"><i class=\"glyphicon glyphicon-eye-open\"></i>    View</button></td>\n");
      out.write("</tr>    \n");
      out.write("\n");
      out.write("<!--                                 \n");
      out.write("<form action=\"\" onsubmit=\"sendMail(); return false\">\n");
      out.write("                    Loan ID: <br>\n");
      out.write("                    <input type=\"text\" id='msg' name=\"comment\" size=\"50\" value=\"\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("</form>-->\n");
      out.write("\n");
      out.write("   <div id=\"myModal\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("  <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("    <!-- Modal content-->\n");
      out.write("    <div class=\"modal-content\" >\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("        <h2 style=\"text-align: left\">Applicant's Details:-</h2>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\" id=\"contentBody\">\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                               ");
 }
                        }catch(Exception ex){}
                                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</table></center>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--<div class=\"container\">\n");
      out.write("  <h2>Most Important Terms and Conditions - </h2>\n");
      out.write("   Trigger the modal with a button \n");
      out.write("  <button type=\"button\" class=\"btn btn-info btn-lg\" data-toggle=\"modal\" data-target=\"#myModal\">Open Modal</button>\n");
      out.write("\n");
      out.write("   Modal \n");
      out.write("  <div class=\"modal fade\" id=\"myModal\" role=\"\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("        \n");
      out.write("    \n");
      out.write("       Modal content\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <h4 class=\"modal-title\">Modal Header</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\" >\n");
      out.write("            <div class=\"rich-text-box\" style=\"box-sizing: border-box; border: 2px solid transparent; padding: 30px;font: menu;\n");
      out.write("                font-size: 1.8rem;\">\n");
      out.write("                <form action=\"\" onsubmit=\"sendMail(); return false\">\n");
      out.write("                    Comment:<br>\n");
      out.write("                    <input type=\"text\" id='msg' name=\"comment\" size=\"50\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("</form>\n");
      out.write("            <form method=\"post\" enctype=\"text/plain\">\n");
      out.write("Name:<br>\n");
      out.write("<input type=\"text\" id='name' name=\"name\"><br>\n");
      out.write("E-mail:<br>\n");
      out.write("<input type=\"text\" id='emailID' name=\"mail\"><br>\n");
      out.write("Comment:<br>\n");
      out.write("<input type=\"text\" id='msg' name=\"comment\" size=\"50\"><br><br>\n");
      out.write("<input type=\"submit\" value=\"Send\">\n");
      out.write("<input type=\"reset\" value=\"Reset\">\n");
      out.write("</form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("          <button type=\"button\" class=\"btn btn-default\" onclick=sendEmail(); data-dismiss=\"modal\">submit</button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("</div>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--<form action=\"\" onsubmit=\"sendMail(); return false\">\n");
      out.write("                    Comment:<br>\n");
      out.write("                    <input type=\"text\" id='msg' name=\"comment\" size=\"50\" value=\"%>\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("</form>-->");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
