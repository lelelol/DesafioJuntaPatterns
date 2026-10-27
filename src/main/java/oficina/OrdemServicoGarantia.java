package oficina;

public class OrdemServicoGarantia extends OrdemServico {

    public float getCustoBase() {
        return 0.0f;
    }

    public String iniciar() {
        return "Ordem de serviço em garantia iniciada para " + getVeiculo() + " com " + getMecanicoResponsavel();
    }

    public String encerrar() {
        return "Ordem de serviço em garantia encerrada. Peça substituída: " + getPecaSubstituida();
    }
}
