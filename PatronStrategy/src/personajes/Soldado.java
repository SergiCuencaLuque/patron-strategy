package personajes;

public class Soldado extends Personaje{

	public Soldado(String nombre) {
		super(nombre);
		super.tipo = TipoPersonaje.SOLDADO;
	}
	
}
