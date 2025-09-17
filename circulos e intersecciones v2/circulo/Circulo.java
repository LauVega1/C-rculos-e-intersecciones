package circulo;

import punto.Punto;

public class Circulo {
	private double radio;
	private Punto centro;

	public Circulo(Punto punto, double radio) {
		this.centro = punto;
		this.radio = radio;
	}

	public boolean intersectaCon(Circulo otro) {
		return centro.distancia(otro.centro) <= this.radio + otro.radio;
	}
}
