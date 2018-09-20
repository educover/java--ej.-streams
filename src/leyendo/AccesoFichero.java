package leyendo;

import java.io.*;

public class AccesoFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeerFichero CorreosOgame = new LeerFichero();
		CorreosOgame.lee();
	}

}

class LeerFichero{
	public void lee(){
		try {
			FileReader entrada = new FileReader("C:/Users/edu/Desktop/correos ogame.txt");
			int c = entrada.read();
			while(c!=-1){		
				c=entrada.read();
				char letra = (char)c;
				System.out.print(letra);	
			}
			entrada.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha encontrado el archivo");
		}
		
	}
}
