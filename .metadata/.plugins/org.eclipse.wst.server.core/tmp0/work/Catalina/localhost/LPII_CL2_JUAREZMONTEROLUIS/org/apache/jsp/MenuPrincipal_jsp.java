/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.1
 * Generated at: 2025-02-09 09:37:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import model.TblProveedorcl2;

public final class MenuPrincipal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>MENU PRINCIPAL</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#c5dec9\">\r\n");
      out.write("\t<h1 align=\"center\"> Listado de Proveedores</h1>\r\n");
      out.write("\t<h2 align=\"center\">\r\n");
      out.write("\t\t<a href=\"ControladorProveedor?accion=Registrar\" style=\"text-decoration: none\">Registrar Proveedor</a>\r\n");
      out.write("\t</h2>\t\r\n");
      out.write("\t<table align=\"center\" border=\"2\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>codigo</td>\r\n");
      out.write("\t\t\t<td>proveedor</td>\r\n");
      out.write("\t\t\t<td>ruc</td>\r\n");
      out.write("\t\t\t<td>razon_social</td>\r\n");
      out.write("\t\t\t<td>email</td>\r\n");
      out.write("\t\t\t<td>fecha</td>\r\n");
      out.write("\t\t\t<td colspan=\"2\">Acciones</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");
 
		List<TblProveedorcl2> listadoproveedores = (List<TblProveedorcl2>)request.getAttribute("listado");
		if (listadoproveedores != null){
			for(TblProveedorcl2 prov:listadoproveedores){
				
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t");
      out.print( prov.getIdprooveedorcl2 ());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t");
      out.print( prov.getNomproveecl2 ());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t");
      out.print( prov.getRucproveecl2());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t");
      out.print( prov.getRsocialproveecl2());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t");
      out.print( prov.getEmailproveecl2());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t");
      out.print( prov.getFeingproveecl2());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<td><a href=\"ControladorProveedor?accion=Modificar?cod=");
      out.print(prov.getIdprooveedorcl2());
      out.write("\"> ACTUALIZAR </a></td>\r\n");
      out.write("\t\t\t\t\t\t<td>ELIMINAR</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");
 						
			}//fin for
		}//fin if
		
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
