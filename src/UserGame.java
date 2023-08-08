
public class UserGame {

    private int id;
    private int points;
    private int level;

    private String name;
    private String pass;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    public UserGame(){

    }

    public UserGame(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public void addPoints(){
        System.out.println("Se han aumentado los puntos en: 1");
        points++;

    }

    public void upLevel(){
        System.out.println("Se ha el nivel en : 1");
        level++;
    }

    public void bonus(int value){
        points = points + value;

    }



}
