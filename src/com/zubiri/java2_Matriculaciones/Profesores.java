package com.zubiri.java2_Matriculaciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Profesores {
	
	public static ArrayList<Persona> profesores = new ArrayList<Persona>();
	
	//Método para crear profesores
		public static void crearProfesores(Scanner sc){
			System.out.println("Cuantos profesores quieres crear: ");
			for (int e = 0; e < sc.nextInt(); e++){
				new Profesor(sc);
			}
		}
		
		//Método para devolver profesores formateados
		public static String formattedProfesores(){
			String profesoresFormateados = "";
			for (int a = 0; a < profesores.size(); a++) {
				profesoresFormateados += profesores.get(a).formatted();
			}
			return profesoresFormateados;
		}
		
		//Borrar profesores
		public static void borraProfesor(String nombre){
			for (int b = 0; b < profesores.size(); b++) {
				if (profesores.get(b).getNombre().equalsIgnoreCase(nombre)) {
					profesores.remove(b);
				}
			}
		}

		public static ArrayList<Persona> getProfesores() {
			return profesores;
		}

		public static void setProfesores(ArrayList<Persona> profesores) {
			Profesores.profesores = profesores;
		}
}
