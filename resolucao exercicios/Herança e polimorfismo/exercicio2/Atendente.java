public final class Atendente extends Empregado {

    protected double caixa;

    public Atendente(String nome, String email, String senha) {

        super(nome, email, senha);

        isAdmin = false;

    }

    public void receberPagamento(){

        System.out.println("Valor do pagamento:");
        double valorPagamento = scanner.nextDouble();

        this.caixa += valorPagamento;

    }

    public void fechamento(){

        System.out.printf("Total do dia: R$ %.2f", caixa);

    }

}
