package Frete;

public class Cadastro {
	private Frete [] f = new Frete [10];
	private int indice = 0;
	
	public void add(Frete frete) {
		if(indice < f.length) {
			f[indice++] = frete;
		}
	}
	
	public double calcularTot() {
		double soma = 0;
		for(int i = 0; i < indice; i++) {
			soma += f[i].calcularFrete(); //Poliformismo 
		}
		return soma;
	}
}
