package academy.devdojo.maratonajava.introducao;

import java.util.Random;

public class Aula03EstruturasCondicionais02 {
    public static void main(String[] args) {
        Random numeroAleatorio = new Random();
        int idade = numeroAleatorio.nextInt(84);
        System.out.println(idade);
        String categoria;

        if (idade < 15) {
            categoria = "Categoria infantil";
            System.out.println(categoria);
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria juvenil";
            System.out.println(categoria);
        } else {
            categoria = "Categoria adulto";
            System.out.println(categoria);
        }
    }


}
