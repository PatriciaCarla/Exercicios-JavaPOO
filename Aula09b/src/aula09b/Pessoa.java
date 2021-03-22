package aula09b;

public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private char sexo;
    //Métodos 
    public void fazerAniversario() {
        this.setIdade(++this.idade);
    }
    //Métodos especiais
    public Pessoa(String n, int i, char s) {
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
    public char getSexo() {
        return this.sexo;
    }
    public void setSexo(char s) {
        this.sexo = s;
    }
    
}
