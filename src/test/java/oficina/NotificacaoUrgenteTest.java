package oficina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoUrgenteTest {

    @Test
    void deveEnviarNotificacaoUrgentePorSMS() {
        CanalEnvio canal = new CanalSMS();
        NotificacaoUrgente notificacao = new NotificacaoUrgente("Veículo ABC-1234 com superaquecimento no motor");
        notificacao.setCanal(canal);
        assertEquals("SMS: [URGENTE] VEÍCULO ABC-1234 COM SUPERAQUECIMENTO NO MOTOR", notificacao.enviar());
    }

    @Test
    void deveEnviarNotificacaoUrgentePorEmail() {
        CanalEnvio canal = new CanalEmail();
        NotificacaoUrgente notificacao = new NotificacaoUrgente("Veículo ABC-1234 com superaquecimento no motor");
        notificacao.setCanal(canal);
        assertEquals("E-mail: [URGENTE] VEÍCULO ABC-1234 COM SUPERAQUECIMENTO NO MOTOR", notificacao.enviar());
    }

    @Test
    void deveEnviarNotificacaoUrgentePorWhatsApp() {
        CanalEnvio canal = new CanalWhatsApp();
        NotificacaoUrgente notificacao = new NotificacaoUrgente("Veículo ABC-1234 com superaquecimento no motor");
        notificacao.setCanal(canal);
        assertEquals("WhatsApp: [URGENTE] VEÍCULO ABC-1234 COM SUPERAQUECIMENTO NO MOTOR", notificacao.enviar());
    }

}
