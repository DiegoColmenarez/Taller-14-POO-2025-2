package ejercicio1;

public class Rectangulo extends Figuras{
    protected double ancho;
    protected double largo;
    public Rectangulo(double largo, double ancho){
        if (!(largo > 0) || !(ancho > 0)){
            throw new IllegalArgumentException("No pueden ser numeros negativos");
        }else{
            this.largo = largo;
            this.ancho = ancho;
        }
    }
    @Override
    protected double calcularArea() {
        return this.largo*this.ancho;
    }
}