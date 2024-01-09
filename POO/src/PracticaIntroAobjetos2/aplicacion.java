package PracticaIntroAobjetos2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import entrenador.InventarioPokemon;

public class aplicacion {
	static BufferedReader lectura = new BufferedReader (new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		
		Animal leon = new Animal();
		Animal vivora = new Animal();
		
		String nombre = generarNombre();

	}

	private static String generarNombre() throws IOException {
		System.out.println("Introduce el nombre: ");
		return lectura.readLine();
	}

	

}
