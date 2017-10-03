package armas;

public class Desarmado implements Arma {

	@Override
	public TipoArma getTipo() {
		return TipoArma.DESARMADO;
	}

	@Override
	public int puntosDanyo() {
		return 2;
	}

}
