public class App {
    public static void main(String[] args) throws Exception {
        Relogio relogiodepulso = new Relogio(23, 59, 59);

        relogiodepulso.setHoras(10);
        relogiodepulso.setMinutos(20);
        relogiodepulso.setSegundos(00);
        System.out.println(relogiodepulso.getHoraAtual());
    }
}
