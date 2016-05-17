package designpatterns;

public class CalculadorDeImpostos {

	public void realizaCalculo(Orcamento orcamento, String imposto) {
		
		if (imposto.equals("ICMS")) {
			double icms = new ICMS().calculaICMS(orcamento);
			System.out.println(icms);
		} else if (imposto.equals("ISS")) {
			double iss = new ISS().calculaISS(orcamento);
			System.out.println(iss);
		}
	}
	
}
