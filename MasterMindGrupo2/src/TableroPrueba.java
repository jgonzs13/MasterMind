
public class TableroPrueba {
	
		private char tableroCombinacion[][];
		private char tableroResultado[][];
		
		//Crear tablero
		public Tablero(int numeroIntentos, int longitud){
			this.tableroCombinacion=new char [numeroIntentos][longitud];
			inicializarTablero(tableroCombinacion);
			this.tableroResultado=new char [numeroIntentos][longitud];
			inicializarTablero(tableroResultado);
		}
		public void inicializarTablero(char [][]tablero){
			for (int i=0;i<tablero.length;i++){          //Recorro filas
				for (int j=0;j<tablero[i].length;j++){   //Recorro columnas
					tablero[i][j]='-';
					
				}
			}
			//Imprimir la matriz
					
		}
		public void imprimirTablero(){
			for (int i=0;i<tableroCombinacion.length;i++){          //Recorro filas
				for (int j=0;j<tableroCombinacion[i].length;j++){   //Recorro columnas
					System.out.print(tableroCombinacion[i][j]);
				}
				System.out.print("     ");
				for (int j=0;j<tableroResultado[i].length;j++){ 
					System.out.print(tableroResultado[i][j]);
				}
				System.out.println("");
			}
			
			System.out.println();
			System.out.println("Introducir una combinacion de " +tableroCombinacion[0].length+ " colores");
			System.out.println("R/G/Y/B/P/C/salir");
		}
		
		public void modificoTablero(int fila, char []combinacion){
			for(int i=0; i<combinacion.length; i++){
				tableroCombinacion[fila][i]=combinacion[i];
			}
		}
		public void modificoTableroRdo(int fila, char []combinacion){
			for(int i=0; i<combinacion.length; i++){
				tableroResultado[fila][i]=combinacion[i];
			}
		}
	}

}
