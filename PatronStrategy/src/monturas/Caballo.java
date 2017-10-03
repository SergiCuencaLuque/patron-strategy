package monturas;

public class Caballo implements Montura {
	
	@Override
	public TipoMontura getTipo() {
		return TipoMontura.CABALLO;
	}

	@Override
	public int duraci�nViaje(int distanciaRecorrida) {
		return distanciaRecorrida/10;	//Velocidad media de los dragones en metros
	}

}
