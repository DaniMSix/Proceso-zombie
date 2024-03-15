import java.lang.Runnable;

public class Programa1 implements Runnable{

    // Este método de la clase Runnable debe ser implementado
    // Se ejecuta al llamar el método star()

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + " subproceso corriendo...");
    }

    public static void main(String[] args){
        // Ejemplo de como se crea un hilo en Java
        Thread hilo = new Thread(new Programa1(), "Hilo1");
        hilo.start();
        System.out.println("Este código esta fuera del hilo.");
    }
}