import java.util.Scanner;
public class DiayMes {
    public static void main(String[] args) {
        short dia, mes;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero del 1 al 7 para determinar el dia de la semana.");
        dia = entrada.nextShort();
        switch (dia) {

            case 1: {
                System.out.println("El dia es Lunes.");
                break;
            }
            case 2: {
                System.out.println("El dia es Martes.");
                break;
            }
            case 3: {
                System.out.println("El dia es Miercoles.");
                break;
            }
            case 4: {
                System.out.println("El dia es Jueves.");
                break;
            }
            case 5: {
                System.out.println("El dia es Viernes.");
                break;
            }
            case 6: {
                System.out.println("El dia es Sabado.");
                break;
            }
            case 7: {
                System.out.println("El dia es Domingo.");
                break;
            }
        }
        System.out.println("Ingrese un numero del 1 al 12 para determinar el mes.");
        mes = entrada.nextShort();

        switch (mes) {

            case 1: {
                System.out.println("El mes es Enero.");
                break;
            }
            case 2: {
                System.out.println("El mes es Febrero.");
                break;
            }
            case 3: {
                System.out.println("El mes es Marzo.");
                break;
            }
            case 4: {
                System.out.println("El mes es Abril.");
                break;
            }
            case 5: {
                System.out.println("El mes es Mayo.");
                break;
            }
            case 6: {
                System.out.println("El mes es Junio.");
                break;
            }
            case 7: {
                System.out.println("El mes es Julio.");
                break;
            }
            case 8:{
                System.out.println("El mes es Agosto.");
                break;
            }
            case 9: {
                System.out.println("El mes es Septiembre.");
                break;
            }
            case 10: {
                System.out.println("El mes es Octubre.");
                break;
            }
            case 11: {
                System.out.println("El mes es Noviembre.");
                break;
            }
            case 12: {
                System.out.println("El mes es Diciembre.");
                break;
            }
        }



    }
}
