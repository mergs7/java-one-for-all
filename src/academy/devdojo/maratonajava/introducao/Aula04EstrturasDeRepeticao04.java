package academy.devdojo.maratonajava.introducao;
import java.text.DecimalFormat;

public class Aula04EstrturasDeRepeticao04 {
    public static void main(String[] args) {
        double valorCarro = 50000;
        DecimalFormat df = new DecimalFormat("0.00");

        for (int parcela = 1; parcela < valorCarro; parcela++) {
            double valorParcela = valorCarro/parcela;
            if (valorCarro/parcela >= 1000){
                System.out.println("parcela " + parcela + " = R$" + df.format(valorParcela));
            }
        }
    }
}
