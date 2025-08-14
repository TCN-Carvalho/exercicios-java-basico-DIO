public final class Gerente extends Empregado {

    public Gerente (String nome, String email, String senha) {

        super(nome, email, senha);

        isAdmin = true;
    }

    public void gerarRelatorioFinanceiro(){
        System.out.println("Isso é um relatório");
    }

    public void consultarVendas(){
        System.out.println("Valor de venda");
    }


}
