
public class Composicao {
    public static void main(String[] args) {
        Carro carro1=new Carro("Dodge","Preto",1969, "V8");
            System.out.print(carro1.getMarca()+ "\n");            
            System.out.println(carro1.getCor());
            System.out.println(carro1.getAno());
            System.out.println(carro1.getMotor().getTipo());
    }
}
