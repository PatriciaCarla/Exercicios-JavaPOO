package aula02b;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
        System.out.println("-------------------------");
    }
    public void rabiscar() {
        if(this.tampada==false) {
            System.out.println("Rabiscando");
            System.out.println("-------------------------");
        } else {
            System.out.println("Você precisa destampar a caneta");
            System.out.println("-------------------------");
        }
    }
    
    public void tampar() {
        if (this.tampada==false) {
            this.tampada = true;
            System.out.println("Caneta foi tampada");
            System.out.println("-------------------------");
        } else {
            System.out.println("A caneta já estava tampada");
            System.out.println("-------------------------");
        }
    }
    
    public void destampar() {
        if (this.tampada==true) {
            this.tampada = false;
            System.out.println("Caneta foi destampada");
            System.out.println("-------------------------");
        } else {
            System.out.println("A caneta já estava destampada");
            System.out.println("-------------------------");
        }
    }
}
