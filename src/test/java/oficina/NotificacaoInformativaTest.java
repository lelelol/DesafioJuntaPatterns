package oficina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoInformativaTest {

    @Test
    void deveEnviarNotificacaoInformativaPorSMS() {
        CanalEnvio canal = new CanalSMS();
        NotificacaoInformativa notificacao = new NotificacaoInformativa("Veículo XYZ-9876 em manutenção");
        notificacao.setCanal(canal);
        assertEquals("SMS: [INFO] Veículo XYZ-9876 em manutenção", notificacao.enviar());
    }

    @Test
    void deveEnviarNotificacaoInformativaPorEmail() {
        CanalEnvio canal = new CanalEmail();
        NotificacaoInformativa notificacao = new NotificacaoInformativa("Veículo XYZ-9876 em manutenção");
        notificacao.setCanal(canal);
        assertEquals("E-mail: [INFO] Veículo XYZ-9876 em manutenção", notificacao.enviar());
    }

    @Test
    void deveEnviarNotificacaoInformativaPorWhatsApp() {
        CanalEnvio canal = new CanalWhatsApp();
        NotificacaoInformativa notificacao = new NotificacaoInformativa("Veículo XYZ-9876 em manutenção");
        notificacao.setCanal(canal);
        assertEquals("WhatsApp: [INFO] Veículo XYZ-9876 em manutenção", notificacao.enviar());
    }

}
