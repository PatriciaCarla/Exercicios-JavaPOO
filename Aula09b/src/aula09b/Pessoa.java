package aula09b;

public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private String sexo;
    //Métodos 
    public void fazerAniversario() {
        this.setIdade(++this.idade);
    }
    //Métodos especiais
    public Pessoa(String n, int i, String s) {
        this.nome = n;
        this.idade = i;
        this.sexo = s;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String n) {
        this.nome = n;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int i) {
        this.idade = i;
    }
    public String getSexo() {
        return this.sexo;
    }
    public void setSexo(String s) {
        this.sexo = s;
    }
    
}
