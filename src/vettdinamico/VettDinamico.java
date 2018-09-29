package vettdinamico;

public class VettDinamico {

    public static void main(String[] args) {
        VettoreDinamico v = new VettoreDinamico();
        for (int i = 0; i < 30; i++) {
            v.add(-i);
        }
        System.out.println(v);
    }
}

class VettoreDinamico {

    private double[] vettore;
    private int lungStatica;  // lunghezza potenziale
    private int lungDinamica; // lunghezza effettiva

    public VettoreDinamico() {
        lungStatica = 10;
        lungDinamica = 0;
        vettore = new double[lungStatica];
    }

    public void add(double d) {
        if (lungDinamica == lungStatica) {
            lungStatica *= 2;
            double[] tmp = new double[lungStatica];
            for (int i = 0; i < lungDinamica; i++) {
                tmp[i] = vettore[i];
            }
            vettore = tmp;
        }
        vettore[lungDinamica++] = d;
    }

    public String toString() {
        String str = "Il vettore dinamico:\n";
        for (int i = 0; i < lungDinamica; i++) {
            str += vettore[i] + "\t";
            if ((i + 1) % 10 == 0) {
                str += "\n";
            }
        }
        return str;
    }
}
