package resolucao.exercicio2;

public class Carro {
    private int estado = 0;
    private int marcha = 0;
    private int velocidade = 0;

    public void setEstado() {
        estado = (estado == 0) ? 1 : 0;
        System.out.println((estado == 1) ? "O carro ligou." : "O carro desligou");
    }

    public void setMarcha(int marcha) {
        if (estado == 0) {
            System.out.println("Ligue o carro.");
            return;
        }
        
        if (marcha > this.marcha + 1 || marcha < this.marcha - 1) {
            System.out.println("Não pule marcha.");
            return;
        }

        if (this.marcha < 6 && this.marcha > -2) {
            if (marcha > this.marcha) {
                this.marcha += 1;
            } else if (marcha < this.marcha) {
                this.marcha -= 1;
            }
        }
    }

    public void setAcelerar() {
        if (estado == 0) {
            System.out.println("Ligue o carro antes de acelerar.");
        } else if (marcha == 0) {
            System.out.println("O carro está em ponto morto");
        } else if (velocidade < 120) {
            velocidade += 1;
        }
    }

    public void setDesacelerar() {
        if (estado == 0) {
            System.out.println("O carro já está parado.");
        } else if (velocidade > 0) {
            velocidade -= 1;
        }
    }
}
