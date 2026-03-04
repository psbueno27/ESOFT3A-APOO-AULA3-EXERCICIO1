class Cliente {

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void solicitarServico(Servico servico) {
        System.out.println("Cliente " + nome + " solicitou o servico.");
        servico.executarServico();
    }
}
