package aula10b;

public class Professor extends Pessoa {
    //Atributos
    private String especialidade;
    private float salario;
    //Métodos
    public void receberAumento(float s) {
        this.setSalario(s);
        System.out.println("Novo salário: "+ this.getSalario() );
    }
    //Métodos especiais
    public Professor(String n, int i, String sx, String e, float s) {
        this.setNome(n);
        this.setIdade(i);
        this.setSexo(sx);
        this.setEspecialidade(e);
        this.setSalario(s);
    }
    public String getEspecialidade() {
        return this.especialidade;
    }
    public void setEspecialidade(String e) {
        this.especialidade = e;
    }
    public float getSalario() {
        return this.salario;
    }
    public void setSalario(float s) {
        this.salario = s;
    }
    @Override
    public String toString() {
        return "\nNome: "+ this.getNome() +"\nIdade: "+ this.getIdade() 
                +"\nSexo: "+ this.getSexo() +"\nEspecialidade: "
                + this.getEspecialidade() +"\nSalário: "+ this.getSalario() +"\n\n";
    }
}
