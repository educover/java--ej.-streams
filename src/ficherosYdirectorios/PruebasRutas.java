package ficherosYdirectorios;
import java.io.*;

public class PruebasRutas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File miArchivo = new File("bin");
		System.out.println(miArchivo.getAbsolutePath());
		System.out.println(miArchivo.exists());
	}

}
