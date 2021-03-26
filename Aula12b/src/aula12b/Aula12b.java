package aula12b;
public class Aula12b {
    public static void main(String[] args) {
        //Animal a = new Animal;
        Mamifero m = new Mamifero(30f,10,4,"Castanho");
        Reptil r = new Reptil(5f,8,0,"Verdes");
        Peixe p = new Peixe(2f,2,3,"Azul");
        Ave a = new Ave(0.5f,1,4,"Amarelo");
        
        m.locomover();
        m.alimentar();
        m.emitirSom();
        
        r.locomover();
        r.alimentar();
        r.emitirSom();
        
        p.locomover();
        p.alimentar();
        p.emitirSom();
        
        a.locomover();
        a.alimentar();
        a.emitirSom();
        
        Canguru c = new Canguru(100f,15,5,"Caramelo");
        Cachorro k = new Cachorro(20f,12,4,"Caramelo");
        Cobra s = new Cobra(5f,3,0,"Verde");
        Tartaruga t = new Tartaruga(5f,15,5,"Verde");
        PeixeDourado d = new PeixeDourado(1f,1,3,"Dourado");
        Arara ra = new Arara(1f,1,4,"Azul");
        
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();
        
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.abanarRabo();
        k.enterrarOsso();
        
        s.locomover();
        s.alimentar();
        s.emitirSom();
        
        t.locomover();
        t.alimentar();
        t.emitirSom();
        
        d.locomover();
        d.alimentar();
        d.emitirSom();
        
        ra.locomover();
        ra.alimentar();
        ra.emitirSom();
    }
}