package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import MyPack.MyDB;

public final class departmentComplaint_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>My first bootstrap</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"bootstrap.css\">\n");
      out.write("\t<script  src=\"jquery.js\"></script>\n");
      out.write("\t<script  src=\"bootstrap.js\"></script>\t\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\t\t\n");
      out.write("\t</style>\n");
      out.write("\t\t\n");
      out.write("</head>  \n");
      out.write(" \n");
      out.write("<body data-spy=\"scroll\" data-target=\".navbar\" >\n");
      out.write("    <!--Session -->\n");
      out.write("    \n");
      out.write("      ");
   
String stu=(String)session.getAttribute("id");  
//String msg=(String) request.getSession().getAttribute("msg");
//out.print(msg);
//out.print(stu);   

      out.write("  \n");
 
   response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
   response.setHeader("Progma", "no-cache");
    response.setHeader("Expires", "0");
      if( session.getAttribute("id")==null)
          response.sendRedirect("index.jsp");

      out.write('\n');
 String com=(String)session.getAttribute("id");  
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("<!-- Navbar is here-->\n");
      out.write("\t<nav class=\"navbar navbar-inverse navbar-fixed-top\" >\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t \t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        \t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("       \t\t\t\t <span class=\"icon-bar\"></span>\n");
      out.write("        \t\t\t<span class=\"icon-bar\"></span> \n");
      out.write("      \t\t\t</button>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t<span class=\"navbar-text white-text\" id=\"New\" style=\"font-size: 30px;color: white;\">\n");
      out.write("    \t\t\t\t<img src=\"mnnit.png\" width=\"50\" height=\"50\" alt=\"\">\n");
      out.write("        \t\t\tComplaint Management System\n");
      out.write("    \t\t\t</span>\n");
      out.write("    \t</div>\n");
      out.write("    \t<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\" style=\"font-size: 20px;text-align: center;padding: 15px;\" id=\"preet\">\n");
      out.write("          <li><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("        </ul>\n");
      out.write("         <ul class=\"nav navbar-nav navbar-right\" style=\"font-size: 20px;text-align: center;padding: 15px;\" id=\"preet\">\n");
      out.write("          <li><a href=\"update.jsp?com=");
out.print(com);
      out.write("\">Update profile</a></li>\n");
      out.write("        </ul>    \n");
      out.write("   \t\t\t\n");
      out.write("\t\t</div>\t\n");
      out.write("\t</div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<!-- Complaint registration Form  is here-->\n");
      out.write("\n");
      out.write("<div class=\"container\" style=\"padding-top: 100px; float: left;\">\n");
      out.write("  \n");
      out.write("\t\n");
      out.write("\t <div class=\"col-md-10\" style=\"float: right\">\n");
      out.write("              <div class=\"col-md-8\" style=\"float:right\">\n");
      out.write("                <h3 style=\"color:#0d47a1;\"><strong>Compliants list</strong></h3> \n");
      out.write("            </div>\n");
      out.write("     \t<table class=\"table table-hover\" style=\"float: right;\">\n");
      out.write("     \t\t<thead>\n");
      out.write("\t\t\t<tr>\n");
      out.write("                                <th>#</th>\n");
      out.write("\t\t\t        <th>Complaint_ID</th>\n");
      out.write("\t\t\t\t<th>Stu_ID</th>\n");
      out.write("                                <th>Phone</th>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<th>Course</th>\n");
      out.write("                                <th>Subject</th>\n");
      out.write("                               \n");
      out.write("\t\t\t\t<th>Date</th>\n");
      out.write("\t\t\t</tr>\n");
      out.write("                </thead>\n");
      out.write("                        ");
   
                           try{
                        
           // out.print(com)
                    MyDB db=new MyDB();
                    Connection con=db.getCon();
                    int n=0;
                        
             Statement stmt=con.createStatement();
             ResultSet rs1=stmt.executeQuery("select Com_id,Stu_id,Cont,Dept,Course,Com_sub,Com_date from complainttable where Dept='"+com+"' order by S_no desc ;" );
             while( rs1.next()){
                 n++;
                 String num=Integer.toString(n);
                 String comId = (String) rs1.getString("Com_id");
                 String id = rs1.getString("Stu_id");
                 String contact = (String) rs1.getString("Cont");
                
                   String comD = rs1.getString("Com_date");
                    String comS = rs1.getString("Com_sub");
                     String course = rs1.getString("Course");
                
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("                            <tr>\n");
      out.write("                                <td><strong>");
out.print(num);
      out.write("</strong></td>\n");
      out.write("                                <td>");
out.print(comId);
      out.write("</td>\n");
      out.write("                                <td>");
out.print(id);
      out.write("</td>\n");
      out.write("                                <td>");
out.print(contact);
      out.write("</td>\n");
      out.write("                               \n");
      out.write("                                <td>");
out.print(course);
      out.write("</td>\n");
      out.write("                                <td>");
out.print(comS);
      out.write("</td>\n");
      out.write("                                <td>");
out.print(comD);
      out.write("</td>\n");
      out.write("                             \n");
      out.write("                               <td><a href=\"view.jsp?com=");
out.print(comId);
      out.write("\">View</a></td>\n");
      out.write("                                <td><a href=\"reply.jsp?com=");
out.print(comId);
      out.write("\">Reply</a></td>\n");
      out.write("                            </tr>");

           
          }
        
        }catch(Exception e){}
        
        
        
      out.write("\n");
      out.write("        </table>\t\t\n");
      out.write("                        \n");
      out.write("   </div>             \t\t\n");
      out.write("</div>\n");
      out.write("\t\t\n");
      out.write("<br>\n");
      out.write("<br><br><br><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html \n");
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