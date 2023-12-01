import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        GerenciadorDespesas gerenciador = new GerenciadorDespesas();
        MenuDespesas menuDespesas = new MenuDespesas(gerenciador);
        menuDespesas.exibirMenu();
    }
}




