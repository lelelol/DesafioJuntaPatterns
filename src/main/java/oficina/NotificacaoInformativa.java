package oficina;

public class NotificacaoInformativa extends Notificacao {

    public NotificacaoInformativa(String mensagem) {
        super(mensagem);
    }

    public String enviar() {
        return this.canal.enviar("[INFO] " + this.mensagem);
    }
}
