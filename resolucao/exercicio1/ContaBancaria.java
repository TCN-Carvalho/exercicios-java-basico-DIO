import java.util.Scanner;

public class ContaBancaria {

    private double saldo;
    private double chequeEspecial;
    private static Scanner scanner = new Scanner(System.in);

    public ContaBancaria(double saldo){
        this.saldo = saldo;

        if (saldo <= 500){
            this.chequeEspecial = 50;
        }else {
            this.chequeEspecial = saldo * 0.5;
        }
    }
    
    public void consultaSaldo(){
        Main.clearConsole();
        var somado = this.saldo + this.chequeEspecial;
        System.out.printf("Saldo atual: R$ %.2f\n", somado);
        System.out.println("Pressione ENTER para continuar.");
        scanner.nextLine();
    }

    public void consultaChequeEspecial(){
        Main.clearConsole();
        System.out.printf("Cheque Especial: R$ %.2f\n", this.chequeEspecial);
        System.out.println("Pressione ENTER para continuar.");
        scanner.nextLine();
    }

    public void efetuarDeposito(double valorDeposito) throws InterruptedException{
        this.saldo += valorDeposito;
        System.out.println("Seu depósito foi realizado com sucesso");
        Thread.sleep(2000);
        consultaSaldo();
    }

    public void efetuarSaque(double valorSaque) throws InterruptedException{
        this.saldo -= valorSaque;
        System.out.println("Seu saque foi realizado com sucesso");
        Thread.sleep(2000);
        consultaSaldo();
    }

    public void efetuarPagamento(double valorPagamento) throws InterruptedException{
        this.saldo -= valorPagamento;
        System.out.println("Seu pagamento foi realizado com sucesso");
        Thread.sleep(2000);
        consultaSaldo();
    }

    private void verificaChequeEspecial(){
        
    }

}
