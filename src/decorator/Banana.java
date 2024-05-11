package decorator;

public class Banana extends DecoratorAcai{

    private String descricao = ", Banana";
    private double preco = 1.50;

    public Banana(Acai acai) {
        super(acai);
    }

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
        return acai.getDescricao() + descricao;
    }

    @Override
    public double getPreco() {
        return acai.getPreco() + preco;
    }
}
