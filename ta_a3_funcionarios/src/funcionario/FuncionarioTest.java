package funcionario;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FuncionarioTest {

	@Test
    public void testConstrutorFuncionario() {
        Funcionario f = new Funcionario("João", 40, 60.0);
        assertEquals("João", f.getNome());
        assertEquals(40, f.getHorasTrabalhadas());
        assertEquals(60.0, f.getValorHoraTrabalhada(), 0.001);
    }
	
}
