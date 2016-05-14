package es.unileon.prg1.mastermind;

public class Ficha {
    private char color;
    //enum Colores {R,G,Y,B,P,C;}
   
    //constructor
    public Ficha(char color){
    	if(esValido(color)){
            this.color=color;
        }
        
        else{
            //excepcion
        }
    }
    	
    	 public Ficha(char color, int tipo){
    	    	if(tipo==1){
    	            this.color='-';
    	        }
    	        
    	        else{
    	        	if (esValidoSolucion(color)){
    	        		this.color=color;
    	        	}
    	            //excepcion
    	        }
       
    }
    public Ficha(){
       
        int random=((int) (Math.random()*5+1));
        switch (random) {
            case 0:
                this.color = 'R';
                break;
            case 1:
                this.color = 'G';
                break;
            case 2:
                this.color = 'Y';
                break;
            case 3:
                this.color = 'B';
                break;
            case 4:
                this.color = 'P';
                break;
            case 5:
                this.color = 'C';
                break;

        }
       
    }
    //getter and setter
    public char getColor() {
        return color;
    }
   /* public void setColor(char color) {
        this.color = color;
    }*/
   
    public boolean colorIgual(Ficha oFicha){
        if(this.color==(oFicha.color)){
            return true;
        }
        return false;
    }
    public boolean esValido(char ficha){
        if(ficha=='R'||ficha=='G'||ficha=='Y'||ficha=='B'||ficha=='P'||ficha=='C' ){
            return true;
        }
        return false;
    }
    
    public boolean esValidoSolucion(char ficha){
        if(ficha=='X'||ficha=='0'){
            return true;
        }
        return false;
    }

}
