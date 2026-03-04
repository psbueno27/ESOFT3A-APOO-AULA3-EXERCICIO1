public class Dependencia {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Pedro");
        Servico servico = new Servico();

        cliente1.solicitarServico(servico);
    }
}
