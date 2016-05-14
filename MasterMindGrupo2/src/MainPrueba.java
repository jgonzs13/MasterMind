public class MainPrueba {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int longitudCombinacion, numeroIntentos;
        boolean coloresRepetidos;
        //primer argumento
 longitudCombinacion=leerPrimerArgumento(args[0]);
        //si llego aqui es porque la lectura del primer argumento es correcta
        System.out.println(longitudCombinacion);
        //segundo argumento
        numeroIntentos = leerSegundoArgumento(args[1]);
        //si llego aqui es porque la lectura del segundo argumento es correcta
        System.out.println(numeroIntentos);
        //tercer argumento
 coloresRepetidos=leerTercerArgumento(args[2]);
        System.out.println(coloresRepetidos);
      //Llamar a la clase Combinacion
        Combinacion oCombinacion=new Combinacion (longitudCombinacion, coloresRepetidos);
    	oCombinacion.generarCombinacion();
    	//oCombinacion.escribirCombinacion();
    	
    	Tablero oTablero=new Tablero(numeroIntentos, longitudCombinacion);
    	//oTablero.inicializarTablero();
    	oTablero.imprimirTablero();
    	
    	for(int i=numeroIntentos-1;i>=0;i--){
    		//leer respuesta usuario
        	Teclado oTeclado=new Teclado(longitudCombinacion);
        	//Tengo la lectura en oTeclado.getPruebaCombinacion()
        	//Es un String
        	MasterMain oMasterMain=new MasterMain(oTeclado.getPruebaCombinacion());
        	oMasterMain.juego(oCombinacion.getCombinacionCifrada(), oTablero, i);
        	if (i==0){
        		System.out.println("No hay mas intentos");
        		System.exit(0);
        	}
        }
    	oTablero.imprimirTablero();
    }//Fin Main
	
	 private static int leerPrimerArgumento(String args) {
         int longitud=0;
         try{
         longitud =Integer.parseInt(args);
         }catch(NumberFormatException e){
                System.out.println("el primer argumento debe de ser un numero");
                System.exit(0);
         }
         if (longitud<1){
                System.out.println("el primer argumento debe de ser un numero mayor que cero");
                System.exit(0);
         }
         return longitud;
  }



private static int leerSegundoArgumento(String args) {
         int intentos=0;
         try{
         intentos=Integer.parseInt(args);
         }catch(NumberFormatException e){
                System.out.println("el segundo argumento debe de ser un numero");
                System.exit(0);
         }
         if (intentos<1){
                System.out.println("el segundo argumento debe de ser un numero mayor que cero");
                System.exit(0);
         }
         return intentos;
  }

  private static boolean leerTercerArgumento(String args){
         if(args.equals("true")){
                return true;
         }
         if(args.equals("false")){
                return false;
         }
         else{
                System.out.println("el tercer argumento debe de ser true o false");

                System.exit(0);
         }
         return false;
  }
	
}


