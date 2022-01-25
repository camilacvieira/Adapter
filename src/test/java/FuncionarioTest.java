import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveRetornarSkillFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.setAvaliacao("PLENO");

        assertEquals("PLENO", funcionario.getAvaliacao());
    }

    @Test
    void deveRetornarNotaFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.setAvaliacao("LIDER");

        assertEquals(9.0f, funcionario.getNota());
    }

}