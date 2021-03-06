package aula09b;

public class Livro implements Publicacao{
    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    //Métodos
    public String detalhes() {
        return "-----DETALHES-----\n"+"Título: "+ this.getTitulo()+ "\nAutor: "+ this.getAutor()
                +"\nTotal de páginas: "+ this.getTotPaginas()+"\nPágina atual: "
                + this.getPagAtual()+ "\nAberto: "+ this.isAberto()+ 
                "\nLeitor: " + this.leitor.getNome()+"\n------------------\n";
    }
    //Métodos Especiais
    public Livro(String t, String a, int tp, Pessoa l) {
        this.titulo = t;
        this.autor = a;
        this.totPaginas = tp;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = l;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String t) {
        this.titulo = t;
    }
    public String getAutor() {
        return this.autor;
    }
    public void setAutor(String a) {
        this.autor = a;
    }
    public int getTotPaginas() {
        return this.totPaginas;
    }
    public void setTotPaginas(int tp) {
        this.totPaginas = tp;
    }
    public int getPagAtual() {
        return this.pagAtual;
    }
    public void setPagAtual(int pa) {
        this.pagAtual = pa;
    }
    public boolean isAberto() {
        return this.aberto;
    }
    public void setAberto(boolean a) {
        this.aberto = a;
    }
    public Pessoa getLeitor() {
        return this.leitor;
    }
    public void setLeitor(Pessoa l) {
        this.leitor = l;
    }    
    //Sobrescrevendo métodos abstratos na interface
    @Override
    public void abrir() {
        this.setAberto(true);
        System.out.println("Livro aberto");
    }
    @Override
    public void fechar() {
        this.setAberto(false);
        System.out.println("Livro fechado");
    }
    @Override
    public void folhear(int n) {
        this.setPagAtual(n);
        System.out.println("Página: "+this.getPagAtual());
    }
    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual()+1);
        System.out.println("Página: "+this.getPagAtual());
    }
    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual()-1);
        System.out.println("Página: "+this.getPagAtual());
    }
}
