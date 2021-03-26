package aula11b;

public abstract class Pessoa {
    //Atributos
   private String nome;
   private int idade;
   private String sexo;
   //Métodos
   public final String fazerAniversario(){
       this.setIdade(this.getIdade()+1);
       return "Completou "+this.getIdade()+" anos!";
   }
   //Métodos Especiais
   public void setNome(String n){
       this.nome = n;
   }
   public String getNome(){
       return this.nome;
   }
   public void setIdade(int i){
       this.idade = i;
   }
   public int getIdade(){
       return this.idade;
   }
   public void setSexo(String sx){
       this.sexo = sx;
   }
   public String getSexo(){
       return this.sexo;
   }
   @Override
   public String toString(){
       return "\nNome: "+this.getNome()+"\nIdade: "+this.getIdade()
               +"\nSexo: "+this.getSexo();
   }
}
