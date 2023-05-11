import java.util.Scanner;

public class FuncionCuadratica {
    public static void main(String[] args){
        double a,b,c,x1,x2,resu;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor de \"a\". ");
        a = entrada.nextDouble();
        System.out.println("Ingrese el valor de \"b\". ");
        b = entrada.nextDouble();
        System.out.println("Ingrese el valor de \"c\". ");
        c = entrada.nextDouble();
        resu = Math.pow(b, 2) - 4 * a * c;

    if (resu <0){
            System.out.println("La raiz es negativa.");
        }
        else{
            resu = resu / (2 * a);

            x1 = -b + resu;
            x2 = -b - resu;


            System.out.println("X1 es: " + x1);
            System.out.println("X2 es: " + x2);

        }



    }

}
