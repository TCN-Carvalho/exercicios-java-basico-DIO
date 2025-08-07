public class ContaBancaria {

    private double saldo;
    private double chequeEspecial;

    public ContaBancaria(double saldo){
        this.saldo = saldo;

        if (saldo <= 500){
            this.chequeEspecial = 50;
        }else {
            this.chequeEspecial = saldo * 0.5;
        }
    }
    
    public void consultaSaldo(){
        System.out.printf("Saldo atual: R$ %s.2f", this.saldo);
    }

    public void consultaChequeEspecial(){
        System.out.printf("Cheque Especial: %s.2f", this.chequeEspecial);
    }

    public void efetuarDeposito(double valorDeposito){
        this.saldo += valorDeposito;

        saldo();
    }

    public void efetuarSaque(double valorSaque){
        this.saldo -= valorSaque;

        saldo();
    }

    public void efetuarPagamento(double valorPagamento){
        this.saldo -= valorPagamento;
        
        saldo();
    }

    private static void verificaChequeEspecial(){
        
    }

}
