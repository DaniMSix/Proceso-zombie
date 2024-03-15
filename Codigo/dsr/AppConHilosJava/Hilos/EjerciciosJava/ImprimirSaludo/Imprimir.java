package EjerciciosJava.ImprimirSaludo;

public class Imprimir {
    public static void main(String[] args) throws InterruptedException {
        Saludo saludo = new Saludo("Hola");
        Saludo saludo2 = new Saludo("Mundo");

        Thread p1 = new Thread(saludo);
        Thread p2 = new Thread(saludo2);

        p1.start();
        p2.start();
    }
}