package recetas;

import java.io.File;
import java.util.*;

public class PreparandoRecetas {

	public static void main(String[] args) {
		try {
			
			Scanner scan = new Scanner(new File("Libro.txt"));
			
			int cantidadIngredientesH = scan.nextInt();
			int cantidadPaginas = scan.nextInt();
			scan.nextLine();
		
			
			Heladera miHeladera =  new Heladera (cantidadIngredientesH, scan.nextLine().split(" ", cantidadIngredientesH));
			
			
			String [] lista;
			int cantIng;
			
			Libro miLibro = new Libro(cantidadPaginas);
			
			for (int i=0; i<cantidadPaginas ; i++) {
				
				cantIng = scan.nextInt();
				
				lista = new String[cantIng];
				
				scan.nextLine();
				
				lista = scan.nextLine().split(" ", cantIng);
			
				miLibro.agregarReceta(i, lista, cantIng);
				
			}
			scan.close();
			
			
			List<String> listaHel = Arrays.asList(miHeladera.getIngredientes());//convierto el array de ingredientes de la heladera a una lista
			for (int i=0;i<miLibro.getCantPaginas();i++) {
				
				List<String> listaIng = Arrays.asList(miLibro.getReceta(i).getIngredientes());//convierto el array de ingredientes de la receta a una lista
				if (listaHel.containsAll(listaIng) == true ) {//para poder usar la funcion containsAll
					System.out.println("Receta realizable en pagina: "+(int)(miLibro.getReceta(i).getPagina()+1));
				}
			}
			
			
		}catch(Exception error){
			System.out.println("Ocurrio un error, mensaje del error: "+error);
		}

	}

}
