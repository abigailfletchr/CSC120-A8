public class Game implements Contract {

    /**
     * lonely player is the player created from the Player class
     * lastAction is the last action completed by the player or in the game
     */
    Player lonelyPlayer;
    String lastAction;

    /**
     * Default constructor for the Game class
     */
    public Game(){
        this.lonelyPlayer = new Player();
        lastAction = null;
        System.out.println("Our game has been created.");
    }

    /**
     * Method that grabs an item and puts it in the players left hand
     * @param item the object grabbed
     */
    public void grab(String item){
        lonelyPlayer.putInLeftHand(item);
    }

    /**
     * Method that drops an item and removes it from the players left hand
     * @param item the object dropped
     * @return a message saying the item is dropped
     */
    public String drop(String item){
        lonelyPlayer.takeOutOfLeftHand(item);
        return item + " dropped.";
    }


    /**
     * Method that examines an item once it is put in the players right hand. 
     * Item is kept if player wants it or it is dropped.
     * @param item the object examined
     */
    public void examine(String item){
        if(this.lonelyPlayer.getWant()){
            this.lonelyPlayer.putInRightHand(item);
        }else{
            drop(item);
        }
    } 

    /**
     * Method that "uses" or interacts with an object(item)
     * @param item the object the player interacts with
     */
    public void use(String item){
        System.out.println(this.lonelyPlayer.playWithItem(item));
    }

    /**
     * Method that makes the player walk
     * @param direction the direction the player will walk in
     */
    public boolean walk(String direction){
        return this.lonelyPlayer.walk(direction);
    }

    /**
     * Method that makes the player fly
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public boolean fly(int x, int y){
        return this.lonelyPlayer.fly(x, y);
    }

    /**
     * Abstract method that reduces the players size
     */
    public Number shrink(){
        this.lonelyPlayer.changeSize(25);
        return this.lonelyPlayer.getSize();
    }

    /**
     * Abstract method that increases the players size
     */
    public Number grow(){
        this.lonelyPlayer.changeSize(75);
        return this.lonelyPlayer.getSize();
    } 

    /**
     * Method that makes the player rest and adds health points if resting
     */
    public void rest(){
        this.lonelyPlayer.addHealth(1);
        System.out.println("I'm laying down!");
    }

    /**
     * Method that "undo's" the previous action of the player or the game
     */
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
                System.out.println("We're walking back.");
            }else if(lastAction == "fly"){
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





