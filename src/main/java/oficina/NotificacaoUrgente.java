package oficina;

public class NotificacaoUrgente extends Notificacao {

    public NotificacaoUrgente(String mensagem) {
        super(mensagem);
    }

    public String enviar() {
        return this.canal.enviar("[URGENTE] " + this.mensagem.toUpperCase());
    }
}
