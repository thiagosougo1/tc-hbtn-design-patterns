package impressao;

public class Impressao {
    private int paginasTotais;
    private int paginasColoridas;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;

    public double CalcularTotal(){
        return 1.0;
    }
    int paginasPreto = paginasTotais - paginasColoridas; 
    public String toString(){
       return "total de paginas: " + paginasTotais + 
            ", total coloridas: " + paginasColoridas + 
            ", total preto e branco: " + paginasPreto + 
            " " + ehFrenteVerso + 
            ". total: R$" + CalcularTotal();
    }
}
