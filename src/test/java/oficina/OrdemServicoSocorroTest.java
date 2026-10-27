package oficina;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrdemServicoSocorroTest {

    IOrdemServico ordemServico;

    @BeforeEach
    void setUp() {
        ordemServico = OrdemServicoFactory.obterOrdemServico("Socorro");
        ordemServico.setVeiculo("Honda Civic");
        ordemServico.setMecanicoResponsavel("Mecânica Beatriz");
        ordemServico.setPecaSubstituida("Bomba de combustível");
    }

    @Test
    void deveIniciarOrdemServicoSocorro() {
        assertEquals("Ordem de serviço de socorro iniciada para Honda Civic com Mecânica Beatriz", ordemServico.iniciar());
    }

    @Test
    void deveEncerrarOrdemServicoSocorro() {
        assertEquals("Ordem de serviço de socorro encerrada. Peça substituída: Bomba de combustível", ordemServico.encerrar());
    }

    @Test
    void deveRetornarVeiculo() {
        assertEquals("Honda Civic", ordemServico.getVeiculo());
    }

    @Test
    void deveRetornarMecanicoResponsavel() {
        assertEquals("Mecânica Beatriz", ordemServico.getMecanicoResponsavel());
    }

    @Test
    void deveRetornarPecaSubstituida() {
        assertEquals("Bomba de combustível", ordemServico.getPecaSubstituida());
    }

}
