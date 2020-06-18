package prueba;

import java.util.LinkedList;

public class ListaOrdenada<E extends Comparable<E>> {

	public  LinkedList<E> lista;
	
	
	
	public ListaOrdenada() {
		super();
		this.lista = new LinkedList<E>();
	}
	
	public void insertar (E elemento) {
		lista.add(buscapos(elemento),elemento);
	}

	@Override
	public  String  toString() {
		StringBuilder resultado = new StringBuilder();
	
		resultado.append("******\n");
		for (E aux :lista) {
			resultado.append(aux.toString() + "\n");
		}
		return resultado.toString();
	}
	
	private int buscapos(E elemento) {
		if (lista.isEmpty())
			return 0;
		else {
			for (E aux : lista) {
				if (elemento.compareTo(aux)<0) {
					return lista.indexOf(aux);
				}
			}
		}
		return lista.size();
		
	}



}
