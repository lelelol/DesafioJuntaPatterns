package oficina;

public class FabricaFreios implements FabricaSistema {

    @Override
    public Inspecao createInspecao() {
        return new InspecaoFreios();
    }

    @Override
    public Orcamento createOrcamento() {
        return new OrcamentoFreios();
    }
}
