package aula02b;

public class Aula02b {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 90;
        c1.tampada = false;
        
        c1.status();
        c1.destampar();
        c1.tampar();
        c1.status();
        c1.rabiscar();
        c1.destampar();
        c1.rabiscar();   
        
        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.cor = "Vermelha";
        c2.ponta = 1.0f;
        c2.carga = 10;
        c2.tampada = true;
                
        c2.status();
        c2.destampar();
        c2.tampar();
        c2.status();
        c2.rabiscar();
        c2.destampar();
        c2.rabiscar();
    }
}
