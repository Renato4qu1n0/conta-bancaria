import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome Completo: ");
        var nomeCliente = entrada.nextLine();

        System.out.print("Digite o número da Agência: ");
        var agencia = entrada.nextLine();

        System.out.print("Agora digite o número da sua conta: ");
        int numeroConta = entrada.nextInt();

        double saldo = 2525.00;

        System.out.println("Seja bem-vindo " + nomeCliente + "!" + ". O número da sua Agência é: " + agencia +
                ". A sua conta é a de número: " + numeroConta + ". Você tem disponível em sua conta o valor de: R$" + saldo);

        System.out.println("Qual valor o Sr gostaria de sacar hoje?");
        double saque = entrada.nextDouble();

        double valorFinal = saldo - saque;

        System.out.println("Você sacou o valor de: R$" + saque);
        System.out.println("Agora você tem disponível o valor dê R$" + valorFinal);

    }
}