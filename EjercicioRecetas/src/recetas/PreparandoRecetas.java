package recetas;

import java.io.BufferedReader;
import java.io.FileReader;

public class PreparandoRecetas {

	public static void main(String[] args) {
		try {
			
			FileReader fr = new FileReader("Libro.txt");
			BufferedReader buffer = new BufferedReader(fr);
			
			int cantidadIngredientesH = buffer.read();
			int cantidadPaginas = buffer.read();
			
			Heladera miHeladera =  new Heladera (cantidadIngredientesH, buffer.readLine().split(" ", cantidadIngredientesH));
			
			String [] lista;
			int cantIng;
			
			Libro miLibro = new Libro(cantidadPaginas);
			
			for (int i=0; i<cantidadPaginas ; i++) {
				
				cantIng = buffer.read();
				lista = new String[cantIng];
				lista = buffer.readLine().split(" ", cantIng);
				miLibro.agregarReceta(i+1, lista, cantIng);
				
			}
			buffer.close();
			
			
		}catch(Exception error){
			System.out.println("Ocurrio un error, mensaje del error: "+error);
		}

	}

}
