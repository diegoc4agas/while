import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operacao;
        int a = 15;
        String menu = "Escolha uma operação: soma = 1";
        while (true) {
            System.out.println(menu);
            operacao = sc.nextInt();
            if (operacao == 1) {
                System.out.println("Informe o primeiro número:");
                double n1 = sc.nextDouble(), n2;
                while (true) {
                    System.out.println("Informe o próximo número:");
                    n2 = sc.nextDouble();
                    if (a == 15) ;
                    System.out.println("O resultado da soma é:" + (n1 + n2));
                    break;
                }
            }

        }
    }
}
