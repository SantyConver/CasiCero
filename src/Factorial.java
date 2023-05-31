import java.util.Scanner;
public class Factorial {
     public static void main(String[] args) {
          int num, factorial, contador;
          Scanner entrada = new Scanner(System.in);
          boolean exit;


          /*System.out.print("Ingrese el numeor a evaluar su factorial: ");
          num = entrada.nextInt();
          contador = 1;
          factorial = num;

          while(contador<num){
               factorial = factorial * contador;
               contador++;
          }
          System.out.println(factorial);*/


          contador = 1;
          do {
               System.out.print("Ingrese el numeor a evaluar su factorial: ");
               num = entrada.nextInt();
               factorial = num;

               while (contador < num) {
                    factorial = factorial * contador;
                    System.out.print(contador+" x ");
                    contador++;
                    if (contador == num) {
                         System.out.println(contador+" = "+factorial);
                    }

               }
               System.out.println("¿Desdea salir del programa?\n Si: Ingrese true.\n No: Ingrese false");
               exit = entrada.nextBoolean();

          }while (exit!=true);












     }

}
