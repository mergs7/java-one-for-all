package academy.devdojo.maratonajava.introducao;

public class Aula02Operadores {
    public static void main(String[] args) {
        // + - / *

        int numero01 = 10;
        double numero02 = 20;
        double resultado =  numero01 / numero02;
        System.out.println(resultado);

        //resto (%)
        int resto = 25 % 2;
        System.out.println(resto);

        // lógicos < > <= >= == != (sempre retornam booleanos)

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezDiferenteDeVinte = 10 != 20;

        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualAVinte " + isDezIgualAVinte);
        System.out.println("isDezDiferenteDeVinte " + isDezDiferenteDeVinte);



    }
}
