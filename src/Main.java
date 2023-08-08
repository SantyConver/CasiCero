import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        UserGame p1 = new UserGame(ent.next(), ent.next());

        p1.addPoints();

    }

}
