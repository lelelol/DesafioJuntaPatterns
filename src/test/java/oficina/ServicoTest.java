package oficina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoTest {

    @Test
    void deveRetornarCustoServico() {
        Servico servico = new ServicoBase(100.0f);

        assertEquals(100.0f, servico.getCusto());
    }

    @Test
    void deveRetornarCustoServicoComLavagem() {
        Servico servico = new Lavagem(new ServicoBase(100.0f));

        assertEquals(180.0f, servico.getCusto());
    }

    @Test
    void deveRetornarCustoServicoComAlinhamento() {
        Servico servico = new Alinhamento(new ServicoBase(100.0f));

        assertEquals(250.0f, servico.getCusto());
    }

    @Test
    void deveRetornarCustoServicoComBalanceamento() {
        Servico servico = new Balanceamento(new ServicoBase(100.0f));

        assertEquals(220.0f, servico.getCusto());
    }

    @Test
    void deveRetornarCustoServicoComLavagemMaisAlinhamento() {
        Servico servico = new Alinhamento(new Lavagem(new ServicoBase(100.0f)));

        assertEquals(330.0f, servico.getCusto());
    }

    @Test
    void deveRetornarCustoServicoComAlinhamentoMaisBalanceamento() {
        Servico servico = new Balanceamento(new Alinhamento(new ServicoBase(100.0f)));

        assertEquals(370.0f, servico.getCusto());
    }

    @Test
    void deveRetornarCustoServicoComLavagemMaisBalanceamento() {
        Servico servico = new Balanceamento(new Lavagem(new ServicoBase(100.0f)));

        assertEquals(300.0f, servico.getCusto());
    }

    @Test
    void deveRetornarCustoServicoComLavagemMaisAlinhamentoMaisBalanceamento() {
        Servico servico = new Balanceamento(new Alinhamento(new Lavagem(new ServicoBase(100.0f))));

        assertEquals(450.0f, servico.getCusto());
    }

    @Test
    void deveRetornarDescricaoServico() {
        Servico servico = new ServicoBase();

        assertEquals("Avaliação mecânica", servico.getDescricao());
    }

    @Test
    void deveRetornarDescricaoServicoComLavagem() {
        Servico servico = new Lavagem(new ServicoBase());

        assertEquals("Avaliação mecânica/Lavagem", servico.getDescricao());
    }

    @Test
    void deveRetornarDescricaoServicoComAlinhamento() {
        Servico servico = new Alinhamento(new ServicoBase());

        assertEquals("Avaliação mecânica/Alinhamento", servico.getDescricao());
    }

    @Test
    void deveRetornarDescricaoServicoComBalanceamento() {
        Servico servico = new Balanceamento(new ServicoBase());

        assertEquals("Avaliação mecânica/Balanceamento", servico.getDescricao());
    }

    @Test
    void deveRetornarDescricaoServicoComLavagemMaisAlinhamento() {
        Servico servico = new Alinhamento(new Lavagem(new ServicoBase()));

        assertEquals("Avaliação mecânica/Lavagem/Alinhamento", servico.getDescricao());
    }

    @Test
    void deveRetornarDescricaoServicoComAlinhamentoMaisBalanceamento() {
        Servico servico = new Balanceamento(new Alinhamento(new ServicoBase()));

        assertEquals("Avaliação mecânica/Alinhamento/Balanceamento", servico.getDescricao());
    }

    @Test
    void deveRetornarDescricaoServicoComLavagemMaisBalanceamento() {
        Servico servico = new Balanceamento(new Lavagem(new ServicoBase()));

        assertEquals("Avaliação mecânica/Lavagem/Balanceamento", servico.getDescricao());
    }

    @Test
    void deveRetornarDescricaoServicoComLavagemMaisAlinhamentoMaisBalanceamento() {
        Servico servico = new Balanceamento(new Alinhamento(new Lavagem(new ServicoBase())));

        assertEquals("Avaliação mecânica/Lavagem/Alinhamento/Balanceamento", servico.getDescricao());
    }

}
