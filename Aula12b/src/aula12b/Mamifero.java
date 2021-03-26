package aula12b;
public class Mamifero extends Animal{
    //Atributos
    private String corPelo;
    //Métodos
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }
    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }
    //Métodos Especiais
    public Mamifero(float p, int i, int m, String cp) {
        this.setPeso(p);
        this.setIdade(i);
        this.setMembros(m);
        this.setCorPelo(cp);
    }
    public String getCorPelo() {
        return this.corPelo;
    }
    public void setCorPelo(String cp) {
        this.corPelo = cp;
    }
}
