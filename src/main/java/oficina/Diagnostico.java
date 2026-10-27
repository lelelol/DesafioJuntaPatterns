package oficina;

public class Diagnostico {

    private Inspecao inspecao;
    private Orcamento orcamento;

    public Diagnostico(FabricaSistema fabrica) {
        this.inspecao = fabrica.createInspecao();
        this.orcamento = fabrica.createOrcamento();
    }

    public String solicitarInspecao() {
        return this.inspecao.solicitar();
    }

    public String emitirOrcamento() {
        return this.orcamento.emitir();
    }
}
