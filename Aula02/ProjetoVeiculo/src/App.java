

public class App {
    public static void main(String[] args) throws Exception {
        Veiculo carro1 = new Veiculo("Volkswagen", "Gol", 12);
        Veiculo carro2 = new Veiculo("Chevrolet", "Corsa", 15);
        Veiculo carro3 = new Veiculo("Chevrolet", "Opala", 92);

        carro1.mostrar();
        System.out.println("Consumo = " + carro1.getConsumo());
        
        carro2.mostrar();
        System.out.println("Consumo = " + carro2.getConsumo());
    
        carro3.mostrar();
        System.out.println("Consumo = " + carro3.getConsumo());
    }
}
