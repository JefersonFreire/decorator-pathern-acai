package decorator;

abstract public class DecoratorAcai implements Acai {
    protected Acai acai;

    protected DecoratorAcai(Acai acai) {
        this.acai = acai;
    }
    abstract public String getDescricao();

}
