import java.util.ArrayList;
import java.util.List;

public class GerenciadorDespesas {
    private List<Despesa> despesas = new ArrayList<>();

    public void adicionarDespesa(Despesa despesa) {
        despesas.add(despesa);
    }

    public void excluirDespesa(int indice) {
        if (indice >= 0 && indice < despesas.size()) {
            despesas.remove(indice);
        } else {
            System.out.println("Índice inválido. Nenhuma despesa removida.");
        }
    }

    public void mostrarDespesas() {
        for (int i = 0; i < despesas.size(); i++) {
            System.out.println(i + ": " + despesas.get(i));
        }
    }

    public double calcularGastoTotal() {
        double saldoTotal = 0;
        for (Despesa despesa : despesas) {
            saldoTotal += despesa.getValor();
        }
        return saldoTotal;
    }
}
