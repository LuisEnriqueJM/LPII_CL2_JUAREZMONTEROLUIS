<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#c5dec9">
	<h1 align="center"> Registrar Proveedor</h1>
	<form method="post" action="ControladorProveedor">	
		<table align="center" border="2">
			<tr>
				<td>Proveedor</td>
				<td><input type="text" name="nomproveecl2"></td>
			</tr>
			<tr>
				<td>RUC</td>
				<td><input type="text" name="rucproveecl2"></td>
			</tr>
			<tr>
				<td>Razon_Social</td>
				<td><input type="text" name="rsocialproveecl2"></td>
			</tr>		
			<tr>
				<td>E-mail</td>
				<td><input type="text" name="emailproveecl2 "></td>
			</tr>
			<tr>
				<td>Fecha_Ingreso</td>
				<td><input type="text" name="feingproveecl2 "></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="registrar">
				</td>
			</tr>
		</table>
	</form>	
</body>
</html>