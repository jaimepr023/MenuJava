package edu.menuClinica.controladores;

import java.util.Scanner;

import edu.menuClinica.servicios.MenuImplementacion;
import edu.menuClinica.servicios.MenuInterfaz;

/**
 * Clase por donde se empieza nuestra aplicacion 290923
 * 
 * @author jpr
 */
//autor sirve para que salga el nombre 
public class InicioAplicacion {
	/**
	 * Metodo principal de nuestra aplicacion Define el procedimiento, es de donde
	 * toda accion parte y a donde toda accion llega 290923
	 * 
	 * @author jpr
	 * @param args
	 */

	public static void main(String[] args) {
		int seleccionUsuario;
		boolean cerrarMenu = false;
		//scanner tmb es un tipo de variable 
		Scanner comunicacionConTeclado = new Scanner(System.in);//system in = lo que entra y el scanner lo escanea.
		// se trata del valor del objeto
		MenuInterfaz mi = new MenuImplementacion();
		
			while (!cerrarMenu) {
			
			seleccionUsuario = mi.mostrarMenuYSeleccion(comunicacionConTeclado);

			switch (seleccionUsuario) {
			case 0:
				System.out.println("[INFOS]-Se ejecuta caso 0");
				cerrarMenu = true;
				break;
			case 1:
				System.out.println("[INFOS]-Se ejecuta caso 1");
				break;
			case 2:
				System.out.println("[INFOS]-Se ejecuta caso 2");
				break;
			case 3:
				System.out.println("[INFOS]-Se ejecuta caso 3");
				break;
			case 4:
				System.out.println("[INFOS]-Se ejecuta caso 4");
				break;
			case 5:
				System.out.println("[INFOS]-Se ejecuta caso 5");
				break;
			default:
				System.out.println("[INFOS]-Se ejecuta caso default");
				break;

			}

		}

	}

}
