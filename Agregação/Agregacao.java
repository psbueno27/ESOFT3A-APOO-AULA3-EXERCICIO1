public class Agregacao {
    public static void main(String[] args) {
        Escola faculdade = new Escola ("UniCesumar");
        Professor professor1 = new Professor ("Flores-APOO");
        Professor professor2 = new Professor ("Sidnei-Estruturas de Dados");

        faculdade.adicionarProfessor(professor1);
        faculdade.adicionarProfessor(professor2);

        faculdade.listarProfessores();
    }
}
