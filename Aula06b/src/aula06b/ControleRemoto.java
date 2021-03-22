package aula06b;
public class ControleRemoto implements Controlador{
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //Métodos Especiais
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    private int getVolume() {
        return this.volume;
    }
    private void setVolume(int v) {
        this.volume = v;
    }
    private boolean getLigado() {
        return this.ligado;
    }
    private void setLigado(boolean l) {
        this.ligado = l;
    }
    private boolean getTocando() {
        return this.tocando;
    }
    private void setTocando(boolean t) {
        this.tocando = t;
    }   
    //Métodos Abstratos

    @Override
    public void ligar() {
        if (this.getLigado()==false) {
            this.setLigado(true);
            System.out.println("Ligando");            
        }
    }
    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("");
    }
    @Override
    public void abrirMenu() {
        System.out.println("-----Menu-----");
        System.out.println("Ligado: "+ this.getLigado());
        System.out.print("Volume: "+ this.getVolume()+" ");
        for (int c = 0 ; c <= this.getVolume(); c+=5) {
            System.out.print("|");
        }
        System.out.println("");
        System.out.println("Reproduzindo: "+ getTocando());
    }
    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu");
    }
    @Override
    public void maisVolume() {
        if (this.getLigado()==true) {
            this.setVolume(this.getVolume()+5);
            System.out.println(this.getVolume()+" ");
            for (int c = 0 ; c <= this.getVolume(); c+=5) {
                System.out.print("|");
            }
            System.out.println("");
        }
    }
    @Override
    public void menosVolume() {
        if (this.getLigado()==true) {
            this.setVolume(this.getVolume()-5);
            System.out.println(this.getVolume()+" ");   
            for (int c = 0; c <= getVolume(); c+=5) {
                System.out.print("|");
            }
            System.out.println("");
        }
    }
    @Override
    public void ligarMudo() {
        if (this.getLigado()==true && this.getVolume()>0) {
            this.setVolume(0);
            System.out.println("Mudo");            
        }
    }
    @Override
    public void desligarMudo() {
        if (this.getLigado()==true && this.getVolume()==0) {
            this.setVolume(50);
            System.out.print(this.getVolume()+" ");
            for (int c=0; c<= this.getVolume(); c+=5) {
                System.out.print("|");
            }
            System.out.println("");
        }
    }
    @Override
    public void play() {
        if (this.getLigado()==true && this.getTocando() == false) {
            this.setTocando(true);
            System.out.println("Reproduzindo");
        }
    }
    @Override
    public void pause() {
        if (this.getLigado()==true) {
            if (this.getTocando()==true) {
                this.setTocando(false);
                System.out.println("Pausando");
            }   
        }
    }
}
