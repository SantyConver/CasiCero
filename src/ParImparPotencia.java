import java.util.Scanner;
public class ParImparPotencia {
    public static void main(String[] args) {

        double num, potencia;
        Scanner entrada = new Scanner(System.in);

        System.out.print("\nIngrese el numero a evaluar: ");
        num = entrada.nextInt();

        while (num != 0) {

            if(num % 2 == 0){
                System.out.println("El numero ingresado es par.");

                potencia = Math.pow(num , 2);
                System.out.println("El numero ingresado elevado al cuadrado es: "+ potencia);

            }
            else{
                System.out.println("El numero ingresado es impar");

                potencia = Math.pow(num , 2);
                System.out.println("El numero ingresado elevado al cuadrado es: "+ potencia);
            }
            System.out.println("Ingrese el siguiente numero: ");
            num = entrada.nextInt();
        }
        System.out.println("el programa ha finalizado.");









    }

}