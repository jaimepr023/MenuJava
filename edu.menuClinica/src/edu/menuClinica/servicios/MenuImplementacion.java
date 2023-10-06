package edu.menuClinica.servicios;

import java.util.Scanner;
/**
 * Implementacion de nuestro menu
 * @author jpr-061023
 */
public class MenuImplementacion implements MenuInterfaz {

	@Override
	public int mostrarMenuYSeleccion(Scanner comunicacionConTecladoM) {
		//Scanner comunicacionConTecladoM se puede definir aqui el parametro
		//aqui se obtieene una copia de comunicacionTeclado (su valor)
		
	int opcionSeleccionada;//Lo amarillo porque no se ha utilizado

		System.out.println("#################################");
		System.out.println("0.Cerrar la aplicacion");
		System.out.println("1.Registro del paciente");
		System.out.println("2.Ingreso del paciente");
		System.out.println("3.Alta del paciente");
		System.out.println("4.Resumen de ingresos y altas");
		System.out.println("5.Historial del paciente");
		System.out.println("#################################");
		System.out.println("Elija una opcion:");

		
		opcionSeleccionada = comunicacionConTecladoM.nextInt();
		// Los tipos string solo se pone el next
		return opcionSeleccionada;
	}



}
