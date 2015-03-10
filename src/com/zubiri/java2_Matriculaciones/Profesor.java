package com.zubiri.java2_Matriculaciones;

import java.util.Scanner;

public class Profesor extends Persona {
	String titulacion;
	String departamento;
	
	//Constructor 1
	public Profesor(String dni, String nombre, String apellido, String titulacion, String departamento){
		super(dni,nombre,apellido);
		this.titulacion = titulacion;
		this.departamento = departamento;
		Profesores.profesores.add(this);
	}
	
	//Constructor 2
	public Profesor(Scanner sc){
		super(sc);
		System.out.println("Introduce la titulación del profesor: ");
		this.setTitulacion(sc.next());
		System.out.println("Introduce el nombre del departamento: ");
		this.setDepartamento(sc.next());
		Profesores.profesores.add(this);
	}
	
	//String formateado de Profesor sobreescribiendo el método formatted de Persona
	@Override
	public String formatted(){
		String profesorFormateado =
				super.formatted() +
				"Titulación: \t" + this.getTitulacion() + 
				"\nDepartamento: \t" + this.getDepartamento();
		return profesorFormateado;
	}
	
	//Método sobreescito split
	@Override
	public void split(String strProfesor, char separator){
		if (strProfesor == null) {
			System.err.println("No hay datos....");
		}else {
			String separador = "";
			separador += separator;
			String[] parametros = strProfesor.split(separador);
			super.split(strProfesor, separator);
			this.setTitulacion(parametros[3]);
			this.setDepartamento(parametros[4]);
			Profesores.profesores.add(this);
		}
	}
	
	
	//Getters y setters
	public String getTitulacion() {
		return titulacion;
	}
	
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
}
