package aula13b;

public class Aula13b {

    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        Lobo l = new Lobo();
        c.emitirSom();
        c.reagir("Olá");
        //c.reagir("Toma comida");
        c.reagir("Vai apanhar");
        c.reagir(11);
        c.reagir(21);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2,12.5f);
        c.reagir(17,4.5f);
        l.emitirSom();
    }
}