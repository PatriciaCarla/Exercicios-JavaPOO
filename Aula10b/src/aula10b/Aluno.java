package aula10b;

public class Aluno extends Pessoa{
    //Atributos
    private int matricula;
    private String curso;
    //Métodos
    public void cancelarMatricula() {
        this.setMatricula(0);
        System.out.println("Matricula cancelada");
    }
    //Métodos especiais
    public Aluno(String n, int i, String sx, int m, String c) {
        this.setNome(n);
        this.setIdade(i);
        this.setSexo(sx);
        this.setMatricula(m);
        this.setCurso(c);
    }
    public int getMatricula() {
        return this.matricula;
    }
    public void setMatricula(int m) {
        this.matricula = m;
    }
    public String getCurso() {
        return this.curso;
    }
    public void setCurso(String c) {
        this.curso = c;
    }
    @Override
    public String toString(){
        return "\nNome: "+ this.getNome() +"\nIdade: "+ this.getIdade() 
                +"\nSexo: "+ this.getSexo() +"\nMatricula: "
                + this.getMatricula() +"\nCurso: "+ this.getCurso() +"\n\n";
    }
}
