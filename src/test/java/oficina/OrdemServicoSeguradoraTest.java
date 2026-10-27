package oficina;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrdemServicoSeguradoraTest {

    IOrdemServico ordemServico;

    @BeforeEach
    void setUp() {
        ordemServico = OrdemServicoFactory.obterOrdemServico("Seguradora");
        ordemServico.setVeiculo("Toyota Corolla");
        ordemServico.setMecanicoResponsavel("Mecânico Carlos");
        ordemServico.setPecaSubstituida("Para-choque dianteiro");
    }

    @Test
    void deveIniciarOrdemServicoSeguradora() {
        assertEquals("Ordem de serviço por seguradora iniciada para Toyota Corolla com Mecânico Carlos", ordemServico.iniciar());
    }

    @Test
    void deveEncerrarOrdemServicoSeguradora() {
        assertEquals("Ordem de serviço por seguradora encerrada. Peça substituída: Para-choque dianteiro", ordemServico.encerrar());
    }

    @Test
    void deveRetornarVeiculo() {
        assertEquals("Toyota Corolla", ordemServico.getVeiculo());
    }

    @Test
    void deveRetornarMecanicoResponsavel() {
        assertEquals("Mecânico Carlos", ordemServico.getMecanicoResponsavel());
    }

    @Test
    void deveRetornarPecaSubstituida() {
        assertEquals("Para-choque dianteiro", ordemServico.getPecaSubstituida());
    }

}
