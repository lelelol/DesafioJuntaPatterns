package oficina;

public class Alinhamento extends ServicoDecorator {

    public Alinhamento(Servico servico) {
        super(servico);
    }

    public float getCustoAdicional() {
        return 150.0f;
    }

    public String getNomeAdicional() {
        return "Alinhamento";
    }
}
