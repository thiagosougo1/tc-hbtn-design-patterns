import java.util.List;

public class BebidaComLeite extends BebidaDecorator{
    public BebidaComLeite(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> list = super.obterIngredientes();
        list.add("leite");
        return list;
    }

    @Override
    public double obterPreco() {
        double result = super.obterPreco() + 3.2;
        return result;
    }
    
}
