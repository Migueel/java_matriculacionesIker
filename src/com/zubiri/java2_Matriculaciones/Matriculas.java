package com.zubiri.java2_Matriculaciones;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Matriculas {
	
	//Contador de matrículas
	public static int numeroMatriculas = 0;
	//ArrayList de Matricula para guardar las matrículas totales
	public static ArrayList<Matricula> matriculas = new ArrayList<Matricula>();
	
	//Crear matriculas en ArrayList pasado para devolver lleno al Alumno
	public static ArrayList<Matricula> crearMatriculas(Scanner sc, ArrayList<Matricula> matriculasAlumno){
		System.out.println("En cuantas asignaturas quieres matricular al alumno: ");
		try{
			int opcion = sc.nextInt();
			for (int i = 0; i < opcion; i++) {
				matriculasAlumno.add(new Matricula(sc));
			}
		}catch(InputMismatchException e){
			System.out.println("Eso no es un número...");
			System.out.println(e);
		}
		return matriculasAlumno;
	}
	
	//Borrar matrículas
	public static void borraMatricula(String nombre){
		for (int b = 0; b < matriculas.size(); b++) {
			if (matriculas.get(b).getNombre().equalsIgnoreCase(nombre)) {
				matriculas.remove(b);
			}
		}
	}
	
	//Devolver String con las Matriculas formateadas
	public static String formattedMatriculas(ArrayList<Matricula> matriculasPasadas){
		String matriculasFormateadas = "";
		for(int m = 0; m < matriculasPasadas.size(); m++){
			matriculasFormateadas += matriculasPasadas.get(m).formatted();
		}
		return matriculasFormateadas;
	}
	
	//Método contador
	public static void contarMatricula(){
		numeroMatriculas++;
	}
	
	//Getters y setters
	public static int getNumeroMatriculas(){
		return numeroMatriculas;
	}
	
	public static void setNumeroMatriculas(int numero){
		numeroMatriculas = numero;
	}

	public static ArrayList<Matricula> getMatriculas() {
		return matriculas;
	}

	public static void setMatriculas(ArrayList<Matricula> matriculas) {
		Matriculas.matriculas = matriculas;
	}
}
