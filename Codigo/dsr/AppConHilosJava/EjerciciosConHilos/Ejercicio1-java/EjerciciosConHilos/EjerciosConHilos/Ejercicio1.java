

public class Ejercicio1{

    public static void main(String[] args) throws InterruptedException {
        // Se crean los corredores y se les asigna un identificador
        Numeros numero1 = new Numeros('1');
        Numeros numero2 = new Numeros('2');
        Numeros numero3 = new Numeros('3');

        // Se ejecuta cada uno de los corredores en un hilo
        Thread p1 = new Thread(corredor1);
        Thread p2 = new Thread(corredor2);
        Thread p3 = new Thread(corredor3);

        p1.start();
        p1.join();
        p2.start();
        p2.join();
        p3.start();
        p3.join();
    }
}