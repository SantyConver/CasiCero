import java.util.Scanner;
public class Factorial {
     public static void main(String[] args) {
          int num, factorial, contador;
          Scanner entrada = new Scanner(System.in);

          System.out.print("Ingrese el numeor a evaluar su factorial: ");
          num = entrada.nextInt();
          contador = 1;
          factorial = num;

          while(contador<num){
               factorial = factorial * contador;
               contador++;
          }
          System.out.println(factorial);














     }

}
