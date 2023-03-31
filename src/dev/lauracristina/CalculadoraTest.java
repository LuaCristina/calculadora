package dev.lauracristina;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {

    @BeforeEach
    public void inicializaCenario() {
    }

    @Test
    @DisplayName("Teste 1: Implemente um teste para o construtor sem parâmetro de entrada")
    public void teste1() {
        Calculadora calculadora = new Calculadora();
        int resultadoEsperado = 0;
        int resultadoObtido = calculadora.getMemoria();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test()
    @DisplayName("Teste 2: Implemente os testes para o construtor com parâmetro: recebendo o valor 3.")
    public void teste2() {
        Calculadora calculadora = new Calculadora(3);
        int resultadoEsperado = 3;
        int resultadoObtido = calculadora.getMemoria();
        assertEquals(resultadoEsperado, resultadoObtido);
    }


    @Test()
    @DisplayName("Teste 3: Implemente os testes do método somar:somar um número negativo.")
    public void teste3() {
        Calculadora calculadora = new Calculadora(3);
        int resultadoEsperado = 2;
        calculadora.somar(-1);
        int resultadoObtido = calculadora.getMemoria();
        assertEquals(resultadoEsperado, resultadoObtido);}

    @Test()
    @DisplayName("Teste 4: Implemente os testes do método subtrair: subtrair um número positivo.")
    public void teste4() {
        Calculadora calculadora = new Calculadora(3);
        int resultadoEsperado = -2;
        calculadora.subtrair(5);
        int resultadoObtido = calculadora.getMemoria();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test()
    @DisplayName("Teste 5: Implemente os testes do método multiplicar: multiplicar um número positivo.")
    public void teste5() {
        Calculadora calculadora = new Calculadora(3);
        int resultadoEsperado = 18;
        calculadora.multiplicar(6);
        int resultadoObtido = calculadora.getMemoria();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test()
    @DisplayName("Teste 6: Implemente os testes do método dividir: dividir por valor 0 e dividir por um valor positivo.\n" +
            "A divisão por zero deverá retornar uma exception.")
//    public void teste6() {
//        Calculadora calculadora = new Calculadora(3);
//        assertThrows(Exception.class, () -> calculadora.dividir(0));
//    }


    public void teste6() {
        Calculadora calculadora = new Calculadora(3);
        assertThrows(Exception.class, () -> calculadora.dividir(0));
    }

    @Test()
    @DisplayName("Teste 7: Implemente os testes do método exponenciação: exponenciar a memória por 1 e por 10. Se a entrada for um valor maior que 10 deverá retornar uma exception")
    public void teste7() throws Exception {
        Calculadora calculadora = new Calculadora(3);
        int resultadoEsperado = 9;
        calculadora.exponenciar(2);
        int resultadoObtido = calculadora.getMemoria();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test()
    @DisplayName("Teste 8:  Implemente os testes para o método zerarMemória. (Utilize o método getMemoria para\n" +
            "verificar se o valor da memória é 0).")
    public void teste8() throws Exception {
        Calculadora calculadora = new Calculadora(3);
        int resultadoEsperado = 0;
        calculadora.zerarMemoria(0);
        int resultadoObtido = calculadora.getMemoria();
        assertEquals(resultadoEsperado, resultadoObtido);
    }



}