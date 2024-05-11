package decorator;

public class AcaiPequeno implements Acai {

    private String descricao = "Açaí pequeno";
    private double preco = 4.50;

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
