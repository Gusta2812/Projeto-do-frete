package Frete;

public class Main {
	public static void main(String[] args) {
		Cadastro ca = new Cadastro();
		Frete fp = new FretePadrao(5, 10); //50
		Frete fx = new FreteExpresso(3, 5, 6); // 615
		Frete fsx = new FreteSuperExpresso(5, 3, 5, 6); // 521
		
		ca.add(fp);
		ca.add(fx);
		ca.add(fsx);
		
		System.out.println("Valor total dos Frestes : " +ca.calcularTot());
		
	}
}
