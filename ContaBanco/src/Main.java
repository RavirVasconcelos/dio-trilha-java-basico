import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ContaTerminal banco = new ContaTerminal();

        System.out.print("Insira o número da conta: ");
        banco.numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Agência: ");
        banco.agencia = sc.nextLine();
        System.out.print("Digite seu nome: ");
        banco.nomeCliente = sc.nextLine();
        System.out.print("Insira o seu saldo: ");
        banco.saldo = sc.nextDouble();
        sc.nextLine();

        System.out.printf("Olá %s , obrigado por criar uma conta em nosso banco, sua agência é %s , conta %d e seu Saldo %.2f%n", banco.nomeCliente, banco.agencia, banco.numero, banco.saldo);

        sc.close();    
    }
}
