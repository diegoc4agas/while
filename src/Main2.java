import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Por favor, informe seu CPF (Somente 11 dígitos):");
            String CPF = sc.nextLine();
            CPF = CPF.trim().replace(".","").replace("-","");
            if(CPF.length() == 11){
                System.out.println("CPF válido!");
                break;
            }
            else {
                System.out.println("Favor digitar somente números e onze dígitos!");
            }
        }
    }
}
