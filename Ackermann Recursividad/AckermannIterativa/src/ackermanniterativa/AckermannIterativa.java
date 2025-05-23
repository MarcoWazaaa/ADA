package ackermanniterativa;
import java.util.Scanner;
import java.util.Stack;
public class AckermannIterativa {

    public static int ackermann(int m, int n) {
        Stack<Integer> stack = new Stack<>();
        stack.push(m);
        while (!stack.isEmpty()) {
            m = stack.pop();
            if (m == 0) {
                n = n + 1;
            } else if (n == 0) {
                stack.push(m - 1);
                n = 1;
            } else {
                stack.push(m - 1);
                stack.push(m);
                n = n - 1;
            }
        }
        
        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Funcion de Ackermann");
        System.out.println("\nSolamente da el resultado al instante siempre y cuando");
        System.out.println("el m no sea mayor de 3, luego de eso el tiempo de espera se dispara");
        System.out.print("\nIngrese el valor de m: ");
        int m = scanner.nextInt();
        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();
        long inicio = System.nanoTime(); 
        int resultado = ackermann(m, n);
        long fin = System.nanoTime(); 
        long tiempoTotal = (fin - inicio)/1000000;
        
        System.out.println("\nResultado: A(" + m + ", " + n + ") = " + resultado);
        System.out.println("Tiempo de ejecucion: " + tiempoTotal + " milisegundos");

    }
}
