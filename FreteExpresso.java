package Frete;

public class FreteExpresso extends Frete {
	private int nivelUrgencia;
	
	public FreteExpresso(int distanciaKm, double valorKm, int nivelUrgencia) {
		super(distanciaKm, valorKm);
		this.nivelUrgencia = nivelUrgencia;
	}
	
	public int getnivelUrgencia() {
		return nivelUrgencia;
	}
	
	public void setnivelUrgencia(int nivelUrgencia) {
		this.nivelUrgencia = nivelUrgencia;
	}
	
	public double calcularFrete() {
		return (getDistanciaKm() *getValorKm()) + (nivelUrgencia * 100);
	}
}
