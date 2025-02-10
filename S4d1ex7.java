public class Main {
    public static void main(String[] args) {
        double[] carteira = new double[]{1000.0, 2000.0, 1500.0};
        double[] retornoMedio = new double[]{0.05, 0.03, 0.04};
        System.out.println(simularCarteira(carteira, retornoMedio));
        }

        static double simularCarteira(double[] carteira, double[] retornoMedio){
        double valorFinal = 0;
            for (int i = 0; i < carteira.length; i++) {
                valorFinal += carteira[i]*Math.pow(1+retornoMedio[i],1);
            }
            return valorFinal;
        }

}
