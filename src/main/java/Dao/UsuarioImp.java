package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsuario;
import Modelo.TblUsuario;


public class UsuarioImp implements IUsuario {

	public void RegistrarUsuario(TblUsuario usuario) {
		//nos conectamos con la U.P.
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAWebMiercoles");
		//administrar la transaccion
		EntityManager em=emf.createEntityManager();
		try{
			//iniciamos la transaccion..
			em.getTransaction().begin();
			//invocamos el metodo registrar...
			em.persist(usuario);
			//confirmamos
			em.getTransaction().commit();
		}catch(RuntimeException ex){
			ex.getMessage();
		}finally  {
			//cerramos
			em.close();
		} //fin del finally
		
	}  //fin del metodo registrar...

	public void ActualizarCliente(TblUsuario usuario) {
		// nos conectamos con la unidad de persistencia...
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAWebMiercoles");
	//administrar las transacciones
	EntityManager em=emf.createEntityManager();
	try{
		//iniciamos la transaccion
		em.getTransaction().begin();
		//invocamos el metodo actualizar
		em.merge(usuario);
		//confirmamos 
		em.getTransaction().commit();
	}catch(RuntimeException e){
		//enviamos un mensaje en caso de error
		System.out.println(e.getMessage());
	}finally{
		//cerramos
		em.close();
	} //fin del finally
		
	} //fin del metodo actualizar...

	public void EliminarCliente(TblUsuario usuario) {
		//nos conectamos con la u.p
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAWebMiercoles");
		//para administrar las transacciones
		EntityManager em=emf.createEntityManager();
		try{
			//iniciamos la transaccion
			em.getTransaction().begin();
			//recuperamos el codigo a eliminar...
			TblUsuario  codelim=em.find(TblUsuario.class,usuario.getIdpsuario());
			//aplicamos una condicion
			if(codelim!=null){
				//procedemos a eliminar
				em.remove(codelim);
				//confirmamos
				em.getTransaction().commit();
			}//fin de la condicion...
		}catch(RuntimeException e){
		System.out.println(e.getMessage());
		}finally{
			//cerramos
			em.close();
		} //fin del finally
		
	} //fin del metodo eliminar...

	public List<TblUsuario> ListarUsuario() {
		//nos conectamos con la u.p.
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAWebMiercoles");
		//para administrar las transacciones
		EntityManager em=emf.createEntityManager();
		//para el listado
		List<TblUsuario> listadoUsuario=null;
		try{
			//iniciamos la transaccion..
			em.getTransaction().begin();
			//hacemos la consulta JPQL
			listadoUsuario=em.createQuery("select c from TblUsuario c",TblUsuario.class).getResultList();
		     //confirmamos
			em.getTransaction().commit();
		
		}catch(RuntimeException e){
			System.out.println(e.getMessage());
		}finally{
			//cerramos
			em.close();
		}  //fin del finally
		//retornamos el listado
		return listadoUsuario;
	}  //fin del metodo listar....

	public TblUsuario BuscarCliente(TblUsuario usuario) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoJPAWebMiercoles");
		EntityManager em = emf.createEntityManager();
		TblUsuario buscado = null;
		try
		{
			em.getTransaction().begin();
			buscado = em.find(TblUsuario.class, usuario.getIdpsuario());
			em.getTransaction().commit();
		}
		catch (RuntimeException ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			em.close();
		}
		return buscado;
	}
} //fin de la clase...
	
	
	
	
	
	
	
	

