package monturas;

public class SinMontura implements Montura {

	@Override
	public TipoMontura getTipo() {
		return TipoMontura.SINMONTURA;
	}

	@Override
	public int duraciónViaje(int distanciaRecorrida) {
		return distanciaRecorrida/5;	
	}

}
