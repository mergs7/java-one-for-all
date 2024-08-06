package academy.devdojo.maratonajava.introducao;
import java.util.Random;

public class Aula04EstrturasDeRepeticao03 {
    public static void main(String[] args) {
        Random valorAleatorio = new Random();
        int min = 20000;
        int max = 160000;
        int valorCarro = valorAleatorio.nextInt(max - min) + min;
        for (int i = 1000; i < valorCarro; i++) {
            if(valorCarro % i ==0){
                System.out.println("Em parcelas de " + i + " você poderá dividir o valor de "+ valorCarro + " em " + valorCarro/i + " parcelas");
            }
        }
    }
}
