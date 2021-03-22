package aula09b;
public class Aula09b {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[3];
        p[0] = new Pessoa("Patricia",22,"f");
        Livro[] l = new Livro[3];
        l[0] = new Livro("Coraline","Neil Gaiman",160,p[0]);
        p[0].fazerAniversario();
        l[0].detalhes();
        l[0].abrir();
        System.out.println(l[0].detalhes());
        l[0].folhear(5);
        l[0].avancarPag();
        l[0].voltarPag();
        l[0].fechar();
        System.out.println(l[0].detalhes());
    }
}