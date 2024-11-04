package partA.ex01;

public class Player {
    //Fields
    private String name;
    private double height;
    private int yearsInLeague;
    private Team team;

    //Constructor
    public Player(String name, double height, int yearsInLeague, Team team){
        this.name = name;
        this.height = height;
        this.yearsInLeague = yearsInLeague;
        this.team = team;
    }

    //Methods
    public void think(){
        System.out.println("I'll get my Win.");
    }
    public void display(){
        System.out.println("Name: " +getName());
        System.out.println("Height: " +getHeight() +"m");
        System.out.println("Years in League: " +getYearsInLeague() +" yrs");
        System.out.println("Team: " +getTeam().getName());
    }

    //Getters
    public String getName() {
        return name;
    }
    public double getHeight() {
        return height;
    }
    public int getYearsInLeague() {
        return yearsInLeague;
    }
    public Team getTeam() {
        return team;
    }
    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setYearsInLeague(int yearsInLeague) {
        this.yearsInLeague = getYearsInLeague();
    }
    public void setCell(Team cell) {
        this.team = cell;
    }
}
