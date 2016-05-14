package es.unileon.prg1.mastermind;

import java.util.Scanner;

public class Teclado {
	
	private String pruebaCombinacion;
	//Constructor
	public Teclado ( int longitud){
		Scanner leo=new Scanner(System.in);
		pruebaCombinacion=leo.next().toUpperCase();
		comprueboLectura(longitud);
		//leo.close();//cerrar el escaner
	}
	//Get
	public String getPruebaCombinacion() {
		return pruebaCombinacion;
	}
	
	private void comprueboLectura (int longitud){
		if(pruebaCombinacion.equalsIgnoreCase("salir")){
			System.out.println("Has elegido salir");
			System.exit(0);
		}
		
		if(longitud!=pruebaCombinacion.length()){
			System.out.println("Longitud incorrecta");
			System.exit(0);
		}
		
		for (int i=0;i<longitud;i++){
			char letra=pruebaCombinacion.charAt(i);
			boolean comprobacionCaracter=(letra=='R' || letra=='G' || letra=='Y' || letra=='B'|| letra=='P'|| letra=='C');
			if (!comprobacionCaracter){
				System.out.println("Los caracteres introducidos no son validos");
				System.exit(0);
			}
		}
	}
}
