package decorator;

import java.text.NumberFormat;

public class AcaiStore {

    public static void main(String[] args) {

        Acai acai = new AcaiPequeno();
        Acai pedidoCliente = new LeiteCondensado(new Morango(acai));
        System.out.println(pedidoCliente.getDescricao() + "\nValor Total "+ NumberFormat.getCurrencyInstance().format(pedidoCliente.getPreco()));
    }
}
