import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);

       System.out.println("digite seu Nome:");
       String nomeCliente = sc.next();

       System.out.println("Por favor digite o numero da sua Agéncia  :");
       int agencia = sc.nextInt();
       
       System.out.println("Agora digite o numero da sua Conta com Digito:");
       String numero = sc.next();

       System.out.println("digite valor do Saque?:");
       double saldo = sc.nextDouble();

       System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco sua agéncia é " + agencia + " Conta " + numero + " e seu saldo R$: " + saldo + " já está diponivel para saque." );
       


    }
}
