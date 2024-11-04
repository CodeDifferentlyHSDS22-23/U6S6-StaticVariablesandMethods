package partA.ex01;

public class Team {
        private String name;
        private boolean isActive;
        private int teamCode;

        public Team(String name, boolean isActive, int teamCode){
            this.name = name;
            this.isActive = isActive;
            this.teamCode = teamCode;
        }

        public String getName(){
            return name;
        }
        public boolean getIsActive(){
            return isActive;
        }

        public void setIsActive(int code){
            if(code != teamCode){
                System.out.println("Incorrect code");
            }
            else{
                if(isActive == true){
                    isActive = false;
                    System.out.println("Team " +name +" is retired");
                }
                else{
                    isActive = true;
                    System.out.println("Team " +name +" is on the team");
                }
            }
        }
    }

