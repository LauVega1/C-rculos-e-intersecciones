package circulo;

import org.junit.jupiter.api.Test;
import punto.Punto;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    @Test
    void intersectaCon_DeberiaSerTrue_CuandoLosCirculosSeSuperponen() {
        // Arrange
        Circulo c1 = new Circulo(new Punto(0, 0), 5);
        Circulo c2 = new Circulo(new Punto(3, 0), 4);

        // Act
        boolean resultado = c1.intersectaCon(c2);

        // Assert
        assertTrue(resultado, "Los círculos deberían intersectarse");
    }

    @Test
    void intersectaCon_DeberiaSerFalse_CuandoLosCirculosEstanSeparados() {
        // Arrange
        Circulo c1 = new Circulo(new Punto(0, 0), 2);
        Circulo c2 = new Circulo(new Punto(10, 0), 2);

        // Act
        boolean resultado = c1.intersectaCon(c2);

        // Assert
        assertFalse(resultado, "Los círculos no deberían intersectarse");
    }

    @Test
    void intersectaCon_DeberiaSerTrue_CuandoLosCirculosSeTocanEnUnPunto() {
        // Arrange
        Circulo c1 = new Circulo(new Punto(0, 0), 3);
        Circulo c2 = new Circulo(new Punto(6, 0), 3);

        // Act
        boolean resultado = c1.intersectaCon(c2);

        // Assert
        assertTrue(resultado, "Los círculos deberían intersectarse en un solo punto");
    }

    @Test
    void intersectaCon_DeberiaSerTrue_CuandoUnCirculoEstaDentroDeOtro() {
        // Arrange
        Circulo c1 = new Circulo(new Punto(0, 0), 10);
        Circulo c2 = new Circulo(new Punto(1, 1), 2);

        // Act
        boolean resultado = c1.intersectaCon(c2);

        // Assert
        assertTrue(resultado, "Un círculo contenido dentro de otro se considera intersectado");
    }
}
