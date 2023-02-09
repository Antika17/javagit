package mipoo;

public class Libro {

	private String nombre;
	private String autor;
	private int ejemplares;
	private int prestados;

	public Libro() {
	}

	public Libro(String nombre, String autor, int ejemplares, int prestados) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getPrestados() {
		return prestados;
	}

	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}

	//metodos de instancia
	public boolean prestamo() {
		boolean prestado = true;
		if (prestados < ejemplares) {
			prestados++;}
		else {prestado=false;}
			return prestado;
		
	}

	public boolean devolucion() {
		boolean devuelto=true;
		if (prestados==0) {devuelto = false;}
		else {devuelto=true;
		prestados--;}
		return devuelto;
	

	}

	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", autor=" + autor + ", numero=" + ejemplares + ", prestados=" + prestados
				+ "]";

	}
}
