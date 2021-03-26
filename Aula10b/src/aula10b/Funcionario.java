package aula10b;

public class Funcionario extends Pessoa {
    //Atributos
    private String setor;
    private boolean trabalhando;    
    //Métodos
    public void mudarEstado() {
        this.setTrabalhando(!this.isTrabalhando());
    /*    if (this.isTrabalhando()==false) {
            this.setTrabalhando(true);            
     *  } else {
            this.setTrabalhando(false);
     *  }*/
    }
    //Métodos especiais
    public Funcionario(String n, int i, String sx, String s, boolean t) {
        this.setNome(n);
        this.setIdade(i);
        this.setSexo(sx);
        this.setSetor(s);
        this.setTrabalhando(t);
    }
    public String getSetor() {
        return this.setor;
    }
    public void setSetor(String s) {
        this.setor = s;
    }
    public boolean isTrabalhando() {
        return this.trabalhando;
    }
    public void setTrabalhando(boolean t) {
        this.trabalhando = t;
    }
        @Override
    public String toString() {
        return "\nNome: "+ this.getNome() + "\nIdade: "+ this.getIdade() 
                +"\nSexo:"+ this.getSexo() +"\nSetor:"+ this.getSetor() 
                +"\nTrabalhando: "+ this.isTrabalhando() +"\n\n";
    }
}
