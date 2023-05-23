import java.util.Scanner;
public class Edades {
    public static void main(String[] args) {
        int edades,promedio,contador,escape;
        contador = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca la edad, se aceptan numeros del 1 al 115.");
        edades = entrada.nextInt();

        while (true){

            contador++;
            promedio = edades / contador;
            System.out.println("La suma es: " + edades + "\n El promedio es: " + promedio);

            System.out.println("¿Desea cerrar el programa?" + "\n Si es asi, introduzca un numero negativo");
            escape = entrada.nextInt();

            if(escape <0)
                 break;

             System.out.println("Introduzca la siguiente edad:");
            edades = edades + entrada.nextInt();

        }























    }

}
