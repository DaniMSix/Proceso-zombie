#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
int main()
{
    // Creando el proceso hijo
    int pid = fork();
    printf("Id del proceso: %d\n", pid);
    if (pid > 0) // True para el proceso Padre
        sleep(50);
    else if (pid == 0) // True para el proceso Hijo
    {
        printf("\nProceso zombie creado con éxito!");
        printf("\nEstará activo durante 20 segundos\n");
        exit(0);
    }
    else // True cuando el proceso hijo no se pudo crear
        printf("\nLo sentimos! El proceso Hijo no pudo ser creado..");

    return 0;
}