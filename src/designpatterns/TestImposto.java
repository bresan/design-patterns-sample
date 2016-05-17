package designpatterns;

import org.junit.Assert;
import org.junit.Test;


public class TestImposto {
	
	@Test
	public void testImpostoWithBasicValues() {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Imposto iccc = new ICCC();
		
		Orcamento orcamento = new Orcamento(500.0);
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		double calculoIss = calculador.realizaCalculo(orcamento, iss);
		double calculoIcms = calculador.realizaCalculo(orcamento, icms);
		double calculoIccc = calculador.realizaCalculo(orcamento, iccc);
		
		System.out.println(calculoIccc);
		
		Assert.assertEquals(calculoIss, 30, 0.0001);
		Assert.assertEquals(calculoIcms, 50, 0.0001);
		Assert.assertEquals(calculoIccc, 25, 0.0001);
	}
	
	@Test
	public void testImpostoWithZeroValues() {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		
		Orcamento orcamento = new Orcamento(0.0);
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		double calculoIss = calculador.realizaCalculo(orcamento, iss);
		double calculoIcms = calculador.realizaCalculo(orcamento, icms);
		
		Assert.assertEquals(calculoIss, 0, 0.0001);
		Assert.assertEquals(calculoIcms, 0, 0.0001);
	}
}
