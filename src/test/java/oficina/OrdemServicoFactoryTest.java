package oficina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrdemServicoFactoryTest {

    @Test
    void deveRetornarExcecaoParaOrdemServicoInexistente() {
        try {
            IOrdemServico ordemServico = OrdemServicoFactory.obterOrdemServico("Funilaria");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Ordem de serviço inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaOrdemServicoInvalida() {
        try {
            IOrdemServico ordemServico = OrdemServicoFactory.obterOrdemServico("Bicicleta");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Ordem de serviço inválida", e.getMessage());
        }
    }
}
