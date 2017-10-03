package principal;

import armas.Espada;
import direcciones.Direccion;
import monturas.Caballo;
import personajes.Caballero;
import personajes.Personaje;

public class JuegoDeRol {

	public static void main(String[] args) {
		Personaje jugador = new Caballero("Pablito");
		jugador.eligeArma(new Espada());
		jugador.eligeMontura(new Caballo());
		
		jugador.info();
		jugador.utilizaMontura(100, Direccion.NORTE);
		jugador.utilizaArma();
	}

}
