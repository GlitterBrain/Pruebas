package poo;

import java.util.*;


public class Uso_empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*empleado empleado1=new empleado("Pepe Gonzalez",85000,1990,1,1);
		
		empleado empleado2=new empleado("Marta Sanchez",79000,1996,2,5);
		
		empleado empleado3=new empleado("Maria Garcia",76000,1997,2,23);
		
		empleado1.subirSueldo(5);
		empleado2.subirSueldo(3);
		empleado3.subirSueldo(5);
		
		System.out.println("Nombre : " + empleado1.dameNombre() +
				 ". Sueldo : " + empleado1.dameSueldo() + ". Fecha de alta : " +
				empleado1.dameFecha());
		
		System.out.println("Nombre : " + empleado2.dameNombre() +
				 ". Sueldo : " + empleado2.dameSueldo() + ". Fecha de alta : " +
				empleado2.dameFecha());
		
		System.out.println("Nombre : " + empleado3.dameNombre() +
				 ". Sueldo : " + empleado3.dameSueldo() + ". Fecha de alta : " +
				empleado3.dameFecha());*/
		
		Jefatura jefe_RRHH=new Jefatura("Marco Sanchez", 80000,1998,3,21);
		
		jefe_RRHH.estableceIncentivo(1000);
		
		empleado[] misEmpleados=new empleado[6];
		
		
		misEmpleados[0]=new empleado("Paco Gomez", 85000, 1990,1,2);
		
		misEmpleados[1]=new empleado("Maria Martinez", 88000, 1998,5,22);
		
		misEmpleados[2]=new empleado("Marta Garcia", 78000, 1995,8,6);
		
		misEmpleados[3]=new empleado("Javier Santos");
		
		misEmpleados[4]=jefe_RRHH; //POLIMORFISMO
		
		misEmpleados[5]=new Jefatura("Laura Marquez",30000,1999,6,6);
		
		Jefatura jefa_Finanzas=(Jefatura)misEmpleados[5];
		
		jefa_Finanzas.estableceIncentivo(30000);
		
		Jefatura jefe_Informatica=(Jefatura)misEmpleados[4];
		
		jefe_Informatica.estableceIncentivo(55000);
		
		/*for (int i=0;i<3;i++) {
			
			misEmpleados[i].subirSueldo(5);
		}*/
		
		/*for (int i=0;i<3;i++) {
			
			System.out.println("Nombre : " + misEmpleados[i].dameNombre() +
				 ". Sueldo : " + misEmpleados[i].dameSueldo() + ". Fecha de alta : " +
				misEmpleados[i].dameFecha());
		}*/
		
		for (empleado e: misEmpleados) {
			
			e.subirSueldo(5);
			
		}
		
		Arrays.sort(misEmpleados);
		
		for(empleado e: misEmpleados) {
			
			
			
			System.out.println("Nombre : " + e.dameNombre() +
					 ". Sueldo : " + e.dameSueldo() + ". Fecha de alta : " +
					e.dameFecha());
			
		}
		
	}

}

class empleado implements Comparable{
	
	public empleado(String nom, double sue, int agno, int mes, int dia) {
		
		nombre=nom;
		sueldo=sue;
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		
		altaContrato=calendario.getTime();
		
		++IdSiguiente;
		
		Id=IdSiguiente;
		
	}
	
	public empleado(String nom) {
		
		this(nom,30000,1990,3,4);
	}
	
	
	
	public String dameNombre(){
		
		return nombre + " Id: "+ Id;
	}
	
	public double dameSueldo() {
		
		return sueldo;
	}
	
	public Date dameFecha() {
		
		return altaContrato;
	}
	
	public void subirSueldo(double porcentaje) {
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
	}
	
	public int compareTo(Object miobjeto) {
		
		empleado otroEmpleado=(empleado)miobjeto;
		
		if(this.sueldo<otroEmpleado.sueldo) {
			
			return -1;
		}
		
		if(this.sueldo>otroEmpleado.sueldo) {
			
			return 1;
		}
		
		return 0;
	}
	
	
	private String nombre;
	public double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;
}

class Jefatura extends empleado {
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom,sue,agno,mes,dia);
		

	}
	
	public void estableceIncentivo(double b) {
		
	     incentivo=b;
		
	}
	
	public double dameSueldo() {
		
		double sueldoJefe=super.dameSueldo();
		sueldo=sueldoJefe+incentivo;
		return sueldo;
	}
	
	private double incentivo;
	
}


