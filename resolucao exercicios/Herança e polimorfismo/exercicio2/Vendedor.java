public final class Vendedor extends Empregado {

    protected double vendas;

    public Vendedor(String nome, String email, String senha) {

        super(nome, email, senha);

        isAdmin = false;

    }

    public void consultarVendas() {

        System.out.printf("Valor de vendas: R$ %.2f", vendas);

    }

    public void realizarVenda() {

        System.out.println("Informe o valor total da venda: ");
        double valorVenda = scanner.nextDouble();

        this.vendas += valorVenda;

    }

    public double getVendas() {
        return vendas;
    }
    
}
