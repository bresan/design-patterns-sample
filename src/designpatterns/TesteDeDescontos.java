package designpatterns;

public class TesteDeDescontos {

	public static void main(String[] args) {
		CalculadoraDeDesconto descontos = new CalculadoraDeDesconto();
		
		Orcamento orcamento = new Orcamento(600.0);
		orcamento.adicionaItem(new Item("Livro", 250.0));
		orcamento.adicionaItem(new Item("Papel", 250.0));

		double descontoFinal = descontos.calcula(orcamento);
		System.out.println(descontoFinal);
	}

}
