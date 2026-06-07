import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Informe o depósito inicial: ");
        double depositoInicial = scanner.nextDouble();
        ContaBancaria conta = new ContaBancaria(depositoInicial);

        while (true) {

            System.out.println("=== Banco ===");
            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar uso do cheque especial");
            System.out.println("0 - Sair");

            int opcaoMenu = scanner.nextInt();

            switch (opcaoMenu) {
                case 1: {
                    conta.consultarSaldo();
                    break;
                }
                case 2: {
                    conta.consultarChequeEspecial();
                    break;
                }
                case 3: {
                    System.out.println("Informe o valor do depósito: ");
                    double valor = scanner.nextDouble();
                    conta.depositar(valor);
                    break;
                }
                case 4: {
                    System.out.println("Informe o valor do saque: ");
                    double valor = scanner.nextDouble();
                    conta.sacar(valor);
                    break;
                }
                case 5: {
                    System.out.println("Informe o valor do boleto: ");
                    double valor = scanner.nextDouble();
                    conta.pagarBoleto(valor);
                    break;
                }
                case 6: {
                    conta.verificarChequeEspecial();
                    break;
                }
                case 0: {
                    System.out.println("Encerrando o sistema...");
                    System.exit(0);
                }
            }
        }
    }



}