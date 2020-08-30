class BalancoTrimestral {
    public static void main(String[] args) {
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        int	gastosTrimestre	= gastosJaneiro	+ gastosFevereiro +	gastosMarco;
        int mediaMensal = (gastosJaneiro + gastosFevereiro + gastosMarco) / 3;
        String outMediaMensal = "Média mensal = " + mediaMensal;

        System.out.println(gastosTrimestre);
        System.out.println(outMediaMensal);
    }
}