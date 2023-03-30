package dev.lauracristina;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Calculadora");
	    Calculadora calculadora = new Calculadora();
	    calculadora.somar(1);
	    calculadora.somar(1);
        System.out.println(calculadora.getMemoria());
    }
}
