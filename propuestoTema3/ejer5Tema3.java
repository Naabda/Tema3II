/**
 * @author David Abellán Navarro
 * @author Juan Carlos Corredor Sánchez
 * @course 2º D.A.M.
 * @date 25/10/2021
 * @github https://github.com/Naabda/Tema3II
 * 
 */
package propuestoTema3;

import java.util.ArrayList;

public class ejer5Tema3 {

	public static void main(String[] args) {
		ArrayList <Empleado> listadoEmpleadosAProyecto;
//		Proyecto proy = new Proyecto(188);
		Proyecto proy = new Proyecto(198);
		listadoEmpleadosAProyecto = proy.getListAsigEmpleados();
		
		if (listadoEmpleadosAProyecto.isEmpty()) {
			System.out.println("No hay empleados asignados al proyecto " + proy.getNum_proy() + " son:");
		} else {
			System.out.println("Los empleados asignados al proyecto " + proy.getNum_proy());
			for (Empleado empleado : listadoEmpleadosAProyecto) {
				System.out.println("DNI: " + empleado.getDni_nif() + " Nombre: " + empleado.getNombre());
			}
		}
	}
}
