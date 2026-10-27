package oficina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CentralOficinaTest {

    @Test
    void deveRetornarMesmaInstancia() {
        assertSame(CentralOficina.getInstance(), CentralOficina.getInstance());
    }

    @Test
    void deveRetornarNomeOficina() {
        CentralOficina.getInstance().setNomeOficina("Auto Center Central");
        assertEquals("Auto Center Central", CentralOficina.getInstance().getNomeOficina());
    }

    @Test
    void deveRetornarMecanicoPlantonista() {
        CentralOficina.getInstance().setMecanicoPlantonista("Mecânico Paulo");
        assertEquals("Mecânico Paulo", CentralOficina.getInstance().getMecanicoPlantonista());
    }

    @Test
    void deveGerarNumerosOrdemSequenciais() {
        int primeiro = CentralOficina.getInstance().gerarNumeroOrdem();
        int segundo = CentralOficina.getInstance().gerarNumeroOrdem();
        assertEquals(primeiro + 1, segundo);
    }

}
