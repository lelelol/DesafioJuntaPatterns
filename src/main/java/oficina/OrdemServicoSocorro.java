package oficina;

public class OrdemServicoSocorro extends OrdemServico {

    public float getCustoBase() {
        return 300.0f;
    }

    public String iniciar() {
        return "Ordem de serviço de socorro iniciada para " + getVeiculo() + " com " + getMecanicoResponsavel();
    }

    public String encerrar() {
        return "Ordem de serviço de socorro encerrada. Peça substituída: " + getPecaSubstituida();
    }
}
