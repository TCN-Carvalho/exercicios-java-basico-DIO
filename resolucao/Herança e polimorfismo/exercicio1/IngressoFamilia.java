public final class IngressoFamilia extends Ingresso {

    protected int pessoas;

    public IngressoFamilia(double valor, String nomeFilme, TipoAudio tipoAudio, int pessoas) {
        super(valor, nomeFilme, tipoAudio);

        this.pessoas = pessoas;
    }

    @Override
    public double getValor() {

        if (pessoas > 3) {
            return (valor * pessoas) * 0.95;
        }

        return valor * pessoas;
    }

    public int getPessoas() {
        return pessoas;
    }

}
