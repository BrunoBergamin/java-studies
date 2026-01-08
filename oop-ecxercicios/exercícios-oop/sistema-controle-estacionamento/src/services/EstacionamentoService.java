package services;

import entities.Veiculo;

import java.time.Duration;

public class EstacionamentoService {

    private static final double PRIMEIRA_HORA = 10.0;
    private static final double HORA_ADICIONAL = 5.0;

    public double calcularValor(Veiculo veiculo) {

        Duration duracao = Duration.between(
                veiculo.getEntrada(),
                veiculo.getSaida()
        );

        long minutos = duracao.toMinutes();
        long horas = (minutos / 60);

        if (minutos % 60 != 0) {
            horas++;
        }

        if (horas <= 1) {
            return PRIMEIRA_HORA;
        }

        return PRIMEIRA_HORA + (horas - 1) * HORA_ADICIONAL;
    }
}
