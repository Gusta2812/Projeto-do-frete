package Frete;

public class FretePadrao extends Frete {
	
	public FretePadrao(int distanciaKm, double valorKm) {
		super(distanciaKm, valorKm);
	}
	
	public double calcularFrete() {
		return getDistanciaKm() * getValorKm();
	}

}
