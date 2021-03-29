package aula13b;

public class Cachorro extends Lobo{
    
    @Override
    public void emitirSom() {
        System.out.println("Latido");
    }
    public void reagir(String interacao) {
        if (interacao.equals("Toma comida") || interacao.equals("Olá")) {
            System.out.println("Abanar e latir");
        }else{
            System.out.println("Rosnar");
        }
    }
    public void reagir(int hora){
        if (hora<12) {
            System.out.println("Abanar");
        }else if (hora<18){
            System.out.println("Abanar e latir");
        }else {
            System.out.println("Ignorar");
        }
    }
    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Abanar");
        }else {
            System.out.println("Rosnar e latir");
        }
    }
    public void reagir(int idade, float peso) {
        if (idade<5){
            if(peso<10){
                System.out.println("Abanar");
            }else{
                System.out.println("Latir");
            }
        }else{
            if(peso<10){
                System.out.println("Rosnar");
            }else{
                System.out.println("Ignorar");
            }
        }
    }

    public Cachorro() {
    }
}
