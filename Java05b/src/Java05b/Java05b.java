package Java05b;
public class Java05b {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco("Maria Gonzaga da Silva");
        ContaBanco c2 = new ContaBanco("José Bezerra");
        ContaBanco c3 = new ContaBanco("Marília Gabriela");
        ContaBanco c4 = new ContaBanco("Nick Tyler");
        c4.extrato();
        c4.abrirConta("CC");
        c4.extrato();
        c4.depositar(5f);
        c4.extrato();
        c4.sacar(0.1f);
        c4.pagarMensal();
        c2.abrirConta("CP");
        c2.extrato();
        c2.sacar(150f);
        c2.fecharConta();
        c4.chamar(c4.getDono());
    }
}