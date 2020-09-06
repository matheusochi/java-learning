class Motor {
    int potencia;
    String tipo;
}

class Carro {
    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;
    Motor motor;
    
    void liga() {
        System.out.println("O carro está ligado");
    }

    void acelera(double velocidade) {
        this.velocidadeAtual += velocidade;
    }

    int pegaMarcha() {
        if (this.velocidadeAtual < 0) {
            return -1;
        } else if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
            return 1;
        } else if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
            return 2;
        } 

        return 3;
    }
}

class TestaCarro {
    public static void main(String[] args) {
        Carro meuCarro;
        meuCarro = new Carro();
        meuCarro.cor = "Verde";
        meuCarro.modelo = "Fusca";
        meuCarro.velocidadeAtual = 0;
        meuCarro.velocidadeMaxima = 80;
        // liga o carro
        meuCarro.liga();
        // acelera o carro
        meuCarro.acelera(20);
        System.out.println(meuCarro.velocidadeAtual);
    }
}