package oficina;

public abstract class Notificacao {

    protected CanalEnvio canal;

    protected String mensagem;

    public Notificacao(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setCanal(CanalEnvio canal) {
        this.canal = canal;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public abstract String enviar();
}
