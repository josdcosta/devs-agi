public class Main {
    public static void main(String[] args) {
        double[] retornoAcoes = new double[]{0.01, 0.02, -0.01, 0.03, -0.02};
        double desvPad = calcularVolatilidade(retornoAcoes);
        System.out.println(desvPad);
    }


    static double calcularVolatilidade(double[] retornoAcoes) {
        double media = media(retornoAcoes);
        double somaQuadradosdaDif = 0;
        for (int i = 0; i < retornoAcoes.length; i++) {
            somaQuadradosdaDif += Math.pow((retornoAcoes[i]-media),2);
        }
        return Math.sqrt(somaQuadradosdaDif/retornoAcoes.length);
    }

    static double media(double[] vetor){
        double somaVetor = 0;
        for (int i = 0; i < vetor.length; i++) {
            somaVetor += vetor[i];
        }
        return somaVetor/vetor.length;
    }
}
