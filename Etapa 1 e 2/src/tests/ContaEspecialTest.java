package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Conta;
import main.ContaEspecial;

public class ContaEspecialTest extends ContaTest {
    @Test
    public void testSaqueUsandoLimite() {
        Conta conta = new ContaEspecial(1, 100);
        conta.saca(50);
        double saldo = conta.getSaldo();
        assertEquals(-50, saldo, 0);
    };

    @Test
    public void testSaqueMaiorQueSaldoELimite() {
        Conta conta = new ContaEspecial(1, 100);
        conta.saca(150);
        double saldo = conta.getSaldo();
        assertEquals(0, saldo, 0);
    };
}
