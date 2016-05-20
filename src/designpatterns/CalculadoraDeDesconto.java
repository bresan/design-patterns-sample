package designpatterns;

public class CalculadoraDeDesconto {

	public double calcula(Orcamento orcamento) {
		// se tiver mais de 5 itens
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		} else if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 00.7;
		}
		
		return 0;
	}
}
