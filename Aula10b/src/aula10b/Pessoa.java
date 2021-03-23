package aula10b;

public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private String sexo;
    //Métodos
    public void fazerAniversario(){
        this.setIdade(this.getIdade()+1);
        System.out.println(this.idade);
    }
    //Métodos especiais  
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
