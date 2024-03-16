using System;
using System.Threading;

namespace AppConHilosATM{
    class Program
    {
    static int accountBalance = 1000; // Saldo inicial de la cuenta
    static Random random = new Random();

    static void PerfomTransaction(object? threadId)
    {
        for (int i =0; i < 5; i++)
        {
            // Genera una cantidad aleatoria para retirar entre $10  y $100
            int amountToWithdraw = random.Next(10, 101);

            // Simular algún tiempo de procesamiento
            Thread.Sleep(500);

            // Utilice un candado para garantizar que solo un hilo acceda al saldo a la vez
            lock  (typeof(Program))
            {
                if (accountBalance >= amountToWithdraw)
                {
                    accountBalance -= amountToWithdraw;
                    Console.WriteLine($"Thread {threadId}: Se retiraron ${amountToWithdraw} pesos. Quedan ${accountBalance} pesos");
                }
                else
                {
                    Console.WriteLine($"Thread {threadId}: Fondos insuficientes. Se requieren: ${amountToWithdraw} pesos.");
                }
            }
        }
    }

    static void Main(string[] args)
    {
        Console.WriteLine("¡Bienvendo al cajero automático!");
        Console.WriteLine($"Cuentas con ${accountBalance} pesos");
        Console.WriteLine("Presione Enter para iniciar transacciones...");
        Console.ReadLine();

        // Crea múltiples hilos para simular transacciones en cajeros automáticos
        Thread[] threads = new Thread[5];
        for (int i = 0;  i < threads.Length; i++)
        {
            threads[i] = new Thread(PerfomTransaction);
            threads[i].Start(i + 1);
        }

        // Espera a que se completen los hilos

        foreach (Thread thread in threads)
        {
            thread.Join();
        }

        Console.WriteLine("Todas las transacciones completadas.");
        Console.WriteLine($"Saldo final de la cuenta: ${accountBalance} pesos");
        }
    }
}