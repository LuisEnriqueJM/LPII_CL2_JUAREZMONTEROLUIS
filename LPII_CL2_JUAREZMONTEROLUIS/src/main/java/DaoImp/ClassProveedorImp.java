package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProveedor;
import model.TblProveedorcl2;


public class ClassProveedorImp implements IProveedor {

	@Override
	public void RegistrarProveedor(TblProveedorcl2 tblproveedor) {
		//establecer conexion con la unidad de persistencia
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_JUAREZMONTEROLUIS");	
		EntityManager em = emf.createEntityManager();

		try{
			em.getTransaction().begin();
			em.persist(tblproveedor);
			System.out.println("PROVEEDOR registrado en BD correctamente");
			em.getTransaction().commit();
		}catch(RuntimeException e){
			e.getMessage();
		}finally{
			em.close();
		}		
	}//fin RegistrarProveedor

	
	@Override
	public void ActualizarProveedor(TblProveedorcl2 tblproveedor) {
		//establecer conexion con la unidad de persistencia
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_JUAREZMONTEROLUIS");	
		EntityManager em = emf.createEntityManager();
	
		try{
			em.getTransaction().begin();
			em.merge(tblproveedor);
			System.out.println("PROVEEDOR actualizado en BD correctamente");
			em.getTransaction().commit();
		}catch(RuntimeException e){
			e.getMessage();
		}finally{
			em.close();
		}	
		
	}//fin ActualizarProveedor

	
	@Override
	public void EliminarProveedor(TblProveedorcl2 tblproveedor) {
		// TODO Auto-generated method stub
		
	}// EliminarProveedor

	
	@Override
	public List<TblProveedorcl2> ListadoProveedor() {
		//establecer conexion con la unidad de persistencia
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_JUAREZMONTEROLUIS");	
		EntityManager em = emf.createEntityManager();
		
		
		List<TblProveedorcl2>listadoproveedores = null;
		try{
			em.getTransaction().begin();
			listadoproveedores = em.createQuery("select p from TblProveedorcl2 p", TblProveedorcl2.class).getResultList();
			em.getTransaction().commit();
		}catch(RuntimeException e){
			e.getMessage();
		}finally{
			em.close();	
		}		
		
		return listadoproveedores;
	}//fin ListadoProveedor

	
	@Override
	public TblProveedorcl2 BuscarProveedor(TblProveedorcl2 tblproveedor) {
		//establecer conexion con la unidad de persistencia
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoEAJPAMaven2025");	
		EntityManager em = emf.createEntityManager();
		
		TblProveedorcl2 tblprov = null;
		try{
		em.getTransaction().begin();
		tblprov = em.find(TblProveedorcl2.class, tblproveedor.getIdprooveedorcl2());
		em.getTransaction().commit();
		}catch(RuntimeException e){
			e.getMessage();
		}finally{
			em.close();	
		}
		
		return tblprov;
	}//fin BuscarProveedor

}
