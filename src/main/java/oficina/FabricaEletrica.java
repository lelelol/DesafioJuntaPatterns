package oficina;

public class FabricaEletrica implements FabricaSistema {

    @Override
    public Inspecao createInspecao() {
        return new InspecaoEletrica();
    }

    @Override
    public Orcamento createOrcamento() {
        return new OrcamentoEletrica();
    }
}
