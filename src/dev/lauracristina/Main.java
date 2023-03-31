package dev.lauracristina;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Calculadora\n");
        teste1();
        teste2();
    }

	private static void teste1(){
		System.out.println("Teste 1");
		System.out.println("Implemente um teste para o construtor sem parâmetro de entrada");
		Calculadora calculadora = new Calculadora();

		int resultado = calculadora.getMemoria();
		int resultadoEsperado = 0;
		if (resultado == resultadoEsperado) {
			System.out.println("Passou no teste\n");
		} else {
			System.out.println("NÃO passou no teste\n");
		}
	}

	private static void teste2(){
		System.out.println("Teste 2");
		System.out.println("Implemente os testes para o construtor com parâmetro: recebendo o valor 3.");
		Calculadora calculadora = new Calculadora(3);

		int resultado = calculadora.getMemoria();
		int resultadoEsperado = 3;
		if (resultado == resultadoEsperado) {
			System.out.println("Passou no teste\n");
		} else {
			System.out.println("NÃO passou no teste\n");
		}
	}
}
