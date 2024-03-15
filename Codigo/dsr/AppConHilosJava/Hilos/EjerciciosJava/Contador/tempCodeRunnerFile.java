package EjerciciosJava.Contador;

public class Secuencia {
    public static void main(String[] args) throws InterruptedException {
        ContadorAscendente numero1 = new ContadorAscendente("Hilo 1: ");
        ContadorDescendente numero2 = new ContadorDescendente("Hilo 2: ");

        Thread p1 = new Thread(numero1);
        Thread p2 = new Thread(numero2);

        p1.start();
        p2.start();
    }
}