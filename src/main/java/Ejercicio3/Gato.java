package Ejercicio3;

public class Gato extends Animal {
    @Override
    protected void sonido(){
        System.out.println("Miau~");
    }
    @Override
    protected void comer() {
        System.out.println("El animal está comiendo.");
    }
    protected void dormir(){
        System.out.println("ZZZZzzzz...");
    }
}