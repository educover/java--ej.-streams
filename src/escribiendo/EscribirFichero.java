package escribiendo;
import java.io.*;

public class EscribirFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Escribiendo archivoNuevo = new Escribiendo();
		archivoNuevo.escribir();
	}

}

class Escribiendo{
	public void escribir(){
		String frase="Esto es una prueba de escritura2";
		try {
			FileWriter escritura = new FileWriter("C:/Users/edu/Desktop/texxto_nuevo.txt", true);
			for(int i=0; i<frase.length();i++){
				escritura.write(frase.charAt(i));
			}
			escritura.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
