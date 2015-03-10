package com.zubiri.java2_Matriculaciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumnos {
	
	public static ArrayList<Persona> alumnos = new ArrayList<Persona>();
	
	//Método para crear alumnos
		public static void crearAlumnos(Scanner sc){
			System.out.println("Cuantos alumnos quieres crear: ");
			for (int i = 0; i < sc.nextInt(); i++){
				new Alumno(sc);
			}
		}
		
		//Método para mostrar Alumnos
		public static String formattedAlumnos(){
			String alumnosFormateados = "";
			for (int a = 0; a < alumnos.size(); a++) {
				alumnosFormateados += alumnos.get(a).formatted();
			}
			return alumnosFormateados;
		}
		
		//Borrar alumnos
		public static void borraAlumno(String nombre){
			for (int b = 0; b < alumnos.size(); b++) {
				if (alumnos.get(b).getNombre().equalsIgnoreCase(nombre)) {
					alumnos.remove(b);
				}
			}
		}

		public static ArrayList<Persona> getAlumnos() {
			return alumnos;
		}

		public static void setAlumnos(ArrayList<Persona> alumnos) {
			Alumnos.alumnos = alumnos;
		}
}
