package Controlador;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DaoImp.ClassProveedorImp;
import model.TblProveedorcl2;


public class ControladorProveedor extends HttpServlet {
	//variables
	private static final long serialVersionUID = 1L;
       
	
	//constructor
    public ControladorProveedor() {
        super();
    }

    
    //funciones
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//instanciamos la respectiva clase
		ClassProveedorImp crudimp = new ClassProveedorImp();
		//A�ADIMOS
		TblProveedorcl2 tblprov = new TblProveedorcl2(); 
		//recuperamos el listado de proveedores de la BD
		List<TblProveedorcl2> listadoproveedores =  crudimp.ListadoProveedor();
		//enviamos a la vista
		request.setAttribute("listado", listadoproveedores);
		
		
		//CONTINUAMOS
		//recibimos el valor segun accion		
		String accion = request.getParameter("accion");
		if(accion!=null){
			switch(accion){
			case "Modificar":
				int cod = Integer.parseInt(request.getParameter("cod"));
				//asignamos los valores
				tblprov.setIdprooveedorcl2(cod);
				//buscamos el codigo a actualziar
				TblProveedorcl2 prov = crudimp.BuscarProveedor(tblprov);
				SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
				
				//asignamos los valores
				request.setAttribute("Idprooveedorcl2", prov.getIdprooveedorcl2());
				request.setAttribute("Nomproveecl2", prov.getNomproveecl2());
				request.setAttribute("Rucproveecl2", prov.getRucproveecl2());
				request.setAttribute("Rsocialproveecl2", prov.getRsocialproveecl2());
				request.setAttribute("Emailproveecl2", prov.getEmailproveecl2() );
				request.setAttribute("Feingproveecl2", format.format(prov.getFeingproveecl2()));
				//redireccionamos
				request.getRequestDispatcher("/FrmActualizarProveedor.jsp").forward(request, response);
				
				break;
			case "Registrar":
				//redireccionamos hacia la vista jsp
				request.getRequestDispatcher("/FrmRegistrarProveedor.jsp").forward(request, response);
				break;
			case "Eliminar":
				int codelim = Integer.parseInt(request.getParameter("cod"));
				//asignamos los valores
				tblprov.setIdprooveedorcl2(codelim);
				//invocamos al metodo eliminar
				crudimp.EliminarProveedor(tblprov);
				List<TblProveedorcl2>listado=crudimp.ListadoProveedor();
				//enviamos a la vista
				request.setAttribute("listado", listado);
				//redireccionamos
				request.getRequestDispatcher("/FrmRegistrarProveedor.jsp").forward(request, response);				
				break;
			case "Listar":
				//redireccionamos hacia la vista *.jsp
				request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);
				break;				
			default:
				//System.out.println("Looking forward to the Weekend");
			}//fin switch
		}//fin if		
		
		
		//redireccionamos hacia la vista *.jsp
		//request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);		
	}//fin doGet

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//PROCEDEMOS A REGISTRAR
		
		//recuperamos los datos del formulario
		String Idprooveedorcl2 = request.getParameter("Idprooveedorcl2"); //A�ADIMOS	
		
		String Nomproveecl2 = request.getParameter("Nomproveecl2");
		String Rucproveecl2 = request.getParameter("Rucproveecl2");
		String Rsocialproveecl2 = request.getParameter("Rsocialproveecl2");
		String Emailproveecl2 = request.getParameter("Emailproveecl2");
		Date fecha = new Date();
		Date fechasql = new Date(fecha.getTime());
		
		//hacer las respectivas instancias
		TblProveedorcl2 tblprov = new TblProveedorcl2();
		ClassProveedorImp climp = new ClassProveedorImp();
		
		//asignamos los valores
		tblprov.setNomproveecl2(Nomproveecl2);
		tblprov.setRucproveecl2(Rucproveecl2);
		tblprov.setRsocialproveecl2(Rsocialproveecl2);
		tblprov.setEmailproveecl2(Emailproveecl2);
		tblprov.setFeingproveecl2(fechasql);
		
		//A�ADIMOS
		if (Idprooveedorcl2!=null){
			int cod = Integer.parseInt(Idprooveedorcl2);
			//luego asignamos el codigo a actualziar
			tblprov.setIdprooveedorcl2(cod);
			//invocamos el metodo a actualizar
			climp.ActualizarProveedor(tblprov);
		}else{
			//invocamos el metodo registrar
			climp.RegistrarProveedor(tblprov);
		}
		
		//invocamos el metodo registrar
		climp.RegistrarProveedor(tblprov);
		
		//actualizamos el listado
		List<TblProveedorcl2> listado = climp.ListadoProveedor();
		
		//enviamos hacia la vista
		request.setAttribute("listado", listado);
		
		//redireccionamos
		request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);

	}
}
