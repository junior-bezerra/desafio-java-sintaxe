import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite a sua identificação!");
        int identificacao = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua Agência!");
        String agencia = scanner.next();

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Qual é o seu saldo:");
        double saldo = scanner.nextDouble();
        
        
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + identificacao + " e seu saldo R$" + saldo  + " já está disponível para saque.");
         
    }
}
