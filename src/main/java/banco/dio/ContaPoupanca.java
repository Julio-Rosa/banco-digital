package banco.dio;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtratoComuns() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirExtratoComuns();
    }
}
