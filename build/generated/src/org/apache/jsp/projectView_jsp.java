package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class projectView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <title>Aapno Bank - Home</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/header.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("<script type = \"text/javascript\" >\n");
      out.write("   function preventBack(){\n");
      out.write("       window.history.forward();\n");
      out.write("   }\n");
      out.write("    setTimeout(\"preventBack()\", 0);\n");
      out.write("    window.onunload=function(){null};\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"hero-image\">\n");
      out.write("        <style>\n");
      out.write("            .hero-image {\n");
      out.write("                background-image: url(\"images/bank1.jpeg\");\n");
      out.write("                background-color: #cccccc;\n");
      out.write("                height: 650px;\n");
      out.write("                background-position: center;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: cover;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("                /*display: block;*/\n");
      out.write("                /*position: fixed;*/\n");
      out.write("            }\n");
      out.write("             #text1{\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("                /*font-weight: bold*/\n");
      out.write("            }\n");
      out.write("            #left1{\n");
      out.write("                display: block;\n");
      out.write("                padding: 20px;\n");
      out.write("                color: graytext;\n");
      out.write("                \n");
      out.write("                /*width: 30%;*/\n");
      out.write("            }\n");
      out.write("            #right1{\n");
      out.write("                padding: 10px;\n");
      out.write("                background-color: lightblue;\n");
      out.write("                /*width: 30%;*/\n");
      out.write("            }\n");
      out.write("            .innerleft1{\n");
      out.write("                display: relative;\n");
      out.write("                border-right: 1px solid white;\n");
      out.write("                border-bottom: 1px solid white;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 1.5rem;\n");
      out.write("            }\n");
      out.write("            .innerleft1:hover{\n");
      out.write("                /*text-decoration: none;*/\n");
      out.write("                /*border-radius: 20px;*/\n");
      out.write("                border: 1px solid white;\n");
      out.write("            }\n");
      out.write("            a{\n");
      out.write("                text-decoration : none;\n");
      out.write("            }\n");
      out.write("            innerleft1 a:hover{\n");
      out.write("                text-decoration: none;\n");
      out.write("                background-color: #fff;\n");
      out.write("                color: #111;\n");
      out.write("            }\n");
      out.write("            #home2 {\n");
      out.write("                border-radius:100px;\n");
      out.write("                border: 5px solid #fff;\n");
      out.write("                color: #fff;\n");
      out.write("    /*width:0;*/\n");
      out.write("    /*height:0;*/\n");
      out.write("            }\n");
      out.write("            #other2 {\n");
      out.write("                border-radius:100px;\n");
      out.write("                border: 5px solid transparent;\n");
      out.write("            }\n");
      out.write("            #home2:hover{\n");
      out.write("                background-color: #fff;\n");
      out.write("                color: #111;\n");
      out.write("                font-family: sans-serif;\n");
      out.write("            }\n");
      out.write("            #other2:hover{\n");
      out.write("                background-color: #fff;\n");
      out.write("                color: #111;\n");
      out.write("                font-family: sans-serif;\n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("        <header>\n");
      out.write("            <div  id=\"text1\"  class=\"header container-fluid tranparent\">\n");
      out.write("                <h2><sup>Aapno</sup><sub> Bank</sub></h2>\n");
      out.write("                <p style=\"position:absolute; left:100px;color: white\"> - You trust therefore we are.</p>\n");
      out.write("            \n");
      out.write("                <ul>\n");
      out.write("                    <li><a id=\"other2\" href=\"projectHome1.html\">Sign Out</a></li>\n");
      out.write("                    <li><a id=\"home2\" href=\"#\">Data</a></li>\n");
      out.write("                    <li><a id=\"other2\" href=\"#\">News</a></li>\n");
      out.write("                    <li><a id=\"other2\" href=\"#\">Report</a></li>\n");
      out.write("                    <li><a id=\"other2\" href=\"projectbank1.html\">Home</a></li>\n");
      out.write("                    \n");
      out.write("                </ul></div>\n");
      out.write("        </header>\n");
      out.write("        <div class='container-fluid' style=\"\">\n");
      out.write("            <div class='row'>\n");
      out.write("                <div id='left1' class='col-sm-3'>\n");
      out.write("                    <form action=\"projectSign.jsp\" method=\"post\" name=\"loan\">\n");
      out.write("                        <div class='innerleft1'><a href='#' class='text-white' style=\"text-decoration : none\">View Data</a></div><hr>\n");
      out.write("                        <div class='innerleft1'><a href='#' style=\"text-decoration : none\">Insert Data</a></div><hr>\n");
      out.write("                        <div class='innerleft1'><a href='#' style=\"text-decoration : none\">Update Data</a></div><hr>\n");
      out.write("                        <div class='innerleft1'><a href='trial.html' style=\"text-decoration : none\">Delete Data</a></div><hr>\n");
      out.write("                        <div class='innerleft1'><a href='#' style=\"text-decoration : none\">Filter</a></div><hr>\n");
      out.write("                        <div class='innerleft1'><a href='#' style=\"text-decoration : none\">Extract</a></div><hr>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div id='right1' class='col-sm-9' style=\"margin-top: 10px\">\n");
      out.write("                    <table border=\"1\">\n");
      out.write("                <tr>\n");
      out.write("                   <th>Loan ID</th>\n");
      out.write("                   <th>Gender</th>\n");
      out.write("                   <th>Married</th>\n");
      out.write("                   <th>Dependents</th>\n");
      out.write("                   <th>Education</th>\n");
      out.write("                   <th>Self Dependent</th>\n");
      out.write("                   <th>Income</th>\n");
      out.write("                   <th>Co Income</th>\n");
      out.write("                   <th>Loan Amount</th>\n");
      out.write("                   <th>Loan Terms</th>\n");
      out.write("                   <th>Credit History</th>\n");
      out.write("                   <th>Property</th>\n");
      out.write("               </tr>\n");
      out.write("                    ");

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

                                    
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                    \n");
      out.write("                                    <td> ");
      out.print( rs2.getString(1) );
      out.write(" </td>\n");
      out.write("                                    <td> ");
      out.print( rs2.getString(2) );
      out.write(" </td>\n");
      out.write("                                    <td> ");
      out.print( rs2.getString(3) );
      out.write(" </td>\n");
      out.write("                                    <td> ");
      out.print( rs2.getInt(4) );
      out.write(" </td>\n");
      out.write("                                    <td> ");
      out.print( rs2.getString(5) );
      out.write(" </td>\n");
      out.write("                                    <td> ");
      out.print( rs2.getString(6) );
      out.write(" </td>\n");
      out.write("                                    <td> ");
      out.print( rs2.getDouble(7) );
      out.write(" </td>\n");
      out.write("                                    <td> ");
      out.print( rs2.getDouble(8) );
      out.write(" </td>\n");
      out.write("                                    <td> ");
      out.print( rs2.getDouble(9) );
      out.write(" </td>\n");
      out.write("                                    <td> ");
      out.print( rs2.getDouble(10) );
      out.write(" </td>\n");
      out.write("                                    <td> ");
      out.print( rs2.getInt(11) );
      out.write(" </td>\n");
      out.write("                                    <td> ");
      out.print( rs2.getString(12) );
      out.write(" </td>\n");
      out.write("               </tr>\n");
      out.write("                                    \n");
      out.write("                    ");

                         }
//                            }
                        }catch(Exception ex){}
                    
                    
      out.write("\n");
      out.write("                    </table> \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
