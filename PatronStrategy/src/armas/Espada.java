package armas;

public class Espada implements Arma {

	@Override
	public TipoArma getTipo() {
		return TipoArma.ESPADA;
	}

	@Override
	public int puntosDanyo() {
		return 8;
	}

}
