package monturas;

public class Dragon implements Montura {

	@Override
	public TipoMontura getTipo() {
		return TipoMontura.DRAGON;
	}

	@Override
	public int duraciónViaje(int distanciaRecorrida) {
		return distanciaRecorrida/15;	//Velocidad media de los caballos en metros
	}

}
