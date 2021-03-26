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
    public void setBolsa(boolean b){
        this.bolsa = b;
    }
    public boolean getBolsa(){
        return this.bolsa;
    }
}
