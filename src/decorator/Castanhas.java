package decorator;

public class Castanhas extends DecoratorAcai{

    private String descricao = ", Castanhas";
    private double preco = 3.55;

    public Castanhas(Acai acai) {
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
