package ultraemojicombate;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private boolean aprovada;
    //Métodos Especiais
    public Lutador getDesafiado() {
        return this.desafiado;
    }
    public void setDesafiado(Lutador d) {
        this.desafiado = d;
    }
    public Lutador getDesafiante() {
        return this.desafiante;
    }
    public void setDesafiante(Lutador d) {
        this.desafiante = d;
    }
    public boolean isAprovada() {
        return this.aprovada;
    }
    public void setAprovada(boolean a) {
        this.aprovada = a;
    }
    //Métodos   
    public void marcarLuta(Lutador lut1, Lutador lut2) {
        if((lut1.getCategoria().equals(lut2.getCategoria()) && (lut1 != lut2))) {
            this.setAprovada(true);
            this.setDesafiado(lut1);
            this.setDesafiante(lut2);
            System.out.println("Luta marcada");
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
            System.out.println("Luta inválida");
        }
    }
    public void lutar() {
        if (this.aprovada) {
            System.out.println("### DESAFIADO ###");
            desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            desafiante.apresentar();
            Random aleatorio = new Random(); 
            int vencedor = aleatorio.nextInt(3); //0, 1, 2 
            System.out.println("### Resultado ###");
            switch (vencedor) {
                case 0: //Empate
                    System.out.println("Empatou! ");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1: //Desafiado Venceu
                    System.out.println(" Vitória do " + desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2: //Desafiante Venceu
                    System.out.println(" Vitória do " + desafiante.getNome());
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
            }
            System.out.println("");
        } else {
            System.out.println("Luta não foi aprovada");
        }
    }
}
