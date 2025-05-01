package sumamaxima;
import java.util.Scanner;
public class SumaMaxima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de numeros de ingresar: ");
        int n = sc.nextInt();
        int[] numeros = new int[n];
        System.out.println("Ingresa los " + n + " numeros:");
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }
        int sumaMaxima = 0;
        int maxActual = 0;
        int inicio = 0, fin = -1, tempInicio = 0;
        for (int i = 0; i < n; i++) {
            maxActual += numeros[i];
            if (maxActual < 0) {
                maxActual = 0;
                tempInicio = i + 1;
            } else if (maxActual > sumaMaxima) {
                sumaMaxima = maxActual;
                inicio = tempInicio;
                fin = i;
            }
        }
        System.out.println("La suma maxima de una subsecuencia contigua es: " + sumaMaxima);
        if (fin >= inicio) {
            System.out.println("Ocurre desde la posicion " + (inicio + 1) + " hasta la posicion " + (fin + 1));
            System.out.print("Subsecuencia: ");
            for (int i = inicio; i <= fin; i++) {
                System.out.print(numeros[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Todos los numeros son negativos, no hay subsecuencia positiva.");
        }
    }
}
