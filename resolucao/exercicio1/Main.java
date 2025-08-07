import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);

    private static final String INITIAL_MESSAGE = "[1] Verificar Saldo\n[2] Verificar limite Cheque Especial\n[3] Depósito\n[4] Saque\n[5] Pagamento\n[0] Sair";

    public static void menu(){


        do{
            System.out.println(INITIAL_MESSAGE);
            break;
        } while(true);
    }
}