package armas;

public class Arco implements Arma {

	@Override
	public TipoArma getTipo() {
		return TipoArma.ARCO;
	}

	@Override
	public int puntosDanyo() {
		return 5;
	}

}
