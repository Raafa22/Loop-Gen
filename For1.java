package Loop;

import java.util.Scanner;

public class For1 {

    public static void main(String[] args) {

        int n1, n2;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu primeiro número: ");
        n1 = leia.nextInt();

        System.out.println("Digite seu segundo número: ");
        n2 = leia.nextInt();

        if (n1 < n2) {
            System.out.println("Opção Válida ");
            
        } else {
            System.out.println("Opção Inválida. O primeiro número deve ser menor que o segundo.");
        }
            
            for (int i = n1; i <= n2; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + " é múltiplo de 3 e 5");
                }
            }
        

       
    }
}
