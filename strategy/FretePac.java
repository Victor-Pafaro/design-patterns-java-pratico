package strategy;

public class FretePac implements FreteStrategy {
    @Override
    public double calcular(double valorPedido) {
        return 15.0 + (valorPedido * 0.02);
    }
}