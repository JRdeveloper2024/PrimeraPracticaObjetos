package entrenador;

import modelo.Pokemon;

public class InventarioPokemon {
	private Pokemon[] listaPokemon; // Nos pide importarlas para acceder a la informacion de la otra clase
	
	//Vamos a darle el tamaño al array
	//Constructor
	public InventarioPokemon() {
		this.listaPokemon = new Pokemon[5]; //Tendra 5 nombres y 5 tipos
	}
	
	public InventarioPokemon(Pokemon[] listaPokemon) {
		this.listaPokemon = listaPokemon;
	}
	
	public void mostrarTodoInventario() {
		for (Pokemon pokemon : listaPokemon) {
			if (pokemon != null) {
				System.out.println(pokemon.toString());
			}
		}
	}
	
	//Como ejercicio podemos retornar el pokemon que ocupe esa posicion
	
	public void guardarPokemon(Pokemon nuevoPokemon) {
		for (int i = 0; i < listaPokemon.length; i++) {
			if(listaPokemon[i] == null) {
				listaPokemon[i] = nuevoPokemon;
				break;
			}
		}
	}
	
	public boolean almacenarPokemon(Pokemon nuevoPokemon) {
		
		for (int i = 0; i < listaPokemon.length; i++) {
			if(listaPokemon[i] == null) {
				listaPokemon[i] = nuevoPokemon;
				return true;
			}
		}
		return false;
	}
	
}
