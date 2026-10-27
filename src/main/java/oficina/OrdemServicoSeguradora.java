package oficina;

public class OrdemServicoSeguradora extends OrdemServico {

    public float getCustoBase() {
        return 150.0f;
    }

    public String iniciar() {
        return "Ordem de serviço por seguradora iniciada para " + getVeiculo() + " com " + getMecanicoResponsavel();
    }

    public String encerrar() {
        return "Ordem de serviço por seguradora encerrada. Peça substituída: " + getPecaSubstituida();
    }
}
