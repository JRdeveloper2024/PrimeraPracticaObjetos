package PracticaIntroAobjetos2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import entrenador.InventarioPokemon;

public class aplicacion {
	static BufferedReader lectura = new BufferedReader (new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		
		Animal leon = new Animal("León",1,"Gran Felino"); //con el vacio
		Animal vibora = new Animal();
		
		System.out.println(leon.toString());
		leon.setEdad(leon.getEdad() + 1); //Modificar
		System.out.println(leon.toString());
		vibora.setNombre(generarString("Introduce el nombre: "));
		vibora.setTipo(generarString("Introduce el tipo: "));

	}

	private static String generarString(String s) throws IOException {
		System.out.println(s);
		return lectura.readLine();
	}

	

}
