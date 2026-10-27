package oficina;

public abstract class OrdemServico implements IOrdemServico {

    private int numeroOrdem;
    private String veiculo;
    private String mecanicoResponsavel;
    private String pecaSubstituida;
    private Diagnostico diagnostico;
    private Servico servico;

    public OrdemServico() {
        this.numeroOrdem = CentralOficina.getInstance().gerarNumeroOrdem();
        this.mecanicoResponsavel = CentralOficina.getInstance().getMecanicoPlantonista();
        this.servico = new ServicoBase(this.getCustoBase());
    }

    public abstract float getCustoBase();

    public int getNumeroOrdem() {
        return numeroOrdem;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getMecanicoResponsavel() {
        return mecanicoResponsavel;
    }

    public void setMecanicoResponsavel(String mecanicoResponsavel) {
        this.mecanicoResponsavel = mecanicoResponsavel;
    }

    public String getPecaSubstituida() {
        return pecaSubstituida;
    }

    public void setPecaSubstituida(String pecaSubstituida) {
        this.pecaSubstituida = pecaSubstituida;
    }

    public void setSistema(FabricaSistema fabrica) {
        this.diagnostico = new Diagnostico(fabrica);
    }

    public String solicitarInspecao() {
        return this.diagnostico.solicitarInspecao();
    }

    public String emitirOrcamento() {
        return this.diagnostico.emitirOrcamento();
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public float getCusto() {
        return this.servico.getCusto();
    }
}
