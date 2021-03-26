package aula12b;
public class Peixe extends Animal{
    //Atributos
    private String corEscama;
    //Métodos
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }
    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    //Métodos Especiais
    public Peixe(float p, int i, int m, String ce) {
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
