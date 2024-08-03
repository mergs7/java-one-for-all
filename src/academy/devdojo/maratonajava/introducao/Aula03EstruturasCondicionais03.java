package academy.devdojo.maratonajava.introducao;

import java.util.Random;

public class Aula03EstruturasCondicionais03 {
    public static void main(String[] args) {
        //doar sse salario for maior que 5000 (usando ternário)

        Random numeroAleatorio = new Random();
        double salario = numeroAleatorio.nextInt(8500);
        System.out.println(salario);
        String mensagemDoar = "Posso doar";
        String mensagemNaoDoar = "Ainda não posso doar";
        String resultado;


        // ternário -> condição ? (se a condição for atendida) : (Se não for atendida)
        resultado = salario >= 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

    }
}
