# 🚀 Padrões de Projeto em Java (Design Patterns)

Este repositório contém uma implementação prática de **Padrões de Projeto (Design Patterns)** utilizando **Java Puro**, desenvolvida para consolidar conceitos de arquitetura de software, baixo acoplamento, alta coesão e princípios SOLID (como o *Open/Closed Principle*).

## 🧠 Padrões Implementados

O projeto simula um fluxo simplificado de processamento de pedidos, aplicando três padrões clássicos da engenharia de software:

* **Singleton (`package singleton`):** Garante que a classe `ConfiguracaoSistema` tenha apenas uma única instância global em toda a aplicação, centralizando o controle do ambiente de execução.
* **Strategy (`package strategy`):** Isola diferentes algoritmos de cálculo de frete (`FreteSedex` e `FretePac`) através da interface `FreteStrategy`, permitindo alternar regras de negócio em tempo de execução e adicionar novas modalidades sem alterar o código existente.
* **Facade (`package facade`):** A classe `PedidoFacade` fornece uma interface unificada e simples para o cliente, abstraindo a complexidade da comunicação entre os subsistemas externos (`CepApi` e `CrmService`) e os cálculos de frete.

## 📂 Estrutura do Projeto

```text
design-patterns-java-pratico/
├── facade/
│   └── PedidoFacade.java
├── singleton/
│   └── ConfiguracaoSistema.java
├── strategy/
│   ├── FretePac.java
│   ├── FreteSedex.java
│   └── FreteStrategy.java
├── subsystem/
│   ├── CepApi.java
│   └── CrmService.java
├── Main.java
└── README.md