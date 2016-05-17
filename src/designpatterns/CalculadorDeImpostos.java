package designpatterns;

public class CalculadorDeImpostos {

	public double realizaCalculo(Orcamento orcamento, Imposto imposto) {
		double icms = imposto.calcula(orcamento);
		return icms;
	}

}
