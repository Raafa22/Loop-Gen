package Loop;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        int idade, totalPessoas21 = 0, totalPessoas50 = 0;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        idade = leia.nextInt();

        while (idade >= 0) {
            if (idade < 21) {
                totalPessoas21++;
            } else if (idade > 50) {
                totalPessoas50++;
            }

            System.out.println("Digite uma idade: ");
            idade = leia.nextInt();
        }

        System.out.println("Total de Pessoas menores de 21 anos : " + totalPessoas21);
        System.out.println("Total de Pessoas maiores de 50 anos : " + totalPessoas50);

       
    }
}





