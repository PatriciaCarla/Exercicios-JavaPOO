package aula13b;
public abstract class Animal {
    //Atributos
    private float peso;
    private int idade;
    private int membros;
    //Métodos
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    //Métodos Especiais
    public float getPeso() {
        return this.peso;
    }
    public void setPeso(float p) {
        this.peso = p;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int i) {
        this.idade = i;
    }
    public int getMembros() {
        return this.membros;
    }
    public void setMembros(int m) {
        this.membros = m;
    }
}
