package punto;

public class Punto {
	private double coordX;
	private double coordY;

	public Punto(double coordX, double coordY) {
		// super();
		this.coordX = coordX;
		this.coordY = coordY;
	}

	public Punto(Punto otro) {
		this.coordX = otro.coordX;
		this.coordY = otro.coordY;
	}

	public double distancia(Punto punto) {
		return Math.sqrt(Math.pow(punto.coordX - this.coordX, 2) - Math.pow(punto.coordY - this.coordY, 2));
	}
}
