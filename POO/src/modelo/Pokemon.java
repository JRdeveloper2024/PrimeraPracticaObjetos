package modelo;

public class Pokemon { // Este será el molde donde pondremos los metodos y los atributos
	// Van a ser privadas para encapsular las propiedades
	private String nombre;
	private String tipo;  // Estos son los atrubutos nombnre, tipo... siempre van primero, luego constructores y luego los metodos por orden de relevancia
	
	//Constructores
	public Pokemon() {} // Constructor vacio
	public Pokemon(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
		// El nombre que entra por parametro, lo tenemos disponible en nombre y asi
	}
	
	public void setNombre(String nombre) { // un metodo setter en este caso
		this.nombre = nombre; // el primer nombre hace refencia al de arriba , el de detyras del igual al que entra por parametro
	} // Va a setear un nombre 
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//Con los seter damos propiedades
	public String getNombre() {
		return nombre;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String toString() { // Es un método de la clase objeto
		return nombre + " " + tipo; // Para darle el formato de salida al sysout
	}

}
