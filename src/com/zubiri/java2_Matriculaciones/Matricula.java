package com.zubiri.java2_Matriculaciones;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.zubiri.java2_Matriculaciones.Profesor;

public class Matricula extends Asignatura {
	int anoMatriculacion = -1;
    double precio = -1;
    
    //Constructor 1
    public Matricula(String nombre, int creditos, Profesor profesor, int anoMatriculacion, double precio){
    	super(nombre,creditos,profesor);
    	this.anoMatriculacion = anoMatriculacion;
    	this.precio = precio;
    }
	
    //Constructor 2
    public Matricula(Scanner sc){
    	super(sc);
    	System.out.println("Introduce el año de matriculación: ");
    	do{
    		try{
    			this.setAnoMatriculacion(sc.nextInt());
    		}catch(InputMismatchException e){
    			System.err.println("Eso no es un número...");
    			this.setAnoMatriculacion(sc.nextInt());
    		}
    	}while(this.getAnoMatriculacion() == -1);
    	System.out.println("Introduce el precio: ");
    	do{
    		try{
    			this.setPrecio(sc.nextDouble());
    		}catch(InputMismatchException e){
    			System.err.println("Eso no es un número...");
    			this.setPrecio(sc.nextDouble());
    		}
    	}while(this.getPrecio() == -1);
    	Matriculas.matriculas.add(this);
    	Matriculas.contarMatricula();
    }
    
    //String formateado Matricula
    @Override
    public String formatted(){
    	String matriculaFormateada =
    			super.formatted() + 
    			"Año matriculación: \t" + this.getAnoMatriculacion() + 
    			"\nPrecio: \t" + this.getPrecio();
    	return matriculaFormateada;
    }
    
    //Método sobreescrito split
    public void split(String strMatricula, char separator){
    	super.split(strMatricula, separator);
    	String separador = "";
		separador += separator;
		String[] parametros = strMatricula.split(separador);
    	int ano = Integer.parseInt(parametros[3]);
    	this.setAnoMatriculacion(ano);
    	int precio = Integer.parseInt(parametros[4]);
    	this.setPrecio(precio);
    	Matriculas.matriculas.add(this);
    }
    
    /**
	 * M�todo que calcula un descuento basado en porcentaje sobre el precio original
	 * de la matr�cula.
	 * @return
	 */
	public double descuentoFamiliaNumerosa(int porcentaje) {
		Double resultado = 0.0;
		if (this.getPrecio() == -1) {
			System.out.println("No hay precio establecido...");
		}else{
			resultado = this.getPrecio() - (this.getPrecio()*(porcentaje/100));		
		}
		return resultado;
	}
    
    //Getters y setters
	public int getAnoMatriculacion() {
		return anoMatriculacion;
	}
	
	public void setAnoMatriculacion(int anoMatriculacion) {
		this.anoMatriculacion = anoMatriculacion;
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
