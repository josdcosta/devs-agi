import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double[] monteCarlo = simularPrecoMonteCarlo(100.0, 0.001, 0.02, 10);
        for (int i = 0; i < monteCarlo.length; i++) {
            System.out.println(monteCarlo[i]);
        }
    }
        static double[] simularPrecoMonteCarlo(double precoInicial, double mediaDiaria, double volatilidadeDiaria, int periodo){
            Random random = new Random();
            double[] precosSimulados = new double[periodo];
            double caminhadaAleatoria = precoInicial;
            for (int i = 0; i < periodo; i++) {
                caminhadaAleatoria = caminhadaAleatoria*Math.pow(Math.E, mediaDiaria + volatilidadeDiaria*random.nextGaussian());
                precosSimulados[i] = caminhadaAleatoria;
            }
            return precosSimulados;
        }
}