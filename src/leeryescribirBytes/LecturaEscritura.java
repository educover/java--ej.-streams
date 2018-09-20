package leeryescribirBytes;
import java.io.*;

public class LecturaEscritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador = 0;
		int datos_entrada[]=new int[78077];
		try{
			FileInputStream archivoLectura = new FileInputStream("C:/Users/edu/Desktop/DSC02208.jpg");
			boolean final_ar = false;
			while(!final_ar){
				int byte_entrada = archivoLectura.read();
				if (byte_entrada!=-1){
					datos_entrada[contador]=byte_entrada;
				} else {
					final_ar=true;
				}
				System.out.println(datos_entrada[contador]);
				contador++;
			}
			
			archivoLectura.close();
		}catch(IOException e){
			System.out.println("Ha ocurrido un error");
		}
		System.out.println(contador);
		
		creaFichero(datos_entrada);
	}
	
	static void creaFichero(int datosNuevoFichero[]){
		try{
			FileOutputStream ficheroNuevo = new FileOutputStream("C:/Users/edu/Desktop/DSC02208_copia.jpg");
			for (int i=0; i<datosNuevoFichero.length;i++){
				ficheroNuevo.write(datosNuevoFichero[i]);
			}
			ficheroNuevo.close();
		}catch(IOException e){
			System.out.println("Error 2");
		}
	}

}
