package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;

public final class trail2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!--<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("    </body>\n");
      out.write("</html>-->\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<style>\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("\n");
      out.write("form {\n");
      out.write("    border: 3px solid #f1f1f1;\n");
      out.write("    font-family: Arial;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("    padding: 20px;\n");
      out.write("    background-color: #f1f1f1;\n");
      out.write("    width: 560px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text], input[type=submit] {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=checkbox] {\n");
      out.write("    margin-top: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit] {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    border: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover {\n");
      out.write("    opacity: 0.8;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function sendMail() {\n");
      out.write("    var link = \"mailto:\"+escape(document.getElementById('hidden').value)\n");
      out.write("            +\"?subject=This is my subject\"\n");
      out.write("             + \"&body=body\";\n");
      out.write("    \n");
      out.write("    window.location.href = link;\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<form action=\"\" onsubmit=\"sendMail(); return false\">\n");
      out.write("    \n");
      out.write("                        \n");
      out.write("                    ");

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
                                    
      out.write("\n");
      out.write("    <table border=\"1\" class=\"table\" style=\"background-color:  #ffcc99\">\n");
      out.write("  <tr>\n");
      out.write("                   <th>ID</th>\n");
      out.write("                   <th>Name</th>    \n");
      out.write("                    <th>Loan ID</th>\n");
      out.write("                   <th>Email ID</th>\n");
      out.write("               </tr>                \n");
      out.write("                                    <tr>\n");
      out.write("                                        <td> ");
      out.print( u_id );
      out.write(" </td>\n");
      out.write("                                        <td> ");
      out.print( rs2.getString(2) );
      out.write(" </td>\n");
      out.write("                                        <td> ");
      out.print( str );
      out.write(" </td>\n");
      out.write("                                        <td> ");
      out.print( u_email );
      out.write(" </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    </table>\n");
      out.write("                                    <input type='hidden' id='hidden' value='");
      out.print(u_email);
      out.write("'>\n");
      out.write("<button type=\"submit\" class=\"btn btn-primary\">Send Mail</button>\n");
      out.write("               \n");
      out.write("                                    \n");
      out.write("                    ");

                         }
                         else{
                                
      out.write("\n");
      out.write("                                <div>This data is not available in the database.</div>  \n");
      out.write("                                        ");

                                }
                            }


                        }catch(Exception ex){}
                    
                    
      out.write("\n");
      out.write("                    \n");
      out.write("    \n");
      out.write("                      \n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
