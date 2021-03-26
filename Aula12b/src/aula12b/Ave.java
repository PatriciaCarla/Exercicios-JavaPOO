package aula12b;
public class Ave extends Animal{
    //Atributos
    private String corPena;
    //Métodos
    @Override
    public void locomover() {
        System.out.println("Voando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo frutas e grãos");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de passaro");
    }
    public void fazerNinho() {
        System.out.println("Fazendo Ninho");
    }
    //Métodos Especiais
    public Ave(float p, int i, int m, String cp) {
    this.setPeso(p);
    this.setIdade(i);
    this.setMembros(m);
    this.setCorPena(cp);
    }
    public String getCorPena() {
        return this.corPena;
    }
    public void setCorPena(String cp) {
        this.corPena = cp;
    }
}
