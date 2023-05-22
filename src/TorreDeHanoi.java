public class TorreDeHanoi {
    public static void main(String[] args) {
        int numDiscos = 3; // Número de discos del juego

        JuegoHanoi juego = new JuegoHanoi(numDiscos);
        juego.mostrarEstado();

        juego.resolver();

        juego.mostrarEstado();
    }
}
