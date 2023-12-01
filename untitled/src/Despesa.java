import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Despesa {
    public  String data;
    public String categoria;
    public double valor;

    public Despesa(String data, String categoria, double valor) {
        this.data = data;
        this.categoria = categoria;
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getValor() {
        return valor;
    }

    public abstract String getTipo();

    public String toString() {
        return "Data: " + data + ", Categoria: " + categoria + ", Valor: " + valor;
    }
}
