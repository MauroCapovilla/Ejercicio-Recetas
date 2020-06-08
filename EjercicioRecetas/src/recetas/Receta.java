package recetas;


public class Receta {
	private int pagina;
	private String[] ingredientes;
	
	
	public Receta(int pag, String[] ing, int canting) {
		this.pagina = pag;
		this.ingredientes = new String [canting];
		
		for (int i = 0; i<canting; i++) {
			this.ingredientes[i]=ing[i];
		}
	}

	public int getPagina() {
		return pagina;
	}

	public void setPagina(int pagina) {
		this.pagina = pagina;
	}

	public String[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	

}
