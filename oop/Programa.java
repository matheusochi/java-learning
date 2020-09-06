class Cliente {
    String nome;
    String sobrenome;
    String cpf;
}

class Conta {
    int numero;
    Cliente titular;
    double saldo;

    boolean saca(double quantidade) {
        if (this.saldo < quantidade) { 
            return false;
        } else {
            this.saldo -= quantidade;
            return true;
        }
    }

    void deposita(double quantidade) {
        this.saldo += quantidade;
    }

    boolean transfere(Conta destino, double valor) {
        boolean retirou = this.saca(valor);

        if(retirou) {
            destino.deposita(valor);
            System.out.println("Valor de " + valor + " transferido com sucesso! Saldo atual: " + this.saldo);
            return true;
        } else {
            return false;
        }
    }
}

class Programa {
    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();
        Cliente c;
        c = new Cliente();
        minhaConta.titular = c;
        minhaConta.saldo = 1000.0;
        minhaConta.saca(200);
        minhaConta.deposita(500);

        Conta outraConta;
        outraConta = new Conta();

        minhaConta.transfere(outraConta, 500);
    }
}
