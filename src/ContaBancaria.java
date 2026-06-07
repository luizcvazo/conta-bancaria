public class ContaBancaria {

    double saldo;
    double chequeEspecial;
    double chequeUsado;

    public ContaBancaria (double depositoInicial) {
        this.saldo = depositoInicial;
        this.chequeUsado = 0;

        if (depositoInicial <= 500) {
            this.chequeEspecial = 50;
        } else {
            this.chequeEspecial = depositoInicial * 0.5;
        }

    }

    public double getSaldo() {
        return saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public double getChequeUsado() {
        return chequeUsado;
    }

    public void depositar(double valor) {

        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return;
        }

        if (chequeUsado > 0) {
            cobrarTaxaCheque();
        }

        saldo += valor;
        System.out.println("Saldo adicionado" + valor);
        System.out.println(saldo);
    }

    public void sacar (double valor) {

        if (valor <= 0){
            System.out.println("Valor inválido!");
            return;
        }

        double limiteTotal = saldo + chequeEspecial;

        if (valor > limiteTotal) {
            System.out.println("Saldo insuficiente!");
            return;
        }

        if (valor <= saldo) {
            saldo -= valor;
        } else {
            chequeUsado = valor - saldo;
            saldo = 0;
        }

        System.out.println("Saque de R$" + valor + " realizado! Saldo atual: R$" + saldo);

    }

    public void pagarBoleto (double valor) {

        if (valor <= 0){
            System.out.println("Valor inválido!");
            return;
        }

        double limiteTotal = saldo + chequeEspecial;

        if (valor > limiteTotal) {
            System.out.println("Saldo insuficiente!");
            return;
        }

        if (valor <= saldo) {
            saldo -= valor;
        } else {
            chequeUsado = valor - saldo;
            saldo = 0;
        }

        System.out.println("Pagamento do boleto no valor R$" + valor + " realizado! Saldo atual: R$" + saldo);

    }

    public void consultarSaldo (){
        System.out.println("Saldo atual: R$ " + saldo);
        System.out.println("Limite de cheque especial: R$ " + chequeEspecial);
        System.out.println("Cheque especial usado: R$ " + chequeUsado);
    }

    public void verificarChequeEspecial () {
        if (chequeUsado > 0) {
            System.out.println("Cheque especial no valor de R$ " + chequeUsado + "usado.");
        } else {
            System.out.println("Não utilizou cheque especial");
        }
    }

    public void cobrarTaxaCheque () {
        double taxa = chequeUsado * 0.20;

        if (saldo >= taxa) {
            saldo -= taxa;
        } else {
            chequeUsado = taxa - saldo;
        }

        chequeUsado = 0;
        System.out.println("Taxa de R$" + taxa + " cobrada pelo uso do cheque especial!");
    }

    public void consultarChequeEspecial (){
        System.out.println("Limite do cheque especial: R$" + chequeEspecial);
        System.out.println("Cheque especial usado: R$" + chequeUsado);
        System.out.println("Cheque especial disponível: R$" + (chequeEspecial - chequeUsado));
    }

}
