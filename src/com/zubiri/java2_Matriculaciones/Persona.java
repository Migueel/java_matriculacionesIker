package com.zubiri.java2_Matriculaciones;

import java.util.Scanner;

public abstract class Persona {
	String dni;
	String nombre;
	String apellido;
	
	//Constructor 1
	public Persona(){}
	
	//Constructor 2
	public Persona(String dni, String nombre, String apellido){
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	//Constructor 3
	public Persona(Scanner sc){
		System.out.println("\nIntroduce el DNI: ");
		this.setDni(sc.next());
		System.out.println("Introduce el nombre: ");
		this.setNombre(sc.next());
		System.out.println("Introduce el apellido: ");
		this.setApellido(sc.next());
	}
	
	/**
	 * M�todo que retorna un String con los valores de las propiedades
	 * formateados del siguiente modo:
	 *  <NOMBRE_PROPIEDAD1> : <VALOR_PROPIEDAD1>\n
	 *  <NOMBRE_PROPIEDAD2> : <VALOR_PROPIEDAD2>\n 
	 *  .....
	 * @return String
	 */
	
	public String formatted() {
		String personaFormateada =
				"\nDNI: \t" + this.getDni() +
				"\nNombre: \t" + this.getNombre() +
				"\nApellido: \t" + this.getApellido() +
				"\n";
		return personaFormateada;
	}
	
	/**
	 * M�todo que obtiene valores de una persona a partir de un String y 
	 * un caracter separador.
	 */
	public void split(String personaStr, char separator) {
		if (personaStr == null) {
			System.out.println("No has pasado dato alguno...");
		}else{
			String separador = "";
			separador += separator;
			String[] parametros = personaStr.split(separador);
			this.setDni(parametros[0]);
			this.setNombre(parametros[1]);
			this.setApellido(parametros[2]);
		}
	}
	
	//Getters y setters
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
