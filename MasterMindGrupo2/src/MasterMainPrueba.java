
public class MasterMainPrueba {
	private char[] prueboCombinacion;
	boolean esSolucion;
	//constructor
	public MasterMain(String combinacionDePrueba){
		//toCharArray() pasa de un String a vector de char
		this.prueboCombinacion=combinacionDePrueba.toCharArray();
		this.esSolucion=false;
	}
	
	public void juego(char [] combinacionCifrada, Tablero oTablero, int numeroIntentos){
		oTablero.modificoTablero(numeroIntentos, prueboCombinacion);
		
		char [] combinacionSolucion=new char [combinacionCifrada.length];
		char [] combinacionClonada=combinacionCifrada.clone();
		for (int i=0;i<combinacionCifrada.length; i++){
			combinacionSolucion[i]='-';
		}
		int contador =0;
		//Para probar mismo color y posicion
		for (int i=0;i<combinacionCifrada.length; i++){
			for (int j=0;j<prueboCombinacion.length;j++){
				if ((combinacionClonada[i]==prueboCombinacion[j]) && (i==j)){
				combinacionSolucion[contador]='0';
				combinacionClonada [j]='*';
				prueboCombinacion[j]='z';
				contador++;
				}
			}
		}
			
	//Para probar el color
	for (int i=0;i<combinacionCifrada.length; i++){
		for (int j=0;j<prueboCombinacion.length;j++){
			if ((combinacionClonada[i]==prueboCombinacion[j]) && (i!=j)){
				combinacionSolucion[contador]='X';
				combinacionClonada[j]='*';
				prueboCombinacion[j]='z';
				contador++;
			}
		}
	}
			oTablero.modificoTableroRdo(numeroIntentos, combinacionSolucion);
			comprueboSolucion(combinacionSolucion);
			oTablero.imprimirTablero();
}
private void comprueboSolucion(char [] combinacionSolucion){
	int contador=0;
	for (int i=0;i<combinacionSolucion.length; i++){
		if (combinacionSolucion[i]=='0'){
			contador++;
		}
	}
	if (contador==combinacionSolucion.length){
		System.out.println("HAS GANADO");
		System.exit(0);
	}

}		

}
