import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        double a, b, resu;

        do {
            System.out.println("-----CALCULADORA-----");
            System.out.println("Opcion 1: Suma");
            System.out.println("Opcion 2: Resta");
            System.out.println("Opcion 3: Multiplicacion");
            System.out.println("Opcion 4: Division");
            System.out.println("Opcion 5: Potencia");
            System.out.println("Opcion 6; Salir");
            System.out.print("\nElija la opcion: ");
            opcion = entrada.nextInt();

            switch(opcion){

                case 1:
                    System.out.print("\nIngrese el primer valor a sumar: ");
                    a = entrada.nextDouble();
                    System.out.print("\nIngrese el segundo valor a sumar: ");
                    b = entrada.nextDouble();

                    resu = sumar(a , b);
                    System.out.println(a+" + "+b+" = "+resu);
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

     public static double sumar (double num1, double num2){
        double resu;
        resu = num1 + num2;
        return resu;
    }

}
