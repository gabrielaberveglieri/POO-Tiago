public class ContaPoupanca extends Conta {

    private float saldoPoupanca;

    public ContaPoupanca(String agencia, String numero, float saldo, float saldoPoupanca) {
        super(agencia, numero, saldo);
        this.saldoPoupanca = saldoPoupanca;
    }

    public float getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(float saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }

    public void saque(float valor) {
        if (saldo + saldoPoupanca < valor) {
            System.out.println("O saldo é insuficiente!");
        } else {
            if (saldo < valor) {
                valor -= saldo;
                saldo = 0;
                saldoPoupanca -= valor;
            } else {
                saldo -= valor;
            }
            System.out.println("Saque efetuado com sucesso!");
        }
    }
}
