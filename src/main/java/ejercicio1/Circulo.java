package ejercicio1;

public class Circulo  extends Figuras {
   protected double radio;
   public Circulo(Double radio){
       if (!(radio > 0)){
           throw new IllegalArgumentException("No pueden haber numeros negativos");
       }else{
           this.radio = radio;
       }

   }
    @Override
    protected double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }
}