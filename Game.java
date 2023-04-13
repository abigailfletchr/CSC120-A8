import java.util.ArrayList;

public class Game implements Contract {

    Player lonelyPlayer; // the one singular player in this game
    String lastAction;

    public Game(){
        this.lonelyPlayer = new Player();
        lastAction = null;
        System.out.println("Our game has been created.");
    }

    public void grab(String item){
        lonelyPlayer.putInLeftHand(item);
    }

    public String drop(String item){
        lonelyPlayer.takeOutOfLeftHand(item);
        return item + " dropped.";
    }

    public void examine(String item){
        if(this.lonelyPlayer.getWant()){
            this.lonelyPlayer.putInRightHand(item);
        }else{
            drop(item);
        }
    } 

    public void use(String item){
        System.out.println(this.lonelyPlayer.playWithItem(item));
    }

    public boolean walk(String direction){
        return this.lonelyPlayer.walk(direction);
    }

    public boolean fly(int x, int y){
        return this.lonelyPlayer.fly(x, y);
    }

    public Number shrink(){
        this.lonelyPlayer.changeSize(25);
        return this.lonelyPlayer.getSize();
    }

    public Number grow(){
        this.lonelyPlayer.changeSize(75);
        return this.lonelyPlayer.getSize();
    } 

    public void rest(){
        this.lonelyPlayer.addHealth(1);
        System.out.println("I'm laying down!");
    }

    public void undo(){
        if(lastAction != null){
            if(lastAction == "grab"){
                this.drop("Kettlebell");
            }else if(lastAction == "drop"){
                this.grab("Kettlebell");
            }else if(lastAction == "examine"){
                this.use("Kettlebell");
            }else if(lastAction == "use"){
                this.examine("Kettlebell");
            }else if(lastAction == "walk"){
                // this.walk(oppositeDirection); // where am i getting these from
                System.out.println("We're walking back.");
            }else if(lastAction == "fly"){
                // this.fly(-x, -y); // where am i getting these from
                System.out.println("We're flying back.");
            }else if(lastAction == "shrink"){
                this.grow();
            }else if(lastAction == "grow"){
                this.shrink();
            }else{
                System.out.println("Last action cannot be undone!");
            }
        }else{
            System.out.println("You don't have any previous actions!");
        }
    }


    public static void main(String[] args){
        Game game = new Game();

        game.grab("cup of coffee");
        game.lastAction = "grab";

        game.use("cup of coffee");
        game.lastAction = "use";
    }

}





