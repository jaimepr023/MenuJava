package edu.menuClinica.servicios;

import java.util.Scanner;

//cabecera de los metodos
/**
 * Interfaz que enumera los metodos de la funcion del menu
 *@author jpr-021023 
 */

public interface MenuInterfaz {
	
	/**
	 * Mostrar el menu al usuario y que recoja la opcion
	 * @author jpr-021023
	 * @return el numero de la accion que selecciona el usuario
	 */
	public int mostrarMenuYSeleccion(Scanner comunicacionConTecladoM);
	

}
