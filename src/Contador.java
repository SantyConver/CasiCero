import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {

        int contador, num;
        contador = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el numero limite: ");
        num = entrada.nextInt();
        do {
            contador++;
            System.out.print(contador+", ");
        }while(contador < num);





    }
}
