package poo;

public class uso_vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche Opel=new Coche();
		
		Opel.ponercolor("Azul");
		
		Furgoneta Combo=new Furgoneta(7,580);
		
		Combo.ponercolor("Rojo");
		
		System.out.println(Opel.datos() + Opel.dimecolor());
		
		System.out.println(Combo.datos() + Combo.dimeDatosFurgoneta());

	}

}
