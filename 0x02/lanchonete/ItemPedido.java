public class ItemPedido {
     private TipoItemPedido tipo;
    private String nome;

    public ItemPedido(TipoItemPedido tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public TipoItemPedido getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "- " + tipo + " " + nome + "\n";
    }
}
