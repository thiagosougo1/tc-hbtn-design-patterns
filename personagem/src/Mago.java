public class Mago extends Personagem {

    public Mago(String nome, TipoPersonagem tipo, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        super(nome, tipo, inteligencia, forca, vigor, resistencia, destreza);
        tipo = TipoPersonagem.MAGO;
        if (forca > inteligencia && destreza> inteligencia) {
            throw new IllegalArgumentException("Atributos invalidos para MAGO.");
        }
    }

    @Override
    public double getDanoAtaque(){
        return (inteligencia * 0.8) + (forca * 0.05) + (destreza * 0.05) + (vigor * 0.1);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
