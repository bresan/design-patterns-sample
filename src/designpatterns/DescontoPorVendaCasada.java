package designpatterns;

public class DescontoPorVendaCasada implements Desconto {

	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {
	
		boolean existeLapis, existeCaneta;
		
		existeLapis = existe("LAPIS", orcamento);
		existeCaneta = existe("CANETA", orcamento);
		
		if (existeLapis && existeCaneta) {
			return orcamento.getValor() * 0.05;
		}
		
		return proximo.desconta(orcamento);
	}
	
	private boolean existe(String nomeDoItem, Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if(item.getNome().equals(nomeDoItem)) {
				return true; 
            }
        }
        return false;
     }

	@Override
	public void setProximo(Desconto proximoDesconto) {
		this.proximo = proximoDesconto;
	}

}
