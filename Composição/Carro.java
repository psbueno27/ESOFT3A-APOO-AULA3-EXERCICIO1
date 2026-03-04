public class Carro {
	private String marca;
	private String cor;
	private int ano;
	private Motor motor;
	public Carro(String marca, String cor, int ano, String tipoMotor) {
		this.marca = marca;
		this.cor = cor;
		this.ano = ano;
		this.motor = new Motor(tipoMotor);
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}	
}