package oficina;

public class CanalSMS implements CanalEnvio {

    public String enviar(String mensagem) {
        return "SMS: " + mensagem;
    }
}
