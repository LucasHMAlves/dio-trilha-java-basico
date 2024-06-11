import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 

        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da agência: ");
        String Agencia = scanner.next();

        System.out.println("Digite o nome do cliente: ");
        String NomeCliente = scanner.next();

        System.out.println("Saldo:  ");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá, " + NomeCliente + "!" + " Obrigado por criar uma conta em nosso banco, sua agência " + Agencia + "," + " Conta " + numero + " Seu saldo " + saldo + " Já está disponível. ");

        
        
        
        

        
        
    }
}
