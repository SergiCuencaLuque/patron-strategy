package monturas;

public class Teletransportador implements Montura {

	@Override
	public TipoMontura getTipo() {
		return TipoMontura.TELETRANSPORTADOR;
	}

	@Override
	public int duraci�nViaje(int distanciaRecorrida) {
		return 0;	
	}

}
