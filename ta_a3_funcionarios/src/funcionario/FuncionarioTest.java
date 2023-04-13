package funcionario;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class FuncionarioTest {

	@Test
	@DisplayName("Teste para o construtor válido")
    public void testConstrutorValido() {
        Funcionario f = new Funcionario("João", 40, 60.0);
        assertEquals("João", f.getNome());
        assertEquals(40, f.getHorasTrabalhadas());
        assertEquals(60.0, f.getValorHoraTrabalhada());
    }
	
	@Test
	@DisplayName("Teste para o construtor inválido")
    public void testConstrutorInvalido()  throws Exception{
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Funcionario("", 40, 60.0));
    }
	
	@Test
	@DisplayName("Teste para setNome válido")
    public void testSetNome() {
        Funcionario f = new Funcionario("João", 40, 60.0);
        f.setNome("José");
        assertEquals("José", f.getNome());
    }
	
	@Test
	@DisplayName("Teste para setHorasTrabalhadas válido")
    public void testSetHorasTrabalhadas() {
        Funcionario f = new Funcionario("João", 40, 60.0);
        f.setHorasTrabalhadas(30);
        assertEquals(30, f.getHorasTrabalhadas());
    }
	
	
	 @Test
	 @DisplayName("Teste para setValorHoraTrabalhada válido")
	    public void testSetValorHoraTrabalhada() {
	        Funcionario f = new Funcionario("João", 40, 60.0);
	        f.setValorHoraTrabalhada(50.0);
	        assertEquals(50.0, f.getValorHoraTrabalhada(), 0.001);
	    }
	 
	 @Test
	 @DisplayName("Teste para calcularPagamentoFuncionario válido")
	    public void testCalcularPagamentoFuncionario() {
	        Funcionario f = new Funcionario("João", 40, 60.0);
	        assertEquals(2400.0, f.calcularPagamento(), 0.001);
	        f.setHorasTrabalhadas(50);
	        assertEquals(2640.0, f.calcularPagamento(), 0.001);
	    }
	 
	 @Test
	 @DisplayName("Teste para calcularPagamentoFuncionarioValorMinimo")
	 public void testCalcularPagamentoFuncionarioValorMinimo() throws Exception {
		 Funcionario f = new Funcionario("João", 30, 44.0);
		 Assertions.assertThrows(Exception.class, () -> f.calcularPagamento());
	 }
	 
	 @Test
	 	public void testCalcularPagamentoFuncionarioMaxHoras() throws Exception{
		 Funcionario f = new Funcionario("João", 50, 50.0);
		 Assertions.assertThrows(Exception.class, () -> f.calcularPagamento());
	 }
	 
	 @Test
	 
	 public void testCalcularPagamentoFuncionarioValorHoraTrabalhada() throws Exception {
	
		 Funcionario f = new Funcionario("João", 40, 20.0);
	 Assertions.assertThrows(Exception.class, () -> f.calcularPagamento());
	 }
	 
	 @Test
	 public void testConstrutorFuncionarioHorasTrabalhadasExcedidas() throws Exception {
	 Funcionario f = new Funcionario("João", 50, 60.0);
	 Assertions.assertThrows(Exception.class, () -> f.validaHorasTrabalhadas(999));
	 }
	 

	@Test
		public void testConstrutorFuncionarioValorHoraInvalido() throws Exception {
		Funcionario f = new Funcionario("João", 40, 200.0);
		Assertions.assertThrows(Exception.class, () -> f.validaValorHoraTrabalhada(50));
	}	
	
	@Test
		public void testSetHorasTrabalhadasInvalido() throws Exception {
		Funcionario f = new Funcionario("João", 40, 60.0);
		Assertions.assertThrows(Exception.class, () -> f.setHorasTrabalhadas(999));
		 
	}
	
	@Test
	public void testSetValorHoraTrabalhadaInvalido() throws Exception {
	Funcionario f = new Funcionario("João", 40, 60.0);
	Assertions.assertThrows(Exception.class, () -> f.setValorHoraTrabalhada(999));

	}
	
	
	 
	 
	 
	
}