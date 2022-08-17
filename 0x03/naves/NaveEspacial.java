public class NaveEspacial {

    private int saude;
    private int ataque;

    public NaveEspacial(int saude, int ataque) {
        this.saude = saude;
        this.ataque = ataque;

    }

    public NaveEspacial(NaveEspacial naveEspacial) {
        this.saude = naveEspacial.getSaude();
        this.ataque = naveEspacial.getAtaque();
    }

    public int getSaude() {
        return saude;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return String.format("Saude: %d - Ataque: %d", getSaude(), getAtaque());
    }
}
Footer
© 2022 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
