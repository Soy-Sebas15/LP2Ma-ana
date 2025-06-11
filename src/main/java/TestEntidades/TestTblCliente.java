package TestEntidades;

import java.util.List;

import Dao.ClienteImp;
import Modelo.TblCliente;

public class TestTblCliente {
	public static void main(String[] args) {
		// realizamos la respectiva instancia...
		TblCliente cliente = new TblCliente();
		ClienteImp climp = new ClienteImp();
		// asignamos valores
		/*
		 * cliente.setNomCliente("Andy");
		 * cliente.setApeCliente("Munguia");
		 * cliente.setDniCliente("69260412");
		 * cliente.setEmailCliente("andyson@gmail.com");
		 * cliente.setSexCliente("m");
		 * cliente.setNacionCliente("peru");
		 * cliente.setTelfCliente("926012963");
		 */
		// invocamos al metodo

		/*
		 * climp.RegistrarCliente(cliente);
		 * 
		 * System.out.println("Se registró a " + cliente);
		 */

		// testeando la actualización

		// Actualizando el código 3

		/*
		 * cliente.setIdCliente(3);
		 * cliente.setNomCliente("Misael");
		 * cliente.setApeCliente("Cumapa");
		 * cliente.setDniCliente("896206124"); 
		 * cliente.setEmailCliente("cumapaelmapa@gmail.com");
		 * cliente.setSexCliente("m");
		 * cliente.setTelfCliente("987059169");
		 * cliente.setNacionCliente("peruano");
		 * //invocamos al actualizar
		 * climp.ActualizarCliente(cliente);
		 * System.out.println("Si se actualizó we");
		// testeando el eliminar
		 * cliente.setIdCliente(3);
		 * 
		 * climp.EliminarCliente(cliente);
		 * 
		 * System.out.println("se eliminó");
		 */
		// testear el buscadotado

		/*
		 * buscadot<TblCliente> buscadotado = climp.buscadotarCliente();
		 * for(TblCliente buscado:buscadotado)
		 * 
		 * { System.out.println("codigo" + buscado.getIdCliente()+" nombre " +
		 * buscado.getNomCliente() + " apellido " + buscado.getApeCliente() +
		 * " dni " + buscado.getDniCliente()
		 * 
		 * + " nacionalidad " + buscado.getNacionCliente() + " sexo " +
		 * buscado.getSexCliente() + " email " + buscado.getEmailCliente() +
		 * " telefono " + buscado.getTelfCliente());
		 * 
		 * }
		 */
		cliente.setIdcliente(2);
		
		TblCliente buscado = climp.BuscarCliente(cliente);
		System.out.println("codigo" + buscado.getIdcliente() + " nombre " + 
		buscado.getNomcliente() + " apellido "
		+ buscado.getApecliente() + " dni " + buscado.getDnicliente()
        + " nacionalidad " + buscado.getNacioncliente() + " sexo " + buscado.getSexcliente() 
        + " email "+ buscado.getEmailcliente() + " telefono " + buscado.getTelfcliente());
	}
}