public class Player{

    /**
     * String[] hands is a list with only 2 open spaces to represent the players hands
     * int size is the size the player is
     * int health is the amount of health points a player has
     * boolean want is a boolean value representing if the player wants an object
     * boolean canWalk is a boolean value representing if the player can walk
     * boolean canFly is a boolean value representing if the player can fly
     */
    String[] hands = new String[2];
    int size;
    int health;
    boolean want;
    boolean canWalk;
    boolean canFly;


    /**
     * Default constructor for the Player class
     */
    public Player(){
        this.size = 50;
        this.health = 10;
        this.hands[0] = "empty";
        this.hands[1] = "empty";
        this.want = true;
        this.canWalk = false;
        this.canFly = false;
        System.out.println("Your player has been created.");
    }

    /**
     * Constructor for the Player class
     * @param handObjects A list that represents objects in the players hands
     * @param size the size of the player
     * @param health the health of the player
     * @param want boolean value if the player wants an object or not
     */
    public Player(String[] handObjects, int size, int health, boolean want){
        this.hands = handObjects;
        this.size = size;
        this.health = health;
        this.want = want;
        System.out.println("Your player has been created.");
    }

    /**
     * Accessor that gets the size of the player
     * @return returns the players size
     */
    public int getSize(){
        return this.size;
    }

    /**
     * Accessor that gets the health of the player
     * @return returns the players health
     */
    public int getHealth(){
        return this.health;
    }

    /**
     * Accessors that gets what's in the players hands (the objects)
     * @return returns the objects in the players hands
     */
    public String[] getHands(){
        return this.hands; // fix this later
    }


    /**
     * Manipulator that puts an object in the players "left hand"
     * @param item the desired object
     */
    public void putInLeftHand(String item){
        this.hands[0] = item;
    }

    /**
     * Manipulator that puts an object in the players "right hand"
     * @param item the desired object
     */
    public void putInRightHand(String item){
        this.hands[1] = item;
    }

    /**
     * Method that removes the object from the players left hand
     * @param item the object
     */
    public void takeOutOfLeftHand(String item){
        this.hands[0] = "empty";
    }

    /**
     * Method that removes the object from the players right hand
     * @param item the object
     */
    public void takeOutOfRightHand(String item){
        this.hands[1] = "empty";
    }

    /**
     * Method that adds health to the players current health level
     * @param addBy the amount added to the players health
     */
    public void addHealth(int addBy){
        if(this.health >= 10){
            return;
        }else{
            this.health += addBy;
        }
    }

    /**
     * Method that reduces health from the players current health level
     * @param reduceBy the amount reduced from the players health
     */
    public void reduceHealth(int reduceBy){
        this.health -= reduceBy;
    }

    /**
     * Method that changes the size of the player
     * @param size the changed size of the player
     */
    public void changeSize(int size){
        this.size = size;
    }

    /**
     * Accessor that gets the boolean value if the player wants an object
     * @return the boolean value of if the player wants an object
     */
    public boolean getWant(){
        return want;
    }

    /**
     * Method that changes the boolean value of if the player wants an object
     */
    public void changeWant(){
        this.want = !want;
    }

    /**
     * Method that has the player interact with an object in their hands and prints a message
     * @param item the object in the players hand
     * @return prints a message saying the player is playing with the item
     */
    public String playWithItem(String item){
        return "I'm playing with " + item;
    }

    /**
     * Accessor that gets the boolean value of if the player can fly
     * @return the boolean value of if the player can fly
     */
    public boolean getCanFly(){
        return this.canFly;
    }

    /**
     * Accessor that gets the boolean value of if the player can walk
     * @return the boolean value of if the player can walk
     */
    public boolean getCanWalk(){
        return this.canWalk;
    }

    /**
     * Method that has the player walk in a given direction by displaying a method indicating the player is walking
     * @param direction the direction the player is walkinh in
     * @return a message if the player is walking or if they do not have the ability to walk
     */
    public boolean walk(String direction){
        if(this.getCanWalk()){
            System.out.println("We are walking in " + direction + " direction.");
            return true;
        }else{
            System.out.println("Sorry, you don't have the ability to walk.");
            return false;
        }
    }

    /**
     * Method that has the player fly based on x and y coordinates by displaying a message
     * @param x x coordinate for direction
     * @param y y coordinate for direction
     * @return the boolean value for if the player is flyinf
     */
    public boolean fly(int x, int y){
        if(this.getCanFly()){
            System.out.println("We are flying to (" + x + ", " + y + ").");
            return true;
        }else{
            System.out.println("Sorry, you don't have the ability to fly.");
            return false;
        }
    }




}
