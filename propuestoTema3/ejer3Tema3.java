/**
 * @author David Abell�n Navarro
 * @author Juan Carlos Corredor S�nchez
 * @course 2� D.A.M.
 * @date 20/10/2021
 * @github https://github.com/Naabda/null
 * 
 */
package propuestoTema3;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;

public class ejer3Tema3 {

	public static void main(String[] args) {
		String dni = "28772442P", nombre = "Pepe", proyecto = "Manhatan1";
		Date inicio = Date.valueOf(LocalDate.now().plusDays(30)), fin = Date.valueOf(LocalDate.now().plusYears(2));
		int id = 188;
		
		try {
//			if (GestorProyectos.nuevoEmpleado(dni, nombre)) {
//				System.out.println("Insertado correctamente");
//			} else {
//				System.out.println("Hay problemas t�cnicos");
//			}
			
			System.out.println("Su proyecto es el n�mero: " + 
					GestorProyectos.nuevoProyecto(proyecto, inicio, fin, dni));
			
			
//			if (GestorProyectos.asignaEmpAProyecto(dni, id)) {
//				System.out.println("Insertado correctamente");
//			} else {
//				System.out.println("Hay problemas t�cnicos");
//			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}