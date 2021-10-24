package propuestoTema3;

import java.sql.Date;
import java.time.LocalDate;

public class ejer4Teme3 {

	public static void main(String[] args) {
		Empleado emp = new Empleado();
		String dni = "12345678X", nombre = "Comecocos";
		emp.setDni_nif(dni);
		emp.setNombre(nombre);
		emp.save();
		
		Proyecto proy = new Proyecto();
		String nom_proy = "proyecto comecocos";
		Date f_inicio =Date.valueOf(LocalDate.now().plusDays(15));
		proy.setNom_proy(nom_proy);
		proy.setF_inicio(f_inicio);
		proy.setDni_jefe_proy(dni);
//		proy.save();
		
		AsignacionEmpAProyecto aeap = new AsignacionEmpAProyecto();
		int num_proy = 198;
		aeap.setDni_nif_emp(dni);
		aeap.setNum_proy(num_proy);
		aeap.setF_inicio(f_inicio);
		aeap.save();
		
		emp.setNombre("Pep");
		emp.save();
		
		proy.setNum_proy(num_proy);
		proy.setNom_proy("Proyecto de Pep");
		proy.save();
	}
}
