package oficina;

public class CentralOficina {

    private CentralOficina() {};
    private static CentralOficina instance = new CentralOficina();
    public static CentralOficina getInstance() {
        return instance;
    }

    private String nomeOficina;
    private String mecanicoPlantonista;
    private int ultimaOrdem;

    public String getNomeOficina() {
        return nomeOficina;
    }

    public void setNomeOficina(String nomeOficina) {
        this.nomeOficina = nomeOficina;
    }

    public String getMecanicoPlantonista() {
        return mecanicoPlantonista;
    }

    public void setMecanicoPlantonista(String mecanicoPlantonista) {
        this.mecanicoPlantonista = mecanicoPlantonista;
    }

    public int gerarNumeroOrdem() {
        return ++this.ultimaOrdem;
    }
}
