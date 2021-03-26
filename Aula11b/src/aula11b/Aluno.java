package aula11b;
public class Aluno extends Pessoa{
    //Atributos
    private String curso;
    private int matricula;
    //Métodos
    public String pagarMensalidade(){
        return "Mensalidade paga.";
    }
    //Métodos Especiais
    public void setCurso(String c){
        this.curso = c;
    }
    public String getCurso(){
        return this.curso;
    }
    public void setMatricula(int m){
        this.matricula = m;
    }
    public int getMatricula(){
        return this.matricula;
    }
}
