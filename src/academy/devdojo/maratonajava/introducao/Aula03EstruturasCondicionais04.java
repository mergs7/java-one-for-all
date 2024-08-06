package academy.devdojo.maratonajava.introducao;

import java.util.Random;



public class Aula03EstruturasCondicionais04 {
    public static void main(String[] args) {
        //imprima o dia da semana baseado no número fornecido, sabendo que domingo = 1

        Random numeroAleatorio = new Random();
        int dia = numeroAleatorio.nextInt(8);
        System.out.println(dia);

        switch (dia) {
            case (1):
                System.out.println("Domingo");
                break;
            case (2):
                System.out.println("Segunda");
                break;
            case (3):
                System.out.println("Terça");
                break;
            case (4):
                System.out.println("Quarta");
                break;
            case (5):
                System.out.println("Quinta");
                break;
            case (6):
                System.out.println("Sexta");
                break;
            case (7):
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
                break;


        }
        char sexo = 'M';
        switch (sexo){
            case('M'):
                System.out.println("Homem");
                break;
            case('H'):
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Opção inválida");

        }
    }
}
