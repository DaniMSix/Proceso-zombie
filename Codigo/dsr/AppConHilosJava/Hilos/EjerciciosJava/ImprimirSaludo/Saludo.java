package EjerciciosJava.ImprimirSaludo;

public class Saludo implements Runnable {

    String palabra;

    public Saludo(String palabra){
        this.palabra = palabra;
    }

    @Override
    public void run(){

        while (true){
            System.out.print(palabra + " ");
            try{
                Thread.sleep(200);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

