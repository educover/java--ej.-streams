package escribiendo;
import java.io.*;

public class AccesosFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ruta=new File("C:/Users/edu/Desktop/programar");
		System.out.println(ruta.exists());
		
		String [] nombresArchivo=ruta.list();
		
		for(int i=0; i<nombresArchivo.length; i++){
			System.out.println(nombresArchivo[i]);
			
			File f = new File(ruta.getAbsolutePath(), nombresArchivo[i]);
			if(f.isDirectory()){
				String[] archivosSubcarpeta = f.list();
				for (int j=0; j<archivosSubcarpeta.length; j++){
					System.out.println(" viene de una carpeta"+archivosSubcarpeta[j]);
				}
			}
		}
	}

}
