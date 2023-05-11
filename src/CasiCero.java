import java.util.Scanner;
public class CasiCero {
    public static void main(String[] args) {

        double casicero;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el numero a evaluar si es \"casi cero\".");
        casicero = entrada.nextDouble();

        if (casicero > -1 && casicero <0 || casicero >0 && casicero <1) {
            System.out.println("El numero ingresado es casi cero.");
        }
        else System.out.println("No es casi cero");


    }
}