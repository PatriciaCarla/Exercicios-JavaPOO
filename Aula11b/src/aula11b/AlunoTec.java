package aula11b;
public class AlunoTec extends Aluno{
    //Atributos
    private int registro;
    //Métodos
    public String praticar(){
        return "Praticando";
    }
    //Métodos Especiais
    public AlunoTec(String n, int i, String sx, String c, int m) {
        this.setNome(n);
        this.setIdade(i);
        this.setSexo(sx);
        this.setCurso(c);
        this.setMatricula(m);
    }
    public void setRegistro(int r){
        this.registro = r;
    }
    public int getRegistro(){
        return this.registro;
    }
    @Override
    public String toString() {
        return "\n"+this.getNome()+","+this.getIdade()+","+this.getSexo()+","
                +this.getCurso()+","+this.getMatricula()+","+this.getRegistro()
                +"\n################\n";
    }
}
