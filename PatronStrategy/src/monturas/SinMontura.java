package monturas;

public class SinMontura implements Montura {

	@Override
	public TipoMontura getTipo() {
		return TipoMontura.SINMONTURA;
	}

	@Override
	public int duraci�nViaje(int distanciaRecorrida) {
		return distanciaRecorrida/5;	
	}

}
