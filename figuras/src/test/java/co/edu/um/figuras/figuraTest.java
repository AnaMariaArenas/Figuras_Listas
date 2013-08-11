package co.edu.um.figuras;
import org.junit.Test;


/**
 * Created with IntelliJ IDEA.
 * User: ARENITA
 * Date: 9/08/13
 * Time: 10:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class figuraTest {
    @Test
    public void testArea() throws Exception {
        circulo area1 = new circulo(15, 32);
        System.out.println("El área del Circulo es: " + area1.area());
        System.out.println();
        cuadrado area2 = new cuadrado(5);
        System.out.println("El área del Cuadrado es: " + area2.area());
        System.out.println();
        triangulo area3 = new triangulo(2, 5, 4);
        System.out.println("El área del Triángulo es: " + area3.area());
        System.out.println();
        circulo peri1 = new circulo(23, 34);
        System.out.println("El Perímetro del Circulo es: " + peri1.perimetro());
        System.out.println();
        cuadrado peri2 = new cuadrado(10);
        System.out.println("El Perímetro del Cuadrado es: " + peri2.perimetro());
        System.out.println();
        triangulo peri3 = new triangulo(10, 10, 10);
        System.out.println("El Perímetro del Triángulo es: " + peri3.perimetro());

    }

    @Test
    public void testPerimetro() throws Exception {

    }
}
