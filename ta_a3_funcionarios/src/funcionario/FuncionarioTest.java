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
    public void testConstrutorInvalido() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Funcionario("", 40, 60.0));
    }
	
	@Test
    public void testSetNome() {
        Funcionario f = new Funcionario("João", 40, 60.0);
        f.setNome("José");
        assertEquals("José", f.getNome());
    }
	
}