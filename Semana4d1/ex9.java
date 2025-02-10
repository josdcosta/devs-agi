public class Main {
    public static void main(String[] args) {
        double[] serie1 = new double[]{100.0, 102.0, 104.0, 106.0};
        double[] serie2 = new double[]{50.0, 51.0, 52.0, 53.0};
        System.out.println(calcularCorrelacao(serie1, serie2));
        }

        static double calcularCorrelacao(double[] x, double[] y){
            double desvPadx = desvPad(x);
            double desvPady = desvPad(y);
            double covarxy = covarxy(x, y);
            return covarxy/(desvPadx*desvPady);
        }

        static double covarxy(double[] x, double[] y){
            double covariancia = 0;
            double mediax = media(x);
            double mediay = media(y);
            for (int i = 0; i < x.length; i++) {
                covariancia += (x[i]-mediax)*(y[i]-mediay);
            }
            return covariancia/x.length;
        }

        static double desvPad(double[] retornoAcoes) {
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