package oficina;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrdemServicoGarantiaTest {

    IOrdemServico ordemServico;

    @BeforeEach
    void setUp() {
        ordemServico = OrdemServicoFactory.obterOrdemServico("Garantia");
        ordemServico.setVeiculo("Fiat Uno");
        ordemServico.setMecanicoResponsavel("Mecânico Paulo");
        ordemServico.setPecaSubstituida("Filtro de óleo");
    }

    @Test
    void deveIniciarOrdemServicoGarantia() {
        assertEquals("Ordem de serviço em garantia iniciada para Fiat Uno com Mecânico Paulo", ordemServico.iniciar());
    }

    @Test
    void deveEncerrarOrdemServicoGarantia() {
        assertEquals("Ordem de serviço em garantia encerrada. Peça substituída: Filtro de óleo", ordemServico.encerrar());
    }

    @Test
    void deveRetornarVeiculo() {
        assertEquals("Fiat Uno", ordemServico.getVeiculo());
    }

    @Test
    void deveRetornarMecanicoResponsavel() {
        assertEquals("Mecânico Paulo", ordemServico.getMecanicoResponsavel());
    }

    @Test
    void deveRetornarPecaSubstituida() {
        assertEquals("Filtro de óleo", ordemServico.getPecaSubstituida());
    }

}
