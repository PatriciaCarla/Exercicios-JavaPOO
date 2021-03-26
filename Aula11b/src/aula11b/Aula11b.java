package aula11b;
public class Aula11b {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista("Beatriz",19,"F","Tecnico em Enfermagem",5678);
        AlunoTec t1 = new AlunoTec("Bruno",15,"M","Tecnino de Eletronica", 23456);
        Professor p1 = new Professor("Guanabara",40,"M","Tecnologia da Informação",10000f);
        Visitante v1 = new Visitante("Paty",22,"F");
        
        a1.setNome("Camila");
        a1.setIdade(17);
        a1.setSexo("F");
        a1.setCurso("Ensino médio");
        a1.setMatricula(6567678);
        
        System.out.println(a1.fazerAniversario());
        System.out.println(a1.pagarMensalidade());
        System.out.println(a1.toString());
        
        System.out.println(b1.fazerAniversario());
        System.out.println(b1.pagarMensalidade());
        System.out.println(b1.renovarBolsa());
        System.out.println(b1.toString());
        
        System.out.println(t1.fazerAniversario());
        System.out.println(t1.pagarMensalidade());
        System.out.println(t1.praticar());
        System.out.println(t1.toString());
        
        System.out.println(p1.fazerAniversario());
        System.out.println(p1.receberAumento(500000f));
        System.out.println(p1.toString());
        
        System.out.println(v1.fazerAniversario());
        System.out.println(v1.toString());
        
    }
}