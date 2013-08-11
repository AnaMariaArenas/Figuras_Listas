package co.edu.um.figuras;

/**
 * Created with IntelliJ IDEA.
 * User: ARENITA
 * Date: 9/08/13
 * Time: 10:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class triangulo extends figura {
    private double base,altura,lado;

    public triangulo(double base, double altura, double lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    @Override
    public double area() {
        return (base * altura)/2;
    }

    @Override
    public double perimetro() {
        return  lado + lado + lado;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
