package personajes;

import armas.Arma;
import direcciones.Direccion;
import monturas.Montura;

public abstract class Personaje {

	String  nombre;
	TipoPersonaje  tipo;
	Arma    arma;
	Montura montura;
	
	Personaje(String nombre){
		this.nombre = nombre;	
	}
	
	public void eligeArma(Arma arma){
		this.arma = arma;
	}
	
	public void utilizaArma(){
		System.out.println("\nPreparate para mi ataque:\n\tArma: "+arma.getTipo()+"\n\tDa�o: "+arma.puntosDanyo());
	}

	public void eligeMontura(Montura montura){
		this.montura = montura;
	}
	
	public void utilizaMontura(int distancia, Direccion direccion){
		System.out.println("\nEmprendo un viaje de "+distancia+"m: \n\tMontura: "+montura.getTipo()+"\n\tDirecci�n: "+direccion+"\n\tDuraci�n del viaje: "+montura.duraci�nViaje(distancia)+" unidades");
	}
	
	public void info(){
		System.out.println("\nNombre: "+this.nombre+"\n\tArma: "+arma.getTipo()+" --> Da�o: "+arma.puntosDanyo() + "\n\tMontura: "+montura.getTipo());
	}
	
}
