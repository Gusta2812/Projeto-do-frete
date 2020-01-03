package Frete;

public abstract class Frete {
	private int distanciaKm;
	private double valorKm;
	
	public Frete(int distanciaKm, double valorKm) {
		this.distanciaKm = distanciaKm;
		this.valorKm = valorKm;
	}
	
	public int getDistanciaKm() {
		return distanciaKm;
	}
	
	public double getValorKm() {
		return valorKm;
	}
	
	public void setDistanciaKm(int distanciaKm) {
		this.distanciaKm = distanciaKm;
	}
	
	public void setValorKm(double valorKm) {
		this.valorKm = valorKm;
	}
	
	public abstract double calcularFrete();
}
