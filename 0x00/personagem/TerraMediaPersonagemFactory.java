public class TerraMediaPersonagemFactory extends PersonagemFactory{


    @Override
    public Personagem createPersonagem(TipoPersonagem tipo, String nome)  {
        if (tipo == TipoPersonagem.MAGO) {
            try {
                return new Mago(nome, 10, 2, 5, 3, 4);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else if (tipo == TipoPersonagem.LADRAO) {
            try {
                return new Ladrao(nome, 2, 6, 8, 5, 10);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else if (tipo == TipoPersonagem.GUERREIRO) {
            try {
                return new Guerreiro(nome, 1, 8, 5, 10, 6);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }
}