package prueba;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaOrdenada<Integer> listaEnteros = new ListaOrdenada<Integer>();
		
		listaEnteros.insertar(3);
		System.out.println(listaEnteros.toString());
		listaEnteros.insertar(10);
		System.out.println(listaEnteros.toString());
		listaEnteros.insertar(1);
		System.out.println(listaEnteros.toString());
		listaEnteros.insertar(5);
		System.out.println(listaEnteros.toString());
		
		
		ListaOrdenada<String> listaString = new ListaOrdenada<String>();
		
		listaString.insertar("Hola");
		System.out.println(listaString.toString());
		listaString.insertar("Adios");
		System.out.println(listaString.toString());
		listaString.insertar("suelo");
		System.out.println(listaString.toString());
		listaString.insertar("Buenos días");
		System.out.println(listaString.toString());
		
		
		ListaOrdenada<Persona> listaPersona = new ListaOrdenada<Persona>();
		Persona p1 = new Persona("Inma","Olias", 25);
		listaPersona.insertar(p1);
		System.out.println(listaPersona.toString());
		p1 = new Persona("David","Cebrian", 20);
		listaPersona.insertar(p1);
		System.out.println(listaPersona.toString());
		p1 = new Persona("Alvaro","Rueda", 21);
		listaPersona.insertar(p1);
		System.out.println(listaPersona.toString());
		
	}

}
