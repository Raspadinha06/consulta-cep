package principal;

public record Endereco(String cep, String logradouro,
                       String complemento, String localidade,
                       String uf) {
    @Override
    public String toString() {
        return "Cep = " + cep + ", Logradouro = " + logradouro +
                ", Complemento = " + complemento + ", Localidade = " +
                localidade + ", UF = " + uf;
    }
}
