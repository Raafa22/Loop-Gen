package Loop;

import java.util.Scanner;

public class Dowhile {

    public static void main(String[] args) {

        int numero, somaNumeros = 0; 

        Scanner leia = new Scanner(System.in);

        do {
            System.out.print("Digite um número: ");
            numero = leia.nextInt();

            if (numero > 0) {
                somaNumeros += numero; 
            }

        } while (numero != 0);

        System.out.println("A soma dos números positivos é: " + somaNumeros);
        leia.close();
    }
}
