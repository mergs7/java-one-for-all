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

        // && -> (AND)        || -> (OR)        ! -> (NOT)

        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612.25F;
        boolean isDentroDaLeiMenorQueTrinta = idade <= 30 && salario >= 3500;

        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        //Atribuição ->   =, +=, -=, *=, %=, /=

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus %= 7;
        System.out.println(bonus);

        // ++ --

        int contador = 0;
        System.out.println(contador++); //contador aqui sera impresso como 0
        System.out.println(contador); //aqui será impresso como 1, uma vez que o ++ está na frente na linha acima
        System.out.println(++contador);//aqui será impresso 2, uma vez q o ++ está antes do termo

    }
}
