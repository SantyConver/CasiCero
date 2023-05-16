import java.util.Scanner;
public class ContadorCifras {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un numero al cual se le evaluaran las cifras");
        num = ent.nextInt();

        if (num > 0 && num <= 9) {
            System.out.println("El numero tiene una cifra");
        }
            else if (num >9 && num <=99) {
                System.out.println("El numero tiene dos cifras");
            }
                else if (num >99 && num <=999){
                    System.out.println("El numero tiene tres cifras");
                }
                    else if (num >999 && num <=9999) {
                        System.out.println("El numero tiene cuatro cifras");
                    }
                        else if (num <9999 && num <=99999){
                            System.out.println("El numero tiene cinco cifras");

                        }




    }
}
