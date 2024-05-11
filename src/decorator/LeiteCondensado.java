package decorator;

public class LeiteCondensado extends DecoratorAcai{

    private String descricao = ", Leite Condensado";
    private double preco = 2.00;

    protected LeiteCondensado(Acai acai) {
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
