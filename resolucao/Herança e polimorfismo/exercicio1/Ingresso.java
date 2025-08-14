enum TipoAudio {
    DUBLADO,
    LEGENDADO
}

public sealed class Ingresso permits MeiaEntrada, IngressoFamilia {

    protected double valor;
    protected String nomeFilme;
    protected TipoAudio tipoAudio;

    public Ingresso(double valor, String nomeFilme, TipoAudio tipoAudio) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.tipoAudio = tipoAudio;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public TipoAudio getTipoAudio() {
        return tipoAudio;
    }

    public void setTipoAudio(TipoAudio tipoAudio) {
        this.tipoAudio = tipoAudio;
    }

}
