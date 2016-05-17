package designpatterns;

public class CalculadorDeImpostos {

	public void realizaCalculo(Orcamento orcamento, String imposto) {
		
		if (imposto.equals("ICMS")) {
			double icms = orcamento.getValor() * 0.1;
			System.out.println(icms);
		} else if (imposto.equals("ISS")) {
			double iss = orcamento.getValor() * 0.6;
			System.out.println(iss);
		}
	}
	
}
