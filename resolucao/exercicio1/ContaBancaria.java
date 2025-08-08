import java.util.Scanner;

public class ContaBancaria {

    private double saldo;
    private double saldoChequeEspecial;
    private double limiteChequeEspecial;

    private final double JUROS_CHEQUE_ESPECIAL = 0.2;
    private double pagamentoChequeEspecial;

    private static Scanner scanner = new Scanner(System.in);

    public ContaBancaria(double saldo){
        this.saldo = saldo;

        if (this.saldo <= 500){
            saldoChequeEspecial = 50;
        }else {
            saldoChequeEspecial = this.saldo * 0.5;
        }

        limiteChequeEspecial = saldoChequeEspecial;

    }
    
    public void consultaSaldo(){
        Main.clearConsole();        
        System.out.printf("Saldo atual: R$ %.2f\n", (saldo + saldoChequeEspecial));
        System.out.println("Pressione ENTER para continuar.");
        scanner.nextLine();
    }

    public void consultaChequeEspecial(){
        Main.clearConsole();
        System.out.printf("Cheque Especial: R$ %.2f\n", saldoChequeEspecial);
        System.out.println("Pressione ENTER para continuar.");
        scanner.nextLine();
    }

    public void efetuarDeposito(double valorDeposito) throws InterruptedException{
        if (saldoChequeEspecial <= limiteChequeEspecial){
            valorDeposito = valorDeposito - (limiteChequeEspecial - saldoChequeEspecial);
            saldo += valorDeposito;
            if (saldo >= pagamentoChequeEspecial){
                saldo -= pagamentoChequeEspecial;
                pagamentoChequeEspecial = 0;
            }
            saldoChequeEspecial = limiteChequeEspecial;
        }else {
            saldo += valorDeposito;
        }
        System.out.println("Seu depósito foi realizado com sucesso");
        // controlaChequeEspecial();
        Thread.sleep(2000);
        consultaSaldo();
    }

    public void efetuarSaque(double valorSaque) throws InterruptedException{
        // this.saldo -= valorSaque;

        debitoValor(valorSaque);

        Thread.sleep(2000);
        controlaChequeEspecial();
        consultaSaldo();
    }

    public void efetuarPagamento(double valorPagamento) throws InterruptedException{
        // this.saldo -= valorPagamento;

        debitoValor(valorPagamento);

        Thread.sleep(2000);
        controlaChequeEspecial();
        consultaSaldo();
    }

    public void consultaPagamentoJuros() {
        Main.clearConsole();
        System.out.printf("Seu débito até o momento é de R$ %.2f\n", pagamentoChequeEspecial);
        System.out.println("Pressione ENTER para continuar.");
        scanner.nextLine();
    }

    private void debitoValor(double retirada){
        if (retirada > (saldo + saldoChequeEspecial)){
            System.out.println("Valor acima do limite disponível.");
            return;
        }else {
            if (retirada <= saldo){
                saldo -= retirada;
            }else if (retirada > saldo){
                saldo -= retirada;
                saldoChequeEspecial += saldo;
                saldo = 0;
            }
            System.out.println("Operação realizada com sucesso");
        }
    }

    private void controlaChequeEspecial(){
        pagamentoChequeEspecial = (limiteChequeEspecial - saldoChequeEspecial) * JUROS_CHEQUE_ESPECIAL;
    }

}
