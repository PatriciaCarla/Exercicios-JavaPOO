package aula11b;
public class Professor extends Pessoa{
    //Atributos
    private String especialidade;
    private float salario;
    //Métodos
    public String receberAumento(float s){
        this.setSalario(s);
        float a = s - getSalario();
        return "\nNovo salário: "+this.getSalario()+"\nAumento de "+ a +" reais";
    }
    //Métodos Especiais
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
}
