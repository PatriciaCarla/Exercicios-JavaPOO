package Java05b;
public class ContaBanco {
    //Atributos:
    static protected int cont = 1000001;
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    //Métodos:
    public void chamar(String s) {
        System.out.println(s);
    }
    public void abrirConta(String t) {
        if (this.getStatus() == false) {
            this.setTipo(t);
            this.setStatus(true);
            if (t.equals("CC")) {
                this.setSaldo(50f);
                System.out.println("Conta Corrente Aberta");
            } else {
                this.setSaldo(150f);
                System.out.println("Conta Poupança Aberta");
            }
        } else {
            System.out.println("Conta já está Ativa");
        }
    }
    public void fecharConta() {
        if (this.getStatus() == true) {
            if (this.getSaldo() == 0) {
                this.setStatus(false);
                System.out.println("Conta fechada");
            } else if (this.getSaldo() < 0) {
                System.out.println("Conta em débito");
            } else if (this.getSaldo() > 0) { 
                System.out.println("Saldo positivo");
            }
        } else { 
            System.out.println("Conta já está fechada");
        }
    }
    public void depositar(float v) {
        if (this.getStatus()==true) { 
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito concluído");
        } else {
            System.out.println("Conta Inativa");
        }
    }
    public void sacar(float v) {
        if (this.getStatus()==true) {
            if (v <= this.getSaldo()) {
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque realizado");
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Conta Inativa");
        }
    }
    public void pagarMensal() {
        float m;
        if (this.getStatus() == true) {
            if (this.getTipo().equals("CC")) {
                m = 12;
            } else {
                m = 20;
            }
            this.setSaldo(this.getSaldo()-m);
            System.out.println("Mensalidade paga");
        } else { 
            System.out.println("Conta Inativa");
        }
    }
    public void extrato() {
        if (this.getStatus()==true) {
            System.out.println("------------------------------------------------");
            System.out.println("Conta: "+ this.getNumConta());
            System.out.println("Cliente: "+ this.getDono());
            System.out.println("------------------------------------------------");
            System.out.println("Status: Conta ATIVA");
            System.out.println("Tipo: "+ this.getTipo());
            System.out.println("Saldo: "+this.getSaldo());
            System.out.println("------------------------------------------------");
        } else {
            System.out.println("------------------------------------------------");
            System.out.println("Conta: "+ this.getNumConta());
            System.out.println("Cliente: "+ this.getDono());
            System.out.println("------------------------------------------------");
            System.out.println("Status: Conta INATIVA");
            System.out.println("Tipo: "+ this.getTipo());
            System.out.println("------------------------------------------------");
        }
    }
    //Métodos Especiais:
    public ContaBanco(String d) {
        this.saldo = 0;
        this.status = false;
        this.dono = d;
        this.numConta = cont;
        cont++;
    }
    public int getNumConta() {
        return this.numConta;
    }
    public void setNumConta(int n) {
        this.numConta = n;
    }
    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }
    public String getDono() {
        return this.dono;
    }
    public void setDono(String d) {
        this.dono = d;
    }
    public float getSaldo() {
        return this.saldo;
    }
    public void setSaldo(float s) {
        this.saldo = s;
    }
    public boolean getStatus() {
        return this.status;
    }
    public void setStatus(boolean s) {
        this.status = s;
    }    
}
