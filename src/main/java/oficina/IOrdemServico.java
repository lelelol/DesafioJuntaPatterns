package oficina;

public interface IOrdemServico {
    String iniciar();
    String encerrar();

    int getNumeroOrdem();

    String getVeiculo();
    void setVeiculo(String veiculo);

    String getMecanicoResponsavel();
    void setMecanicoResponsavel(String mecanicoResponsavel);

    String getPecaSubstituida();
    void setPecaSubstituida(String pecaSubstituida);

    void setSistema(FabricaSistema fabrica);
    String solicitarInspecao();
    String emitirOrcamento();

    Servico getServico();
    void setServico(Servico servico);
    float getCusto();
}
