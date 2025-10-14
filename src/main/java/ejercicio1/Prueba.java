package ejercicio1;

public class Prueba {
    public static void main(String[] args) {
        var circulo = new Circulo(9.2);
        var rectangulo = new Rectangulo(8.0, 4.0);
        System.out.printf("El area del rectangulo es: %.2f \n El area del circulo es: %.2f ", rectangulo.calcularArea(), circulo.calcularArea());
    }
}