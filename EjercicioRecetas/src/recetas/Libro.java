package recetas;

public class Libro {
	private Receta[] pagina;
	private int cantPaginas;
	
	public Libro (int cantpag) {
		
		this.pagina = new Receta[cantpag];
		this.cantPaginas = cantpag;
		
	}
	
	public void agregarReceta(int pag, String[] lista, int cantIng){
		this.pagina[pag] = new Receta (pag, lista, cantIng);
	}
	
	public Receta getReceta(int pag) {
		return pagina[pag];
	}

	public Receta[] getPagina() {
		return pagina;
	}

	public void setPagina(int indice, Receta rec) {
		this.pagina[indice] = rec;
	}

	public int getCantPaginas() {
		return cantPaginas;
	}

	public void setCantPaginas(int cantPaginas) {
		this.cantPaginas = cantPaginas;
	}
	
}
