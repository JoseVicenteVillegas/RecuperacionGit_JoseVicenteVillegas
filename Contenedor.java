package prueba;

public class Contenedor implements Comparable<Contenedor>{
	private String origen;
	private String mercancia;
	private float peso;
	private String compañia;
	private String contenedor;

	
	public Contenedor(String origen, String mercancia, float peso, String compañia,String contenedor) {
		this.origen = origen;
		this.mercancia = mercancia;
		this.peso = peso;
		this.compañia = compañia;
		this.contenedor = contenedor;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getMercancia() {
		return mercancia;
	}

	public void setMercancia(String mercancia) {
		this.mercancia = mercancia;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	
	@Override
	public int compareTo(Contenedor o) {
		return Float.compare(peso, o.peso);
	}
	
	

}

