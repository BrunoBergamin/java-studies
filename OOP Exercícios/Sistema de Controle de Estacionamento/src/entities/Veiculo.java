package entities;

import java.time.LocalDateTime;

public class Veiculo {

    private String placa;
    private String modelo;
    private LocalDateTime entrada;
    private LocalDateTime saida;

    public Veiculo(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
        this.entrada = LocalDateTime.now();
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public LocalDateTime getSaida() {
        return saida;
    }

    public void registrarSaida() {
        this.saida = LocalDateTime.now();
    }
}
