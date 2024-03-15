package EjerciciosJava.Contador;

public class ContadorDescendente implements Runnable {

    String nombreHilo;

    public ContadorDescendente(String nombreHilo){
        this.nombreHilo = nombreHilo;
    }

    @Override
    public void run(){
        for (int i = 100; i >= 1; i--){
            System.out.println(nombreHilo + " " + i);
            try{
                Thread.sleep(100);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}