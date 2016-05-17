package designpatterns;

public class ISS {
	
	public double calculaICMS(Orcamento orcamento) {
		return orcamento.getValor() * 0.6;
	}
}
