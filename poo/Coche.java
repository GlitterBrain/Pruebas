package poo;

public class Coche {
	
	private int ruedas;
	
	private int motor;
	
	private String color;
	
	
	public Coche() {
		
		ruedas=4;
		
		motor=1;
		
	}
	
	public String datos(){
		
		return "Tiene " + ruedas + " ruedas y " + motor + " motor y es de color  " + 
		color;
	}
	
	public void ponercolor(String colorcoche) {
		
		color=colorcoche;
		
	}
	
	public String dimecolor() {
		
		return color;
	}

}
