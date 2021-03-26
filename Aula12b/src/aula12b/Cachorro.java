package aula12b;
public class Cachorro extends Mamifero {
    //Atributos
    //Métodos
    public void enterrarOsso(){
        System.out.println("Enterrando osso");
    }
    public void abanarRabo(){
        System.out.println("Abanando Rabo");
    }
    @Override
    public void emitirSom() {
        System.out.println("Latindo");
    }
    //Métodos Especiais    
    public Cachorro(float p, int i, int m, String cp) {
        super(p, i, m, cp);
    } 
}
