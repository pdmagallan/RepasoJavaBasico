// EJERCICIO N°1 - CLASE 1
/*1. Vamos a practicar operaciones básicas con números

    a. Utilizando la sentencia while, imprima todos los números entre 2 variables "a"
     y "b". Su código puede arrancar (por ejemplo):

     int numeroInicio = 5;
     int numeroFin = 14;

     Se deberían mostrar los números:
     6,7,8,9,10,11,12,13

     b. A lo anterior, solo muestre los número pares

     c. A lo anterior, con una variable extra, elija si se deben mostrar los números
     pares o impares

     d. Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden

 */

public class Ejercicio1 {

    public static void Ejercicio1a() {
        int numeroInicio = 5;
        int numeroFin = 10;
        int numeroActual = numeroInicio + 1;

        while (numeroActual < numeroFin) {
            System.out.println(numeroActual);
            numeroActual++;

        }
    }

    public static void Ejercicio1b() {
        int numeroInicio = 5;
        int numeroFin = 10;
        int numeroActual = numeroInicio + 1;

        while (numeroActual < numeroFin) {
            if (numeroActual % 2 == 0) { //operacion resto de una division
                System.out.println(numeroActual);
            }
            numeroActual++;
        }
    }

    public static void Ejercicio1c() {
        int numeroInicio = 5;
        int numeroFin = 10;
        int numeroActual = numeroInicio + 1;
        boolean debeMostrarPares = false;
        while ((numeroActual < numeroFin)) {
            if (debeMostrarPares && numeroActual % 2 == 0) {
                System.out.println(numeroActual);
            } else if (!debeMostrarPares && !(numeroActual % 2 == 0)) {
                System.out.println(numeroActual);
            }
            numeroActual++;

        }

    }

    public static void Ejercicio1d(){
        int numeroInicio = 5;
        int numeroFin = 10;
        for (int i = numeroFin-1;i>numeroInicio;i--){
            System.out.println(i);
        }
    }

}
