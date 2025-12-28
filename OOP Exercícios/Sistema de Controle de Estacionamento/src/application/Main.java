package application;

import entities.Veiculo;
import services.EstacionamentoService;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Veiculo veiculo = new Veiculo("ABC-1234", "Toyota Corolla");

        // Simula tempo estacionado
        Thread.sleep(3000);

        veiculo.registrarSaida();

        EstacionamentoService service = new EstacionamentoService();
        double valor = service.calcularValor(veiculo);

        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Entrada: " + veiculo.getEntrada());
        System.out.println("Saída: " + veiculo.getSaida());
        System.out.printf("Valor a pagar: R$ %.2f%n", valor);
    }
}
