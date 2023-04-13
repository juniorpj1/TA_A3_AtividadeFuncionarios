package funcionarioterceirizado;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import funcionario.Funcionario;

public class FuncionarioTerceirizadoTest {

	@Test
	public void testConstrutorFuncionarioTerceirizado() {
		FuncionarioTerceirizado ft = new FuncionarioTerceirizado("Maria", 20, 80.0, 500.0);
		assertEquals("Maria", ft.getNome());
		assertEquals(20, ft.getHorasTrabalhadas());
		assertEquals(80.0, ft.getValorHoraTrabalhada(), 0.001);
		assertEquals(500.0, ft.getDespesaAdicional(), 0.001);
	}

	// Teste do construtor com dados válidos
	@Test
	public void testConstrutorValido() {
		FuncionarioTerceirizado ft = new FuncionarioTerceirizado("João", 40, 60.0, 500.0);
		assertEquals("João", ft.getNome());
		assertEquals(40, ft.getHorasTrabalhadas());
		assertEquals(60.0, ft.getValorHoraTrabalhada(), 0.01);
		assertEquals(500.0, ft.getDespesaAdicional(), 0.01);
	}

	// Teste do construtor com nome inválido
	@Test
	public void testConstrutorNomeInvalido() throws Exception {
		Assertions.assertThrows(IllegalArgumentException.class, () -> new FuncionarioTerceirizado("", 40, 60.0, 500.0));
	}

	// Teste do construtor com horas trabalhadas inválidas
	@Test
	public void testConstrutorHorasTrabalhadasInvalido() throws Exception {
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> new FuncionarioTerceirizado("João", 41, 60.0, 500.0));
	}

	// Teste do setter de horas trabalhadas com valor válido
	@Test
	public void testSetHorasTrabalhadasValido() {
		FuncionarioTerceirizado ft = new FuncionarioTerceirizado("João", 40, 60.0, 500.0);
		ft.setHorasTrabalhadas(30);
		assertEquals(30, ft.getHorasTrabalhadas());
	}

	// Teste do setter de horas trabalhadas com valor inválido
	@Test
	public void testSetHorasTrabalhadasInvalido() {
		FuncionarioTerceirizado ft = new FuncionarioTerceirizado("João", 40, 60.0, 500.0);
		ft.setHorasTrabalhadas(41);
		assertEquals(40, ft.getHorasTrabalhadas() );
	}

	// Teste do setter de valor hora trabalhada com valor válido
	@Test
	public void testSetValorHoraTrabalhadaValido() {
		FuncionarioTerceirizado ft = new FuncionarioTerceirizado("João", 40, 60.0, 500.0);
		ft.setValorHoraTrabalhada(70.0);
		assertEquals(70.0, ft.getValorHoraTrabalhada(), 0.01);
	}

	@Test
	public void testSetValorHoraTrabalhadaInvalido() {
		FuncionarioTerceirizado ft = new FuncionarioTerceirizado("João", 40, 60.0, 500.0);
		Assertions.assertThrows(IllegalArgumentException.class, () -> ft.setValorHoraTrabalhada(200.0));
	}

	@Test
	public void testCalcularPagamentoFuncionarioTerceirizadoValorMinimo() {
		FuncionarioTerceirizado ft = new FuncionarioTerceirizado("Maria", 30, 10.0, 500.0);
		double pagamento = ft.calcularPagamento();
		assertEquals(1320.0, pagamento, 0.01);
	}
	
	@Test
	public void testCalcularPagamentoFuncionarioTerceirizado() {
	FuncionarioTerceirizado ft = new FuncionarioTerceirizado("Maria", 30, 10.0, 500.0);
	double pagamento = ft.calcularPagamento();
	assertEquals(1375.0, pagamento, 0.01);
	}
	
	@Test
	public void testCalcularPagamentoFuncionarioTerceirizadoDespesaAdicionalMaxima() {
	FuncionarioTerceirizado ft = new FuncionarioTerceirizado("Maria", 30, 10.0, 1000.0);
	double pagamento = ft.calcularPagamento();
	assertEquals(1927.0, pagamento, 0.01);
	}
	

}