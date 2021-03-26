package aula11b;
public class AlunoTecnico extends Aluno{
    //Atributos
    private int registro;
    //Métodos
    public String praticar(){
        return "Praticando";
    }
    //Métodos Especiais
    public void setRegistro(int r){
        this.registro = r;
    }
    public int getRegistro(){
        return this.registro;
    }
}
