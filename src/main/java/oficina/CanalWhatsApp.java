package oficina;

public class CanalWhatsApp implements CanalEnvio {

    public String enviar(String mensagem) {
        return "WhatsApp: " + mensagem;
    }
}
