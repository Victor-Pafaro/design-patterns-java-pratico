package facade;

import singleton.ConfiguracaoSistema;
import strategy.FreteStrategy;
import subsystem.CepApi;
import subsystem.CrmService;

public class PedidoFacade {

    public void finalizarPedido(String nome, String cep, double valorPedido, FreteStrategy estrategiaFrete) {
        System.out.println("Ambiente atual: " + ConfiguracaoSistema.getInstancia().getAmbiente());

        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        double valorFrete = estrategiaFrete.calcular(valorPedido);
        double total = valorPedido + valorFrete;

        CrmService.gravarCliente(nome, cep, cidade, estado);

        System.out.println("Pedido finalizado com sucesso! Total a pagar: R$ " + total);
        System.out.println("--------------------------------------------------");
    }
}