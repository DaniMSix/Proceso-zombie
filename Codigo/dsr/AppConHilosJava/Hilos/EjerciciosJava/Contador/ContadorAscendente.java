package EjerciciosJava.Contador;

public class ContadorAscendente implements Runnable {

    String nombreHilo;

    public ContadorAscendente(String nombreHilo){
        this.nombreHilo = nombreHilo;
    }

    @Override
    public void run(){
        for (int i = 1; i <= 100; i++){
            System.out.println(nombreHilo + " " + i);
            try{
                Thread.sleep(100);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
