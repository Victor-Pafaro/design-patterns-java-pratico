package strategy;

public class FreteSedex implements FreteStrategy {
    @Override
    public double calcular(double valorPedido) {
        return 30.0 + (valorPedido * 0.05);
    }
}