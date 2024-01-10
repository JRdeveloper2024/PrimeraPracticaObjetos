package PracticaIntroAobjetos2;

public class Usuario {

	private String nombre;
	private int edad;
	private String correo;
	
	public Usuario() {}
	public Usuario(String nombre, int edad, String correo) {
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
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
	
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String toString() {
		return "Nombre de usuario: " + nombre + " Edad: " + edad + " Correo electronico: " + correo;
	}
	public boolean equals(Object usuario) {//Comparan nombre y correo
		return true; //Parámetro el objeto ?
	}
	
}
