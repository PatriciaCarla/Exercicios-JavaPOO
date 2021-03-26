package aula11b;
public class Bolsista extends Aluno{
    //Atributos
    private boolean bolsa;
    //Métodos
    public String renovarBolsa() {
        this.setBolsa(true);
        return "Bolsa renovada";
    }
    @Override
    public String pagarMensalidade(){
        return "Aluno bolsista - isento de mensalidade";
    }
    //Métodos Especiais
    public Bolsista(String n, int i, String sx, String c, int m) {
        this.setNome(n);
        this.setIdade(i);
        this.setSexo(sx);
        this.setCurso(c);
        this.setMatricula(m);
    }
    public void setBolsa(boolean b){
        this.bolsa = b;
    }
    public boolean getBolsa(){
        return this.bolsa;
    }
    @Override
    public String toString() {
        return "\n"+this.getNome()+","+this.getIdade()+","+this.getSexo()+","+
                this.getCurso()+","+this.getMatricula()+","+this.getBolsa()
                +"\n################\n";
    }
}
