package oficina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrdemServicoTest {

    // Factory Method + Singleton

    @Test
    void deveGerarNumeroOrdemPelaCentral() {
        IOrdemServico ordemServico1 = OrdemServicoFactory.obterOrdemServico("Garantia");
        IOrdemServico ordemServico2 = OrdemServicoFactory.obterOrdemServico("Seguradora");
        assertEquals(ordemServico1.getNumeroOrdem() + 1, ordemServico2.getNumeroOrdem());
    }

    @Test
    void deveUsarMecanicoPlantonistaDaCentral() {
        CentralOficina.getInstance().setMecanicoPlantonista("Mecânico Paulo");
        IOrdemServico ordemServico = OrdemServicoFactory.obterOrdemServico("Socorro");
        assertEquals("Mecânico Paulo", ordemServico.getMecanicoResponsavel());
    }

    @Test
    void deveTrocarMecanicoResponsavel() {
        CentralOficina.getInstance().setMecanicoPlantonista("Mecânico Paulo");
        IOrdemServico ordemServico = OrdemServicoFactory.obterOrdemServico("Socorro");
        ordemServico.setMecanicoResponsavel("Mecânico Carlos");
        assertEquals("Mecânico Carlos", ordemServico.getMecanicoResponsavel());
    }

    // Factory Method + Abstract Factory

    @Test
    void deveSolicitarInspecaoMotor() {
        IOrdemServico ordemServico = OrdemServicoFactory.obterOrdemServico("Seguradora");
        ordemServico.setSistema(new FabricaMotor());
        assertEquals("Scanner da injeção eletrônica", ordemServico.solicitarInspecao());
    }

    @Test
    void deveEmitirOrcamentoEletrica() {
        IOrdemServico ordemServico = OrdemServicoFactory.obterOrdemServico("Garantia");
        ordemServico.setSistema(new FabricaEletrica());
        assertEquals("Orçamento elétrico: Bateria 60Ah", ordemServico.emitirOrcamento());
    }

    // Factory Method + Decorator

    @Test
    void deveRetornarCustoBaseGarantia() {
        IOrdemServico ordemServico = OrdemServicoFactory.obterOrdemServico("Garantia");
        assertEquals(0.0f, ordemServico.getCusto());
    }

    @Test
    void deveRetornarCustoBaseSeguradora() {
        IOrdemServico ordemServico = OrdemServicoFactory.obterOrdemServico("Seguradora");
        assertEquals(150.0f, ordemServico.getCusto());
    }

    @Test
    void deveRetornarCustoBaseSocorro() {
        IOrdemServico ordemServico = OrdemServicoFactory.obterOrdemServico("Socorro");
        assertEquals(300.0f, ordemServico.getCusto());
    }

    @Test
    void deveSomarServicosAoCusto() {
        IOrdemServico ordemServico = OrdemServicoFactory.obterOrdemServico("Socorro");
        ordemServico.setServico(new Alinhamento(ordemServico.getServico()));
        ordemServico.setServico(new Balanceamento(ordemServico.getServico()));
        assertEquals(570.0f, ordemServico.getCusto());
    }

    @Test
    void deveRetornarDescricaoServicos() {
        IOrdemServico ordemServico = OrdemServicoFactory.obterOrdemServico("Socorro");
        ordemServico.setServico(new Alinhamento(ordemServico.getServico()));
        ordemServico.setServico(new Balanceamento(ordemServico.getServico()));
        assertEquals("Avaliação mecânica/Alinhamento/Balanceamento", ordemServico.getServico().getDescricao());
    }

    // Todos juntos

    @Test
    void deveRealizarOrdemServicoCompleta() {
        CentralOficina.getInstance().setMecanicoPlantonista("Mecânica Beatriz");

        IOrdemServico ordemServico = OrdemServicoFactory.obterOrdemServico("Socorro");
        ordemServico.setVeiculo("Honda Civic");
        ordemServico.setSistema(new FabricaFreios());
        ordemServico.setServico(new Lavagem(ordemServico.getServico()));
        ordemServico.setServico(new Alinhamento(ordemServico.getServico()));

        assertEquals("Ordem de serviço de socorro iniciada para Honda Civic com Mecânica Beatriz", ordemServico.iniciar());
        assertEquals("Medição das pastilhas", ordemServico.solicitarInspecao());
        assertEquals("Orçamento de freios: Pastilhas dianteiras", ordemServico.emitirOrcamento());
        assertEquals("Avaliação mecânica/Lavagem/Alinhamento", ordemServico.getServico().getDescricao());
        assertEquals(530.0f, ordemServico.getCusto());
    }

}
