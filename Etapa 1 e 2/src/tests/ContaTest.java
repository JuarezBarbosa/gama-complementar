// Package
package tests;

// Test imports
import static org.junit.Assert.assertEquals;
import org.junit.Test;

// Classes
import main.Conta;

public class ContaTest {

    @Test
    public void testSaldoInicial() {
        Conta conta = new Conta(1);
        double saldo = conta.getSaldo();
        assertEquals(0, saldo, 0);
    };

    @Test
    public void testDeposito() {
        Conta conta = new Conta(1);
        conta.deposita(100);
        double saldo = conta.getSaldo();
        assertEquals(100, saldo, 0);
    };

    @Test
    public void testSaque() {
        Conta conta = new Conta(1);
        conta.deposita(100);
        conta.saca(50);
        double saldo = conta.getSaldo();
        assertEquals(50, saldo, 0);
    };

    @Test
    public void testSaqueZero() {
        Conta conta = new Conta(1);
        conta.deposita(100);
        conta.saca(0);
        double saldo = conta.getSaldo();
        assertEquals(100, saldo, 0);
    };
}