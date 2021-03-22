package ultraemojicombate;
public class Lutador {
    //Atributos
    private String nome;
    private String nacional;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    //Métodos especiais
    public Lutador(String no, String na, int i, float a, float p, int v, int d, int e) {
        setNome(no);
        setNacional(na);
        setIdade(i);
        setAltura(a);
        setPeso(p);
        setVitorias(v);
        setDerrotas(d);
        setEmpates(e);
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String n) {
        this.nome = n;
    }
    public String getNacional() {
        return this.nacional;
    }
    public void setNacional(String n) {
        this.nacional = n;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int i) {
        this.idade = i;
    }
    public float getAltura() {
        return this.altura;
    }
    public void setAltura(float a) {
        this.altura = a;
    }
    public float getPeso() {
        return this.peso;
    }
    public void setPeso(float p) {
        this.peso = p;
        setCategoria();
    }
    public String getCategoria() {
        return this.categoria;
    }
    private void setCategoria() {
        if (getPeso() < 52.2f) {
            categoria = "Inválido";
        } else if (getPeso() <= 70.3f) {
            categoria = "Leve";
        } else if (getPeso() <= 83.9f) {
            categoria = "Médio";
        } else if (getPeso() <= 120.2f){
            categoria = "Pesado";
        } else {
            categoria = "Inválido";
        }
    }
    public int getVitorias() {
        return this.vitorias;
    }
    public void setVitorias(int v) {
        this.vitorias = v;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int d) {
        this.derrotas = d;
    }
    public int getEmpates() {
        return this.empates;
    }
    public void setEmpates(int e) {
        this.empates = e;
    }    
    //Métodos
    public void apresentacao() {
        System.out.printf("Desse lado, diretamente de seu país %s, pesando %.2f quilos, %.2f de altura, %d vitórias,"
                + " %d derrotas e %d empates, o %s!! \n\n",this.getNacional(),this.getPeso(),this.getAltura(),this.getVitorias(),
                this.getDerrotas(),this.getEmpates(),this.getNome());
    }
    public void apresentar() {
        System.out.println("Nome: " + getNome());
        System.out.println("Nacionalidade: " + getNacional());
        System.out.println("Idade :" + getIdade());
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Vitórias: " + getVitorias());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.printf("Empates: " + getEmpates() + "\n\n");        
    }
    public void status() {
        System.out.println(getNome());
        System.out.println("Categoria: " + getCategoria());
        System.out.println(getVitorias() + " Vitórias");
        System.out.println(getDerrotas() + " Derrotas");
        System.out.printf(getEmpates() + " Empates\n\n");
        
    }
    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }
    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }
    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
}
