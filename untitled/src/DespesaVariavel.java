public class DespesaVariavel extends Despesa {
    private int parcelas;

    public DespesaVariavel(String data, String categoria, double valor, int parcelas) {
        super(data, categoria, valor);
        this.parcelas = parcelas;
    }

    @Override
    public String getTipo() {
        return "Despesa Variável";
    }


    @Override
    public String toString() {
        return "Data: " + data + ", Categoria: " + categoria + ", Valor: " + valor + ", Parcelas: " + parcelas;
    }
}