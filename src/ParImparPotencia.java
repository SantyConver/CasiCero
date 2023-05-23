import java.util.Scanner;
public class ParImparPotencia {
    public static void main(String[] args) {

        double num, potencia;
        Scanner entrada = new Scanner(System.in);
        num = 1;


        while (num != 0) {
            System.out.println("\nIngrese el numero a evaluar");
            num = entrada.nextDouble();

            if(num % 2 == 0){
                System.out.println("El numero ingresado es par");

                potencia = Math.pow(num , 2);
                System.out.println("El numero ingresado elevado al cuadrado es: "+ potencia);

            }
            else{
                System.out.println("El numero ingresado es impar");

                potencia = Math.pow(num , 2);
                System.out.println("El numero ingresado elevado al cuadrado es: "+ potencia);
            }

            System.out.println("\n¿Desea salir del programa? Si es asi ingrese 0 sino ingrese 1");
            num = entrada.nextDouble();
        }










    }

}