package recetas;

public class Heladera {
	private int cantIngredientes;
	private String[] ingredientes;
	
	public Heladera(int cant, String[] lista) {
		
		this.cantIngredientes = cant;
		this.ingredientes = new String[cant];
		for (int i=0; i<cant; i++) {
			this.ingredientes[i] = lista[i];
		}
		
	}

	public int getCantIngredientes() {
		return cantIngredientes;
	}

	public void setCantIngredientes(int cantIngredientes) {
		this.cantIngredientes = cantIngredientes;
	}

	public String[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}
	
}
