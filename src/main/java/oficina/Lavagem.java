package oficina;

public class Lavagem extends ServicoDecorator {

    public Lavagem(Servico servico) {
        super(servico);
    }

    public float getCustoAdicional() {
        return 80.0f;
    }

    public String getNomeAdicional() {
        return "Lavagem";
    }
}
