public class JuegoHanoi {
    private int numDiscos;
    private Pila<Integer> paloA;
    private Pila<Integer> paloB;
    private Pila<Integer> paloC;

    public JuegoHanoi(int numDiscos) {
        this.numDiscos = numDiscos;
        paloA = new Pila<>();
        paloB = new Pila<>();
        paloC = new Pila<>();

        for (int i = numDiscos; i > 0; i--) {
            paloA.push(i);
        }
    }

    public void resolver() {
        resolverTorre(numDiscos, paloA, paloC, paloB);
    }

    private void resolverTorre(int n, Pila<Integer> origen, Pila<Integer> destino, Pila<Integer> auxiliar) {
        if (n > 0) {
            resolverTorre(n - 1, origen, auxiliar, destino);

            int disco = origen.pop();
            destino.push(disco);
            System.out.println("Mover disco " + disco + " de " + origen + " a " + destino);

            resolverTorre(n - 1, auxiliar, destino, origen);
        }
    }

    public void mostrarEstado() {
        System.out.println("Estado de los palos:");
        System.out.println("Palo A: " + paloA);
        System.out.println("Palo B: " + paloB);
        System.out.println("Palo C: " + paloC);
        System.out.println();
    }
}
