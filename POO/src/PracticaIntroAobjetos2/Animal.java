package PracticaIntroAobjetos2;

public class Animal {

	private String nombre;
	private int edad;
	private String tipo;
	
	public Animal() {}
	public Animal(String nombre, int edad, String tipo) {
		this.nombre = nombre;
		this.edad = edad;
		this.tipo = tipo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String toString() {
		return "Name: " + nombre + " Age: " + edad + " Tipo: " + tipo;
	}
	public boolean equals(Object animal) {//Comparan nombre y edad
		
		Animal elquerecibo = (Animal)animal;
		if(this.nombre == elquerecibo.nombre && this.edad == elquerecibo.edad) {
			return true;
		}
		return false; //Parámetro el objeto ?
	}
	
}
