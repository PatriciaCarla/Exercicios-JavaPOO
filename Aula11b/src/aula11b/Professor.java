package aula11b;
public class Professor extends Pessoa{
    //Atributos
    private String especialidade;
    private float salario;
    //Métodos
    public String receberAumento(float s){
        float a = s - getSalario();
        this.setSalario(s);
        return "\nNovo salário: "+this.getSalario()+"\nAumento de "+ a +" reais";
    }
    //Métodos Especiais
    public Professor(String n, int i, String sx, String e, float s) {
        this.setNome(n);
        this.setIdade(i);
        this.setSexo(sx);
        this.setEspecialidade(e);
        this.setSalario(s);
    }
    public void setEspecialidade(String e){
        this.especialidade = e;
    }
    public String getEspecialidade(){
        return this.especialidade;
    }
    public void setSalario(float s){
        this.salario = s;
    }
    public float getSalario(){
        return this.salario;
    }
    @Override
    public String toString() {
        return "\n"+this.getNome()+","+this.getIdade()+","+this.getSexo()
                +","+this.getEspecialidade()+","+this.getSalario()
                +"\n################\n";
    }
}
