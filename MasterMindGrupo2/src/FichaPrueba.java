
public class FichaPrueba {
	private char color;
	 //constructor
	public Ficha (char ficha){
		this.color=ficha;
		 //getter y setter
		
	}
	public char getColor() {
		return color;
	}
	public void setColor(char color) {
		this.color = color;
	}
	
	//metodo para saber si es valido o no
	public boolean esValida(){
		return (color=='R' || color=='G' || color=='Y' || color=='B' || color=='P' || color=='C');
	}
}

