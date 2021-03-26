package aula12b;
public class Canguru extends Mamifero{
    //Atributos - nenhum novo
    //Métodos
    public void usarBolsa(){
        System.out.println("Usando bolsa");
    }
    @Override
    public void locomover() {
        System.out.println("Saltando");
    }
    //Métodos Especiais
    public Canguru(float p, int i, int m, String cp) {
        super(p, i, m, cp);
    }
}
