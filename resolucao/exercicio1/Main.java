import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    private static final String INITIAL_MESSAGE = "[1] Verificar Saldo\n[2] Verificar limite Cheque Especial\n[3] Depósito\n[4] Saque\n[5] Pagamento\n[6] Consulta juros\n[0] Sair";
    private static int optionMenu = -1; 

    private static String nome;
    private static double saldo;
    private static ContaBancaria contaBancaria;

    public static void clearConsole() {
    
        try {
            // Verifica o sistema operacional
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                // Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Unix/Linux/Mac
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    

    public static void main(String[] args) throws InterruptedException {


        do{

            if (optionMenu == -1) {
                System.out.println("Vamos criar uma conta.");
                System.out.println("Qual seu nome? ");

                System.out.printf("-> ");
                nome = scanner.nextLine();

                if (nome.equals("")){
                    clearConsole();
                    System.out.println("Um nome deve ser informado.");
                    continue;
                }

                clearConsole();
                System.out.printf("Bem vindo %s\n", nome);
                System.out.println("Gostaria de fazer um depósito inicial? [S] ou [N]");
                var response = scanner.next();

                while (true){
                    if (response.equalsIgnoreCase("s")){
                        clearConsole();
                        System.out.println("Qual valor deseja depositar ? ");
                        System.out.printf("-> ");
                        var firstDeposit = scanner.nextDouble();
                        if (firstDeposit <= 0){
                            System.out.println("O valor não pode ser menor ou iguaL a zero.");
                            Thread.sleep(2000);
                            continue;
                        }
                        saldo = firstDeposit;
                        System.out.printf("O valor de R$ %.2f foi depositado com sucesso!\n", firstDeposit);
                        Thread.sleep(3000);
                        break;
                        
                    } else if (response.equalsIgnoreCase("n")) {
                        clearConsole();
                        System.out.println("Vamos prosseguir então.");
                        saldo = 0;
                        break;
                    } else {
                        System.out.println("Opção inválida.");
                        clearConsole();
                        continue;
                    }
                }
                                
                contaBancaria = new ContaBancaria(saldo);
            }
            
            clearConsole();
            System.out.println(INITIAL_MESSAGE);

            System.out.printf("-> ");
            optionMenu = scanner.nextInt();

            switch (optionMenu) {
                case 1 -> contaBancaria.consultaSaldo();
                case 2 -> contaBancaria.consultaChequeEspecial();
                case 3 -> {
                    clearConsole();
                    System.out.println("Qual o valor para depósito? ");
                    double valorDeposito = scanner.nextDouble();
                    contaBancaria.efetuarDeposito(valorDeposito);
                }
                case 4 -> {
                    clearConsole();
                    System.out.println("Qual o valor para saque? ");
                    double valorSaque = scanner.nextDouble();
                    contaBancaria.efetuarSaque(valorSaque);
                }
                case 5 -> {
                    clearConsole();
                    System.out.println("Qual o valor para pagamento? ");
                    double valorPagamento = scanner.nextDouble();
                    contaBancaria.efetuarPagamento(valorPagamento);
                }
                case 6 -> contaBancaria.consultaPagamentoJuros();
            }
        } while(optionMenu != 0);
    }
}