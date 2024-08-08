package academy.devdojo.maratonajava.introducao;

public class Aula05Array {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        int[] idades = new int[3];
        System.out.println(idades); //imprime o endereço de memória do array
        System.out.println(idades[0]);

        nomes[0] = "Goku";
        nomes[1] = "vegeta";
        nomes[2] = "Yancha";

        for (int i = 0; i < nomes.length ; i++) {
            System.out.println(nomes[i]);
        }

        int[] numeros = {1,2,3,4,5};
        //ou
        int[] numeros2 = new int[]{1,2,3,4,5};

        //FOREACH abaixo (ele percorre o array inteiro de forma mais simples)

        for(int num: numeros2){
            System.out.println(num);
        }



    }
}
