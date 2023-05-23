import java.util.Scanner;
public class TablasMultiplicar {
    public static void main(String[] args) {
        int tabla, contador;
        Scanner entrada = new Scanner(System.in);
        contador = 1;
        do {
            System.out.print("Introduzca la tabla a revisar: ");
            tabla = entrada.nextInt();

            if (tabla >0 && tabla <=10) {
                System.out.println("----Se selecciono la tabla del " + tabla + "----");
                while (contador <= 10) {
                    System.out.println(tabla * contador);
                    contador++;
                }
                contador = 1;

            }
        }while(tabla >0 && tabla <=10);
        System.out.println("Se ha finalizado el programa.");


    }
 }
