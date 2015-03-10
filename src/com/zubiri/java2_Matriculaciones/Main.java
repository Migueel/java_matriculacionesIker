package com.zubiri.java2_Matriculaciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Matricula> matriculasPasadas = new ArrayList<Matricula>();
		ArrayList<Matricula> matriculasAlumno = new ArrayList<Matricula>();
		String nombre;
		int opcion = 0;
		
		
		System.out.println("\tMENU");
		System.out.println("=========================");
		System.out.println("Guardar profesores------1");
		System.out.println("Guardar matriculas------2");
		System.out.println("Guardar alumnos---------3");
		System.out.println("Visualizar profesores---4");
		System.out.println("Visualizar matriculas---5");
		System.out.println("Visualizar alumnos------6");
		System.out.println("Borrar alumno-----------7");
		System.out.println("Borrar profesor---------8");
		System.out.println("Salir-------------------0");
		opcion = sc.nextInt();
		
		while(opcion != 0){
			switch (opcion) {
				
				case 1:
					Profesores.crearProfesores(sc);			
					break;
				
				case 2:
					Matriculas.crearMatriculas(sc, matriculasAlumno);
					break;
					
				case 3:
					Alumnos.crearAlumnos(sc);
					break;
					
				case 4:
					System.out.println(Profesores.formattedProfesores());
					break;
					
				case 5:
					System.out.println(Matriculas.formattedMatriculas(matriculasPasadas));
					break;
					
				case 6:
					System.out.println(Alumnos.formattedAlumnos());
					break;
					
				case 7:
					System.out.println("Introduce el nombre del alumno que quieres borrar");
					nombre = sc.next();
					Alumnos.borraAlumno(nombre);
					break;
				
				case 8:
					System.out.println("Introduce el nombre del profesor que quieres borrar");
					nombre = sc.next();
					Profesores.borraProfesor(nombre);
					break;
				
				case 9:
					System.out.println("Introduce el nombre de la matricula que quieres borrar");
					nombre = sc.next();
					Matriculas.borraMatricula(nombre);
					break;
				
				default:
					System.out.println("Introduce una opcion válida");
					break;
			}
			
			System.out.println("\tMENU");
			System.out.println("*****************");
			System.out.println("Guardar profesores------1");
			System.out.println("Guardar matriculas------2");
			System.out.println("Guardar alumnos---------3");
			System.out.println("Visualizar profesores---4");
			System.out.println("Visualizar matriculas---5");
			System.out.println("Visualizar alumnos------6");
			System.out.println("Borrar alumno-----------7");
			System.out.println("Borrar profesor---------8");
			System.out.println("Salir-------------------0");
			opcion = sc.nextInt();
		}
	}

}
