public class Main {
    public static void main(String[] args) {

        MeiaEntrada meia = new MeiaEntrada(50, "Olavo de Carvalho", TipoAudio.LEGENDADO);

        System.out.println(meia.getValor());
        System.out.println(meia.getNomeFilme());
        System.out.println(meia.getTipoAudio());

        System.out.println("---------------------------");
        Ingresso normal = new Ingresso(50, "null", TipoAudio.LEGENDADO);

        System.out.println(normal.getValor());
        System.out.println(normal.getNomeFilme());
        System.out.println(normal.getTipoAudio());

        System.out.println("---------------------------");

        IngressoFamilia familia = new IngressoFamilia(50, "Familia", TipoAudio.LEGENDADO, 4);

        System.out.println(familia.getValor());
        System.out.println(familia.getNomeFilme());
        System.out.println(familia.getTipoAudio());

    }
}
