package decorator;

public class LeiteEmPo extends DecoratorAcai{

    private String descricao = ", Leite em Pó";
    private double preco = 2.60;

    public LeiteEmPo(Acai acai) {
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
