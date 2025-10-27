package Ejercicio3;

public class Gato extends Animal {
    @Override
    protected void sonido(){
        System.out.println("Miau~");
    }
    protected void dormir(){
        System.out.println("ZZZZzzzz...");
    }

}
