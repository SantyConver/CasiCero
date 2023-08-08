import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte opcion;
        double a, b, resu;
        opcion = 0;


    }

    public static void sumar() {
        Scanner entrada = new Scanner(System.in);
        double valores, acumulador;
        acumulador = 0;
        valores = 0;
        System.out.println("\nIngrese valores a sumar, para finalizar ingrese \"0\".");

        do {
            valores = entrada.nextDouble();
            acumulador = acumulador + valores;


        }while(valores != 0);

        System.out.println("El resultado es: "+acumulador);
    }


    public static byte imprimirMenu() {
        byte opcion;
        Scanner entrada = new Scanner(System.in);

        System.out.println("-----CALCULADORA-----");
        System.out.println("Opcion 1: Suma");
        System.out.println("Opcion 2: Resta");
        System.out.println("Opcion 3: Multiplicacion");
        System.out.println("Opcion 4: Division");
        System.out.println("Opcion 5: Potencia");
        System.out.println("Opcion 6; Salir");
        System.out.print("\nElija la opcion: ");
        opcion = entrada.nextByte();

        return opcion;
    }
   public static void calculadora(byte opcion){
        Scanner entrada = new Scanner(System.in);

        double a, b, resu;
        opcion = 0;

        do {

            opcion = imprimirMenu();

            switch(opcion){

                case 1:

                    sumar();


                    break;
                case 2:
                    System.out.print("\nIngrese el minuendo: ");
                    a = entrada.nextDouble();
                    System.out.print("\nIngrese el sustraendo: ");
                    b = entrada.nextDouble();

                    resu = a - b;
                    System.out.println(a+" - "+b+" = "+resu);
                    break;
                case 3:
                    System.out.print("\nIngrese el multiplicando: ");
                    a = entrada.nextDouble();
                    System.out.print("Ingrese el multiplicador: ");
                    b = entrada.nextDouble();

                    resu = a * b;
                    System.out.println(a+" x "+b+" = "+resu);
                    break;
                case 4:
                    System.out.print("\nIngres el dividendo: ");
                    a = entrada.nextDouble();
                    System.out.print("Ingrese el divisor: ");
                    b = entrada.nextDouble();

                    resu = a / b;
                    System.out.println(a+" / "+b+" = "+resu);
                    resu = a % b;
                    System.out.println("El resto es: "+resu);
                    break;
                case 5:
                    System.out.print("Ingrese la base: ");
                    a = entrada.nextDouble();
                    System.out.print("ingrese el exponente: ");
                    b = entrada.nextDouble();

                    resu= Math.pow(a , b);
                    System.out.println("La potencia es: "+resu);
                    break;

                case 6:
                    System.out.println("¡El programa a finalizado con exito!");
                    break;
                default:
                    System.out.println("\nOpcion invalida\n");
                    break;
            }


        }while(opcion !=6);

    }
}
