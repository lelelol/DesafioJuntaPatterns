package oficina;

public class CanalEmail implements CanalEnvio {

    public String enviar(String mensagem) {
        return "E-mail: " + mensagem;
    }
}
