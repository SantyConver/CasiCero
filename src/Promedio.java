import java.util.Scanner;
public class Promedio {
    public static void main(String[]args){
        double notas,promedio;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la primer nota.");
        notas = entrada.nextDouble();

        System.out.println("Ingrese la segunda nota");
        notas = notas + entrada.nextDouble();

        System.out.println("Ingrese la tercer nota.");
        notas = notas + entrada.nextDouble();

        System.out.println("Ingrese la cuarta nota");
        notas = notas + entrada.nextDouble();

        promedio = notas / 4;

        if (promedio >= 0 && promedio <=4){
            System.out.println("Aplazo: " + promedio);
        }
        if (promedio >=4 && promedio<=6.45);{
            System.out.println("Desaprobado: " + promedio);
        }
        if (promedio >=6.50 && promedio <=10){
            System.out.println("Aprobado: " + promedio);
        }

    }
}
