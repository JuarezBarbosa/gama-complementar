package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Conta;
import main.ContaCorrente;

public class ContaCorrenteTest extends ContaTest{

    @Test
    public void testSaqueMaiorQueSaldo() {
        Conta conta = new ContaCorrente(1);
        conta.deposita(100);
        conta.saca(150);
        double saldo = conta.getSaldo();
        assertEquals(100, saldo, 0);
    }
}
