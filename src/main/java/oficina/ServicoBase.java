package oficina;

public class ServicoBase implements Servico {

    private float custo;

    public ServicoBase() {
    }

    public ServicoBase(float custo) {
        this.custo = custo;
    }

    public float getCusto() {
        return custo;
    }

    public String getDescricao() {
        return "Avaliação mecânica";
    }

}
