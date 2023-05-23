import java.util.Scanner;
public class Edades {
    public static void main(String[] args) {
        int edad,edades,promedio,contador;
        contador = 0;
        edades = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca la edad: ");
        edad = entrada.nextInt();
        while(edad == 0 || edad >115){
                System.out.print("Vuelva a ingresar la edad: ");
                edad = entrada.nextInt();
        }
        while (edad > 0) {

                contador++;
                edades = edades + edad;
                promedio = edades / contador;

                System.out.println("La suma es: " + edades + "\n El promedio es: " + promedio);

                System.out.print("Introduzca la siguiente edad: ");
                edad = entrada.nextInt();

        }
    }


}

