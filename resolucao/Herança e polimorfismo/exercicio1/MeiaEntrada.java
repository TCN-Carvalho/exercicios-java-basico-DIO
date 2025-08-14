public final class MeiaEntrada extends Ingresso {

    public MeiaEntrada(double valor, String nomeFilme, TipoAudio tipoAudio) {
        super(valor, nomeFilme, tipoAudio);
    }

    @Override
    public double getValor() {
        return valor / 2;
    }

}
