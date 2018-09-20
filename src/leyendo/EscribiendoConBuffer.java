package leyendo;

import java.io.*;

public class EscribiendoConBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeerFichero1 CorreosOgame = new LeerFichero1();
		CorreosOgame.lee();
	}

}

class LeerFichero1{
	public void lee(){
		try {
			FileReader entrada = new FileReader("C:/Users/edu/Desktop/correos ogame.txt");
			BufferedReader miBuffer = new BufferedReader(entrada);
			
			String linea="";
			
			
			while(linea!=null){		
				linea=miBuffer.readLine();
				System.out.println(linea);	
			}
			entrada.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha encontrado el archivo");
		}
		
	}
}
