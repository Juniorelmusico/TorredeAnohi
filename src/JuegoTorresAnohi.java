public class JuegoTorresAnohi {
    private int numDiscos;
    private Torre torreOrigen;
    private Torre torreDestino;
    private Torre torreAuxiliar;

    public JuegoTorresAnohi(int numDiscos) {
        this.numDiscos = numDiscos;
        torreOrigen = new Torre();
        torreDestino = new Torre();
        torreAuxiliar = new Torre();
    }

    public void resolver() {
        moverDiscos(numDiscos, torreOrigen, torreDestino, torreAuxiliar);
    }

    private void moverDiscos(int n, Torre origen, Torre destino, Torre auxiliar) {
        if (n == 1) {
            int disco = origen.pop();
            destino.push(disco);
            System.out.println("Mover disco " + disco + " de " + origen + " T1 " + destino);
            return;
        }

        moverDiscos(n - 1, origen, auxiliar, destino);

        int disco = origen.pop();
        destino.push(disco);
        System.out.println("Mover disco " + disco + " de " + origen + " T1 " + destino);

        moverDiscos(n - 1, auxiliar, destino, origen);
    }
}

