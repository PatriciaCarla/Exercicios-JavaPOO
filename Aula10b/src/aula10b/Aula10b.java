package aula10b;
public class Aula10b {
    public static void main(String[] args) {
        Aluno p1 = new Aluno("Maria",15,"F",12345,"2° ano do Ensino Médio");
        Professor p2 = new Professor("Jose",40,"M","Português",5.600f);
        Funcionario p3 = new Funcionario("Angela",30,"F","ADM",true);
        
        p1.setNome("Bruno Carlos");
        p1.setSexo("M");
        p1.setCurso("1° do Ensino Médio");
        p1.fazerAniversario();
        p1.cancelarMatricula();
        
        p2.setIdade(38);
        p2.setEspecialidade("Português e matemática");
        p2.fazerAniversario();
        p2.receberAumento(6.600f);
        
        p3.setNome("Angela da Silva");
        p3.setSetor("Coordenação");
        p3.fazerAniversario();
        p3.mudarEstado();
    }
}