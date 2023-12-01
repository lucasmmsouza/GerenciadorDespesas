class DespesaFixa extends Despesa {
    private String vencimento;

    public DespesaFixa(String data, String categoria, double valor, String vencimento) {
        super(data, categoria, valor);
        this.vencimento = vencimento;
    }

    @Override
    public String getTipo() {
        return "Despesa Fixa";
    }


    @Override
    public String toString() {
        return "Data: " + data + ", Categoria: " + categoria + ", Valor: " + valor +", Vencimento: " + vencimento;
    }
}