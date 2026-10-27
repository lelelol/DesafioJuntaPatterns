package oficina;

public abstract class ServicoDecorator implements Servico {

    private Servico servico;

    public ServicoDecorator(Servico servico) {
        this.servico = servico;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public abstract float getCustoAdicional();

    public float getCusto() {
        return this.servico.getCusto() + this.getCustoAdicional();
    }

    public abstract String getNomeAdicional();

    public String getDescricao() {
        return this.servico.getDescricao() + "/" + this.getNomeAdicional();
    }
}
