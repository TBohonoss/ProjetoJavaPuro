package subsistema2.cpe;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Valparaíso de Goiás";
    }

    public String recuperarEstado(String cep) {
        return "GO";
    }
}
