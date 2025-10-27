package ejercicio1;

public class Circulo  extends Figuras {
   protected double radio;
   private double validacion(Double radio){
       if (!(radio > 0)){
           throw new IllegalArgumentException("Ingrese valores mayores que 0");
       }else{
           this.radio = radio;
       }
       return radio;
   }
   public Circulo(Double radio){
      this.radio = validacion(radio);

   }
    @Override
    protected double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }
}