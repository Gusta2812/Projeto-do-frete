package Frete;

public class FreteSuperExpresso extends FreteExpresso{
	private int valorSeguro;
	
	public FreteSuperExpresso(int distanciaKm, double valorKm, int nivelUrgencia, int valorSeguro) {
		super(distanciaKm, valorKm, nivelUrgencia);
		this.valorSeguro = valorSeguro;
	}
	
	public double calcular() {
		return super.calcularFrete() + valorSeguro;
	}
}
