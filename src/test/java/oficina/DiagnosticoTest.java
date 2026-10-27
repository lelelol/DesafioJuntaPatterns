package oficina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiagnosticoTest {

    @Test
    void deveSolicitarInspecaoMotor() {
        FabricaSistema fabrica = new FabricaMotor();
        Diagnostico diagnostico = new Diagnostico(fabrica);
        assertEquals("Scanner da injeção eletrônica", diagnostico.solicitarInspecao());
    }

    @Test
    void deveSolicitarInspecaoFreios() {
        FabricaSistema fabrica = new FabricaFreios();
        Diagnostico diagnostico = new Diagnostico(fabrica);
        assertEquals("Medição das pastilhas", diagnostico.solicitarInspecao());
    }

    @Test
    void deveSolicitarInspecaoEletrica() {
        FabricaSistema fabrica = new FabricaEletrica();
        Diagnostico diagnostico = new Diagnostico(fabrica);
        assertEquals("Teste de bateria", diagnostico.solicitarInspecao());
    }

    @Test
    void deveEmitirOrcamentoMotor() {
        FabricaSistema fabrica = new FabricaMotor();
        Diagnostico diagnostico = new Diagnostico(fabrica);
        assertEquals("Orçamento de motor: Troca de óleo 5W30", diagnostico.emitirOrcamento());
    }

    @Test
    void deveEmitirOrcamentoFreios() {
        FabricaSistema fabrica = new FabricaFreios();
        Diagnostico diagnostico = new Diagnostico(fabrica);
        assertEquals("Orçamento de freios: Pastilhas dianteiras", diagnostico.emitirOrcamento());
    }

    @Test
    void deveEmitirOrcamentoEletrica() {
        FabricaSistema fabrica = new FabricaEletrica();
        Diagnostico diagnostico = new Diagnostico(fabrica);
        assertEquals("Orçamento elétrico: Bateria 60Ah", diagnostico.emitirOrcamento());
    }

}
