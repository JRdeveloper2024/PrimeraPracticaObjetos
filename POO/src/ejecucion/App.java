package ejecucion;

import java.util.Arrays;

import entrenador.InventarioPokemon;
import modelo.Pokemon;

public class App {

	public static void main(String[] args) {
		
		InventarioPokemon ipLeno = new InventarioPokemon(generarLista());
		ipLeno.mostrarTodoInventario();
		System.out.println("*".repeat(10));
		InventarioPokemon ipVacio = new InventarioPokemon();
		ipVacio.mostrarTodoInventario();
		ipVacio.guardarPokemon(new Pokemon("Charmander" , "Fuego"));
		ipVacio.mostrarTodoInventario();
		ipLeno.guardarPokemon(new Pokemon("caterpie" , "Bicho"));
		ipLeno.mostrarTodoInventario();
		
	}
	
	public static Pokemon[] generarLista () {
		
		Pokemon[] listaPokemon = new Pokemon[] {
				new Pokemon("Pikachu" , "Electrico"),
				new Pokemon("Bulbasur" , "Planta"),
				new Pokemon("Charmander" , "Fuego"),
				new Pokemon("Squirtle" , "Agua"),
				new Pokemon("Dito" , "normal"),
		};
				
		
		return listaPokemon;
		
	}

}
