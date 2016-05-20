package designpatterns;

public class DescontoPorVendaCasada implements Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
	
		boolean existeLapis, existeCaneta;
		
		existeLapis = existe("LAPIS", orcamento);
		existeCaneta = existe("CANETA", orcamento);
		
		if (existeLapis && existeCaneta) {
			return orcamento.getValor() * 0.05;
		}
		
		return 0;
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
		// TODO Auto-generated method stub
		
	}

}
