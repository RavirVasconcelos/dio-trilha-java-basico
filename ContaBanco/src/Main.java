import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        ContaTerminal banco = new ContaTerminal();

        System.out.print("Insira o número da conta: ");
        banco.numero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Agência: ");
        banco.agencia = scanner.nextLine();
        System.out.print("Digite seu nome: ");
        banco.nomeCliente = scanner.nextLine();
        System.out.print("Insira o seu saldo: ");
        banco.saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.printf("Olá %s , obrigado por criar uma conta em nosso banco, sua agência é %s , conta %d e seu Saldo %.2f%n", banco.nomeCliente, banco.agencia, banco.numero, banco.saldo);

        scanner.close();    
    }
}
