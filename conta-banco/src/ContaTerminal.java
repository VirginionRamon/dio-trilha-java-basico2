import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência!");

        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o número da Conta!");

        String conta = scanner.next();

        System.out.println("Por favor, digite o seu Nome!");

        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o Saldo!");

        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + " conta " + conta + " e seu saldo de R$ " + saldo + " já está disponível para saque");
    }
}
