import facade.PedidoFacade;
import strategy.FreteStrategy;
import strategy.FreteSedex;
import strategy.FretePac;

public class Main {
    public static void main(String[] args) {
        PedidoFacade facade = new PedidoFacade();

        FreteStrategy sedex = new FreteSedex();
        facade.finalizarPedido("Victor", "13000-000", 250.0, sedex);

        FreteStrategy pac = new FretePac();
        facade.finalizarPedido("Renan", "13050-000", 150.0, pac);
    }
}