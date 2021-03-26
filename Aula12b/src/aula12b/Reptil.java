package aula12b;
public class Reptil extends Animal{
    //Atributos
    private String corEscama;
    //Métodos
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }
    @Override
    public void alimentar() {
        System.out.println("Devorando pequenas presas");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }
    //Métodos Especiais
    public Reptil(float p, int i, int m, String ce) {
        this.setPeso(p);
        this.setIdade(i);
        this.setMembros(m);
        this.setCorEscama(ce);
    }
    public String getCorEscama() {
        return this.corEscama;
    }
    public void setCorEscama(String ce) {
        this.corEscama = ce;
    }
}
