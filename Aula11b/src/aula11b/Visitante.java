package aula11b;
public class Visitante extends Pessoa {
    //Construtor
    public Visitante(String n, int i, String sx) {
        this.setNome(n);
        this.setIdade(i);
        this.setSexo(sx);
    }
    @Override
    public String toString() {
        return "\n"+this.getNome()+","+this.getIdade()+","+this.getSexo()
                +"\n################\n";
    }
}
