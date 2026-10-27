package oficina;

public class OrdemServicoFactory {

    public static IOrdemServico obterOrdemServico(String ordemServico) {
        Class<?> classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("oficina.OrdemServico" + ordemServico);
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Ordem de serviço inexistente");
        }
        if (!(objeto instanceof IOrdemServico)) {
            throw new IllegalArgumentException("Ordem de serviço inválida");
        }
        return (IOrdemServico) objeto;
    }
}
