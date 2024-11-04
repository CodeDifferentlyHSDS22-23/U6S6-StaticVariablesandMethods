package partA.ex01;

public class PlayerTest {

    public static String team() {
        String response = "";

        Team Lakers = new Team("A1", false, 1234);
        Team Celtics = new Team("B1", false, 1234);
        Team Warriors = new Team("C1", false, 1234);
        Team Sixers = new Team("D1", false, 1234);

        Player LeBron = new Player("LeBron", 2.08, 20, Lakers);

        /* Your code goes here*/



        return response;
    }


    public static void main(String[] args){
        String output = team();
        System.out.println(output);


    }
}
