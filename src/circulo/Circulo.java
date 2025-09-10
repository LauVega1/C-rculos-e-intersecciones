package circulo;

import punto.Punto;

public class Circulo extends Punto {
	private double radio;
//	private Punto centro;

	/// Utilizando herencia
	public Circulo(Punto punto, double radio) {
		super(punto);
		this.radio = radio;
	}

	/// Utilizando composicion
//	public Circulo(Punto punto, double radio) {
//		this.centro = punto;
//		this.radio = radio;
//	}

	public boolean intersectaCon(Circulo otro) {
//		double distanciaEntrePuntos = this.distancia(otro);
		return this.distancia(otro) <= this.radio + otro.radio;
	}
}
