package oficina;

public class FabricaMotor implements FabricaSistema {

    @Override
    public Inspecao createInspecao() {
        return new InspecaoMotor();
    }

    @Override
    public Orcamento createOrcamento() {
        return new OrcamentoMotor();
    }
}
