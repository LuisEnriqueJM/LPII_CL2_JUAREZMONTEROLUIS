<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<%@page import="model.TblProveedorcl2"%>    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MENU PRINCIPAL</title>
</head>
<body bgcolor="#c5dec9">
	<h1 align="center"> Listado de Proveedores</h1>
	<h2 align="center">
		<a href="ControladorProveedor?accion=Registrar" style="text-decoration: none">Registrar Proveedor</a>
	</h2>	
	<table align="center" border="2">
		<tr>
			<td>codigo</td>
			<td>proveedor</td>
			<td>ruc</td>
			<td>razon_social</td>
			<td>email</td>
			<td>fecha</td>
			<td colspan="2">Acciones</td>
		</tr>
		<% 
		List<TblProveedorcl2> listadoproveedores = (List<TblProveedorcl2>)request.getAttribute("listado");
		if (listadoproveedores != null){
			for(TblProveedorcl2 prov:listadoproveedores){
				%>
					<tr>
						<td>
						<%= prov.getIdprooveedorcl2()%>
						</td>
						<td>
						<%= prov.getNomproveecl2()%>
						</td>						
						<td>
						<%= prov.getRucproveecl2()%>
						</td>				
						<td>
						<%= prov.getRsocialproveecl2()%>
						</td>				
						<td>
						<%= prov.getEmailproveecl2()%>
						</td>
						<td>
						<%= prov.getFeingproveecl2()%>
						</td>						
						<td><a href="ControladorProveedor?accion=Modificar?cod=<%=prov.getIdprooveedorcl2()%>"> ACTUALIZAR </a></td>
						<td>ELIMINAR</td>
					</tr>
				<% 						
			}//fin for
		}//fin if
		%>
	</table>
	
</body>

</html>
