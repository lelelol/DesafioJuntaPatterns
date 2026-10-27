package oficina;

public class Balanceamento extends ServicoDecorator {

    public Balanceamento(Servico servico) {
        super(servico);
    }

    public float getCustoAdicional() {
        return 120.0f;
    }

    public String getNomeAdicional() {
        return "Balanceamento";
    }
}
