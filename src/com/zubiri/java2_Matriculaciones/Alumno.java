package com.zubiri.java2_Matriculaciones;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.zubiri.java2_Matriculaciones.Matricula;

public class Alumno extends Persona {
		//Año en el que se inscribió por primera vez en alguna asignatura
		int anoInscripcion = -1;
		//Ciclo que cursa el alumno
		String ciclo = null;
		//Matrículas realizadas a lo largo de los años en las distintas asignaturas
		ArrayList<Matricula> matriculas = null;
		
		//Constructor 1
		public Alumno(String dni, String nombre, String apellido, int anoInscripcion, String ciclo, ArrayList<Matricula> matriculas){
			super(dni,nombre,apellido);
			this.anoInscripcion = anoInscripcion;
			this.ciclo = ciclo;
			this.matriculas = matriculas;
			Alumnos.alumnos.add(this);
		}
		
		//Constructor 2
		public Alumno(Scanner sc){
			super(sc);
			System.out.println("Introduce el año de la primera inscripción: ");
			do{
				try{
					this.setAnoInscripcion(sc.nextInt());
				}catch(InputMismatchException e){
					System.out.println("Eso no es un número...");
					this.setAnoInscripcion(sc.nextInt());
				}
			}while(this.getAnoInscripcion() == -1);
			
			System.out.println("Introduce el nombre del ciclo: ");
			this.setCiclo(sc.next());
			this.setMatriculas(Matriculas.crearMatriculas(sc, this.getMatriculas()));
			Alumnos.alumnos.add(this);
			
		}
		
		//String formateado de Alumno
		@Override
		public String formatted(){
			String alumnoFormateado =
					super.formatted() +
					"Año de primera inscripción: \t" + this.getAnoInscripcion() +
					"\nNombre del ciclo: \t" + this.getCiclo();
			return alumnoFormateado;
		}
		
		//Método split sobreescrito
		@Override
		public void split(String strPersona, char separator){
			if (strPersona == null) {
				System.err.println("No se han pasado datos...");
			}else {
				super.split(strPersona, separator);
				String separador = "";
				separador += separator;
				String[] parametros = strPersona.split(separador);
				int ano = Integer.parseInt(parametros[3]);
				this.setAnoInscripcion(ano);
				this.setCiclo(parametros[4]);
				Alumnos.alumnos.add(this);
			}
		}
		
		
		//Getters y setters
		public int getAnoInscripcion() {
			return anoInscripcion;
		}
		
		public void setAnoInscripcion(int anoInscripcion) {
			this.anoInscripcion = anoInscripcion;
		}
		
		public ArrayList<Matricula> getMatriculas() {
			return matriculas;
		}
		
		public void setMatriculas(ArrayList<Matricula> matriculas) {
			this.matriculas = matriculas;
		}
		
		public String getCiclo() {
			return ciclo;
		}

		public void setCiclo(String ciclo) {
			this.ciclo = ciclo;
		}
}
