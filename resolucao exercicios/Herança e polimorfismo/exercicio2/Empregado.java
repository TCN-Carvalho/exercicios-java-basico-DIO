import java.util.Scanner;

public abstract sealed class Empregado permits Gerente, Vendedor, Atendente {

    Scanner scanner = new Scanner(System.in);

    protected String nome;
    protected String email;
    protected String senha;
    protected boolean isAdmin;
    protected boolean logged = false;

    public Empregado(String nome, String email, String senha) {

        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public void login() {

        System.out.printf("Informe o username: ");
        String username = scanner.nextLine();

        if (username.equalsIgnoreCase(this.nome) || username.equals(this.email) ) {

            System.out.printf("Informe sua senha: ");
            String password = scanner.nextLine();

            if (password.equals(this.senha)) {

                this.logged = true;
                System.out.println("Login efetuado com sucesso");

            }else {
                System.out.println("Senha incorreta.");
            }

        } else {
            System.out.println("Usuário não encontrado.");
        }

    }

    public void logoff() {
        this.logged = false;
        System.out.println("Logoff realizado com sucesso.");
    }

    public void alterarDados() {
        
        if (this.logged == false) {
            System.out.println("Você deve estar logado para realizar operaçẽs.");
            return;
        }

        System.out.println("O que deseja alterar:\n[1] Nome\n[2] Email\n[3] Senha");
        int usrOption = scanner.nextInt();

        switch (usrOption) {
            case 1 -> {
                System.out.println("Informe o novo nome: ");
                this.nome = scanner.nextLine();          
                
            }
            case 2 -> {
                System.out.println("Informe o novo Email: ");
                this.email = scanner.nextLine();                
                
            }
            case 3 -> {
                System.out.println("Informe a nova Senha: ");
                this.senha = scanner.nextLine();                 
                
            }
            default -> {
                System.out.println("Opção inválida");
                break;
            }
        }
    }


    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public boolean isLogged() {
        return logged;
    }

    

}
