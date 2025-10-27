package ejercicio1;

public class Rectangulo extends Figuras{
    protected double ancho;
    protected double largo;
    private void validacion(){
        if (!(largo > 0) || !(ancho > 0)){
            throw new IllegalArgumentException("Ingrese valores mayores que 0");
        }
    }
    public Rectangulo(double largo, double ancho){
        this.largo = largo;
        this.ancho = ancho;
        validacion();
    }
    @Override
    protected double calcularArea() {
        return this.largo*this.ancho;
    }
}