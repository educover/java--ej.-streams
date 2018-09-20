package serializar;

import java.io.*;

public class Serializar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jefe admin = new Jefe("Edu", 25000, "Informatica");
		
		Empleado[] personal = new Empleado[3];
		personal[0] = admin;
		personal[1] = new Empleado("Ana", 10000);
		personal[2] = new Empleado("Alfonso", 5000);
		
		try{
			ObjectOutputStream escribiendoFichero = new ObjectOutputStream(new FileOutputStream("C:/Users/edu/Desktop/hola.pdf"));
			escribiendoFichero.writeObject(personal);
			escribiendoFichero.close();
			ObjectInputStream recuperandoFichero = new ObjectInputStream(new FileInputStream("C:/Users/edu/Desktop/hola.txt"));
			Empleado[] personalRecuperado = (Empleado[]) recuperandoFichero.readObject();
			recuperandoFichero.close();
			
			for (Empleado e : personalRecuperado){
				System.out.println(e);
			}
		}catch(Exception e){
			
		}
	}

}


class Empleado implements Serializable{
	private String nombre;
	private double sueldo;
	public Empleado(String n, double s){
		nombre=n;
		sueldo=s;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
	
		this.sueldo = sueldo;
	}
	
	public String toString(){
		return "El nombre es: " +nombre+ " y su sueldo es: "+sueldo;
	}
}

class Jefe extends Empleado{
	private String departamento;
	public Jefe(String n, double s, String d){
		super(n, s);
		departamento=d;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String toString(){
		return super.toString() + " y trabaja en el departamento: " + departamento;
	}
}
