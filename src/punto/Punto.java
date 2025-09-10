package punto;

import java.util.Objects;

public class Punto {
	private double coordX;
	private double coordY;

	private final static double INCREMENTO = 0.5;

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
		return Math.sqrt(Math.pow(punto.getCoordX() - this.coordX, 2) - Math.pow(punto.getCoordY() - this.coordY, 2));
	}

	public Punto sumarPunto(Punto punto) {
		return new Punto(this.coordX + punto.coordX, this.coordY + punto.coordY);
	}

	public Punto sumarPunto(double cx, double cy) {
		return new Punto(this.coordX + cx, this.coordY + cy);
	}

	public Punto sumarPunto() {
		return new Punto(this.coordX + INCREMENTO, this.coordY + INCREMENTO);
	}

	public static Punto sumarPunto(Punto punto1, Punto punto2) {
		return new Punto(punto1.coordX + punto2.coordX, punto1.coordY + punto2.coordY);
	}

	@Override
	public int hashCode() {
		return Objects.hash(coordX, coordY);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return Double.doubleToLongBits(coordX) == Double.doubleToLongBits(other.coordX)
				&& Double.doubleToLongBits(coordY) == Double.doubleToLongBits(other.coordY);
	}

	public double getCoordX() {
		return coordX;
	}

	public double getCoordY() {
		return coordY;
	}

	@Override
	public String toString() {
		return "Punto2D [coordX=" + coordX + ", coordY=" + coordY + "]";
	}

	public int comparateTo(Object o) {

		Punto punto = (Punto) o;

		return (int) (this.coordX - punto.coordX);
	}
}
