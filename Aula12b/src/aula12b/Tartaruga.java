package aula12b;
public class Tartaruga extends Reptil{
    //Atributos
    //Métodos
    @Override
    public void locomover() {
        System.out.println("Andando bem devagar");
    }
    //Métodos Especiais
    public Tartaruga(float p, int i, int m, String ce) {
        super(p, i, m, ce);
    }
}
