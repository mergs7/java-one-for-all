package academy.devdojo.maratonajava.introducao;

public class Aula03EstruturasCondicionais01 {
    public static void main(String[] args) {

        // if
        int idade = 15;
        boolean isAutorizadoCompraDeBebidas = idade >= 18;
        if (isAutorizadoCompraDeBebidas) {

            System.out.println("Pode comprar");
        } else {
            System.out.println("não pode comprar");
        }

        if (!isAutorizadoCompraDeBebidas) {           // A ! está fazendo com que so ative se for false (== false)
            System.out.println("Não pode comprar");
        }
    }


}
