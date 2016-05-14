package es.unileon.prg1.mastermind;

import java.util.Random;

public class Combinacion {
	private int longitud;
	private boolean repetidos;
	private char combinacionCifrada[];
	
	public Combinacion (int longitud, boolean repetidos){
		this.longitud=longitud;
		this.repetidos=repetidos;
		this.combinacionCifrada=new char[longitud];
	}

	//getter
	public char[] getCombinacionCifrada() {
		return combinacionCifrada;
	}

	public void generarCombinacion(){
		if(repetidos)
			generarCombinacionRep();
		else
			generarCombinacionSinRep();
	}
	
	public void generarCombinacionRep(){
		//generar numero aleatorio
		Random randomNumber = new Random();
		randomNumber.setSeed(System.currentTimeMillis());
		for(int i=0; i<longitud; i++){
			int numeroAleatorio=randomNumber.nextInt(6);
			char color= '0';
			switch (numeroAleatorio){
				case 0: 
				color='R'; break;
				case 1: 
				color='G'; break;
				case 2: 
				color='Y'; break;
				case 3: 
				color='B'; break;
				case 4: 
				color='P'; break;
				case 5: 
				color='C'; break;
			}
		combinacionCifrada[i]=color;
		}
	}
	
	public void escribirCombinacion(){
		for (int i=0; i<combinacionCifrada.length;i++){
			System.out.print(combinacionCifrada[i]);
		}
		System.out.println();
	}
	private void generarCombinacionSinRep(){
		Random randomNumer=new Random();
		randomNumer.setSeed(System.currentTimeMillis());
		int contador=0;
		
		while(contador<combinacionCifrada.length){
			int numeroAleatorio=randomNumer.nextInt(6);
			char color='-';
			switch(numeroAleatorio){
			case 0: 
				color='R'; break;
				case 1: 
				color='G'; break;
				case 2: 
				color='Y'; break;
				case 3: 
				color='B'; break;
				case 4: 
				color='P'; break;
				case 5: 
				color='C'; break;
				
				default:
					System.out.println("No deberia llegar aqui");
					break;
			}
		boolean colorRepetido=buscoColor(color);
			if(colorRepetido==false){
				combinacionCifrada[contador]=color;
				contador++;
			}
		}
	}
	
	private boolean buscoColor(char color){
		for(int i =0;i<longitud;i++){
			if(combinacionCifrada[i]==color){
				return true;
			}
		}
		return false;
	}
}
	
