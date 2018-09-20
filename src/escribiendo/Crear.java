package escribiendo;
import java.io.*;

public class Crear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ruta=new File("C:/Users/edu/Desktop/programar" + File.separator + "pruebaTexto.txt");
		//ruta.mkdir();
		String archivoDestino = ruta.getAbsolutePath();
		try{
		ruta.createNewFile();
		} catch(IOException e){
			System.out.println("Ruta equivocada");
		}
		
		Escribiendo1 accedeEs = new Escribiendo1();
		accedeEs.escribir(archivoDestino);
	}

}


class Escribiendo1{
	public void escribir(String rutaArchivo){
		String frase = "Esto es un ejemplo"
				+ "a ver si aprendo aputo programar";
		try{
			FileWriter escritura = new FileWriter(rutaArchivo);
			for (int i = 0; i<frase.length(); i++){
				escritura.write(frase.charAt(i));
			}
			escritura.close();
		}catch(IOException e){
			
		}
	}
}